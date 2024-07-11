package com.example.sysdb.service.impl;

import com.example.sysdb.dto.EmpleadoDTO;
import com.example.sysdb.entity.Empleado;
import com.example.sysdb.exception.ForeignKeyNotFoundException;
import com.example.sysdb.exception.ModelNotFoundException;
import com.example.sysdb.mapper.EmpleadoMapper;
import com.example.sysdb.repository.EmpleadoRepository;
import com.example.sysdb.service.EmpleadoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    private static final Logger log = LoggerFactory.getLogger(EmpleadoServiceImpl.class);

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public List<EmpleadoDTO> findAll() {
        List<EmpleadoDTO> empleados = new ArrayList<>();
        empleadoRepository.findAll().forEach(empleado -> {
            empleados.add(EmpleadoMapper.mapToDto(empleado));
        });
        return empleados;
    }

    @Override
    public EmpleadoDTO save(EmpleadoDTO empleadoDTO) {
        try {
            empleadoDTO.setFechaRegistro(LocalDateTime.now());
            Empleado empleadoSaved = empleadoRepository.save(EmpleadoMapper.mapToEntity(empleadoDTO));
            return EmpleadoMapper.mapToDto(empleadoSaved);
        }catch (Exception exception){
            log.error(exception.getMessage());
            throw new ForeignKeyNotFoundException(exception.getMessage());
        }
    }

    @Override
    public EmpleadoDTO findById(Long idEmpleado) {
        Empleado empleado = empleadoRepository.findById(idEmpleado).orElseThrow(
                () ->  new ModelNotFoundException("Cliente NO encontrado"));
        return EmpleadoMapper.mapToDto(empleado);
    }

    @Override
    public EmpleadoDTO deleteById(Long idEmpleado) {
        Empleado empleado = empleadoRepository.findById(idEmpleado).orElseThrow(
                () ->  new ModelNotFoundException("Cliente NO encontrado"));
        empleadoRepository.deleteById(idEmpleado);
        return EmpleadoMapper.mapToDto(empleado);
    }

    @Override
    public EmpleadoDTO updateById(Long idEmpleado, EmpleadoDTO empleadoDTO) {
        Empleado empleado = empleadoRepository.findById(idEmpleado).orElseThrow(
                () ->  new ModelNotFoundException("Cliente NO encontrado"));
        empleadoDTO.setIdEmpleado(idEmpleado);
        empleadoDTO.setFechaRegistro(empleado.getFechaRegistro());
        try {
            empleado = empleadoRepository.save(EmpleadoMapper.mapToEntity(empleadoDTO));
            return EmpleadoMapper.mapToDto(empleado);
        }catch (Exception exception){
            log.error(exception.getMessage());
            throw new ForeignKeyNotFoundException(exception.getMessage());
        }
    }
}

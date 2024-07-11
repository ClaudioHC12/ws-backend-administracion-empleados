package com.example.sysdb.service;

import com.example.sysdb.dto.EmpleadoDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmpleadoService {
    List<EmpleadoDTO> findAll();
    EmpleadoDTO save(EmpleadoDTO empleadoDTO);
    EmpleadoDTO findById(Long idEmpleado);
    EmpleadoDTO deleteById(Long idEmpleado);
    EmpleadoDTO updateById(Long idEmpleado, EmpleadoDTO empleadoDTO);
}

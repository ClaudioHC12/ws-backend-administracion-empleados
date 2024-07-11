package com.example.sysdb.mapper;

import com.example.sysdb.dto.EmpleadoDTO;
import com.example.sysdb.entity.Empleado;
import org.modelmapper.ModelMapper;

public class EmpleadoMapper {

    private static final ModelMapper modelMapper = new ModelMapper();

    public static EmpleadoDTO mapToDto(Empleado empleado){
        return modelMapper.map(empleado, EmpleadoDTO.class);
    }
    public static Empleado mapToEntity(EmpleadoDTO empleadoDTO){
        return modelMapper.map(empleadoDTO, Empleado.class);
    }
}

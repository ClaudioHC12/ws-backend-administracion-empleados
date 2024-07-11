package com.example.sysdb.mapper;

import com.example.sysdb.dto.EstadoDTO;
import com.example.sysdb.entity.Estado;
import org.modelmapper.ModelMapper;

public class EstadoMapper {

    private static final ModelMapper modelMapper = new ModelMapper();

    public static EstadoDTO mapToDto(Estado estado){
        return modelMapper.map(estado, EstadoDTO.class);
    }
    public static Estado mapToEntity(EstadoDTO estadoDTO){
        return modelMapper.map(estadoDTO, Estado.class);
    }
}

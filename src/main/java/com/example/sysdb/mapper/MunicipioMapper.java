package com.example.sysdb.mapper;

import com.example.sysdb.dto.MunicipioDTO;
import com.example.sysdb.entity.Municipio;
import org.modelmapper.ModelMapper;

public class MunicipioMapper {

    private static final ModelMapper modelMapper = new ModelMapper();

    public static MunicipioDTO mapToDto(Municipio municipio){
        return modelMapper.map(municipio, MunicipioDTO.class);
    }
    public static Municipio mapToEntity(MunicipioDTO municipioDTO){
        return modelMapper.map(municipioDTO, Municipio.class);
    }
}

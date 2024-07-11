package com.example.sysdb.service.impl;

import com.example.sysdb.dto.MunicipioDTO;
import com.example.sysdb.mapper.MunicipioMapper;
import com.example.sysdb.repository.MunicipioRepository;
import com.example.sysdb.service.MunicipioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MunicipioServiceImpl implements MunicipioService {

    @Autowired
    private MunicipioRepository municipioRepository;

    @Override
    public List<MunicipioDTO> findAll() {
        List<MunicipioDTO> municipios = new ArrayList<>();
        municipioRepository.findAll().forEach(municipio -> {
            municipios.add(MunicipioMapper.mapToDto(municipio));
        });
        return municipios;
    }

    @Override
    public List<MunicipioDTO> findByIdEstado(Long idEstado) {
        List<MunicipioDTO> municipios = new ArrayList<>();
        municipioRepository.findByIdEstado(idEstado).forEach(municipio -> {
            municipios.add(MunicipioMapper.mapToDto(municipio));
        });
        return municipios;
    }
}

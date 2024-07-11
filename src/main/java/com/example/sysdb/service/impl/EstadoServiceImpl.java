package com.example.sysdb.service.impl;

import com.example.sysdb.dto.EstadoDTO;
import com.example.sysdb.mapper.EstadoMapper;
import com.example.sysdb.repository.EstadoRepository;
import com.example.sysdb.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EstadoServiceImpl implements EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    @Override
    public List<EstadoDTO> findAll() {
        List<EstadoDTO> estados = new ArrayList<>();
        estadoRepository.findAll().forEach(estado -> {
            estados.add(EstadoMapper.mapToDto(estado));
        });
        return estados;
    }
}

package com.example.sysdb.service;

import com.example.sysdb.dto.MunicipioDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MunicipioService {
    List<MunicipioDTO> findAll();
    List<MunicipioDTO> findByIdEstado(Long idEstado);
}

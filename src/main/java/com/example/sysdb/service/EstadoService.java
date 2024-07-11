package com.example.sysdb.service;

import com.example.sysdb.dto.EstadoDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EstadoService {

    List<EstadoDTO> findAll();
}

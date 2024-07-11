package com.example.sysdb.controller;

import com.example.sysdb.dto.EstadoDTO;
import com.example.sysdb.dto.MunicipioDTO;
import com.example.sysdb.service.EstadoService;
import com.example.sysdb.service.MunicipioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estados")
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    @Autowired
    private MunicipioService municipioService;

    @GetMapping("")
    public ResponseEntity<List<EstadoDTO>> obtenerEstados(){
        return new ResponseEntity<>(estadoService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{idEstado:\\d+}/municipios")
    public ResponseEntity<List<MunicipioDTO>> consultarPorEstado(
            @PathVariable("idEstado") Long idEstado){
        return new ResponseEntity<>(municipioService.findByIdEstado(idEstado), HttpStatus.OK);
    }
}

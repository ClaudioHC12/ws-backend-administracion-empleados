package com.example.sysdb.controller;

import com.example.sysdb.dto.EmpleadoDTO;
import com.example.sysdb.service.EmpleadoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping("")
    public ResponseEntity<List<EmpleadoDTO>> obtenerEmpleados(){
        return new ResponseEntity<>(empleadoService.findAll(), HttpStatus.OK);
    }
    @PostMapping("")
    public ResponseEntity<EmpleadoDTO> registrarEmpleado(@RequestBody @Valid EmpleadoDTO empleadoDTO){
        return new ResponseEntity<>(empleadoService.save(empleadoDTO), HttpStatus.CREATED);
    }
    @GetMapping("/{id:\\d+}")
    public ResponseEntity<EmpleadoDTO> consultarEmpleadoPorId(@PathVariable("id") Long id){
        return new ResponseEntity<>(empleadoService.findById(id), HttpStatus.OK);
    }
    @DeleteMapping("/{id:\\d+}")
    public ResponseEntity<EmpleadoDTO> borrarEmpleado(@PathVariable("id") Long id) {
        return new ResponseEntity<>(empleadoService.deleteById(id), HttpStatus.OK);
    }
    @PutMapping("/{id:\\d+}")
    public ResponseEntity<EmpleadoDTO> actualizarEmpleado(
            @PathVariable Long id, @RequestBody @Valid EmpleadoDTO empleadoDTO){
        return new ResponseEntity<>(empleadoService.updateById(id, empleadoDTO), HttpStatus.OK);
    }
}

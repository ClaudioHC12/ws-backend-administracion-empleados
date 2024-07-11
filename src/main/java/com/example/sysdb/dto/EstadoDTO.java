package com.example.sysdb.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstadoDTO {
    private Long idEstado;
    @NotBlank(message = "campo nombre es obligatorio")
    private String nombre;
}

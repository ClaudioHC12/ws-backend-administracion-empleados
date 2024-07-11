package com.example.sysdb.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MunicipioDTO {
    private Long idMunicipio;
    @NotNull(message = "campo idEstado es obligatorio")
    private Long idEstado;
    @NotBlank(message = "campo nombre es obligatorio")
    private String nombre;
}

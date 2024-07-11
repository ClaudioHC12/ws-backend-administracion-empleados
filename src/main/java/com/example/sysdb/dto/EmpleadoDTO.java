package com.example.sysdb.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpleadoDTO {
    private Long idEmpleado;
    @NotBlank(message = "campo nombre es obligatorio")
    private String nombre;
    @Email(message = "campo email invalido")
    private String email;
    @NotNull(message = "campo fechaNacimiento es obligatorio")
    private LocalDate fechaNacimiento;
    @NotNull(message = "campo idEstado es obligatorio")
    private Long idEstado;
    @NotNull(message = "campo idMunicipio es obligatorio")
    private Long idMunicipio;
    //@NotNull(message = "campo fechaRegistro es obligatorio")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime fechaRegistro;
}

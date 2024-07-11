package com.example.sysdb.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "empleado")
public class Empleado implements Serializable {
    @Id
    @Column(name = "id_empleado", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmpleado;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "fecha_nacimiento", nullable = false)
    private LocalDate fechaNacimiento;
    @Column(name = "id_estado", nullable = false)
    private Long idEstado;
    @Column(name = "id_municipio", nullable = false)
    private Long idMunicipio;
    @Column(name = "fecha_registro", nullable = false)
    private LocalDateTime fechaRegistro;
}

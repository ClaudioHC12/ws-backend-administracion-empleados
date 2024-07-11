package com.example.sysdb.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "municipio")
public class Municipio implements Serializable {
    @Id
    @Column(name = "id_municipio", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMunicipio;
    @Column(name = "id_estado", nullable = false)
    private Long idEstado;
    @Column(name = "nombre", nullable = false)
    private String nombre;
}

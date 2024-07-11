package com.example.sysdb.repository;

import com.example.sysdb.entity.Estado;
import com.example.sysdb.entity.Municipio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MunicipioRepository extends JpaRepository<Municipio, Long> {

    List<Municipio> findByIdEstado(Long idEstado);
}

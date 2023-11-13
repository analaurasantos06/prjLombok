package com.ana.Lombok.prjLombok.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ana.Lombok.prjLombok.entites.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
 
}

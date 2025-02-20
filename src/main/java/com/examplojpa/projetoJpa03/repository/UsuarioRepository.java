package com.examplojpa.projetoJpa03.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examplojpa.projetoJpa03.entities.Usuario;

public interface UsuarioRepository extends JpaRepository< Usuario, Long> {
	
	// Nenhuma implementação é necessária. Spring Data JPA cuidará disso.

}

package com.examplojpa.projetoJpa03.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examplojpa.projetoJpa03.entities.Usuario;
import com.examplojpa.projetoJpa03.repository.UsuarioRepository;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    //construtor que recebe a dependencia
    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario saveUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario getUsuarioById(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public List<Usuario> getAllUsuario() {
        return usuarioRepository.findAll();
    }

    public void deleteUsuario(Long id) {
    	usuarioRepository.deleteById(id);
    }
}




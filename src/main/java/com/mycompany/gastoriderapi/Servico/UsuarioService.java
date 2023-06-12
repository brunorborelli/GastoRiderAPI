/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gastoriderapi.Servico;

import com.mycompany.gastoriderapi.DAO.UsuarioDao;
import com.mycompany.gastoriderapi.Modelos.Usuario;
import java.util.List;


public class UsuarioService {
    
    private final UsuarioDao usuarioDao;

    public UsuarioService(UsuarioDao usuarioDao) {
        this.usuarioDao = usuarioDao;
    }

    public List<Usuario> findAll() {
        return usuarioDao.findAll();
    }
    
       public Usuario findById(int id) {
        return usuarioDao.findById(id);
    }
    
public boolean cadastrarUsuario(Usuario usuario) {
    
    if (usuario.getNome() == null || usuario.getSobrenome() == null || usuario.getCpf() == null || usuario.getEmail() == null) {
        System.out.println("Erro: Os campos de nome, sobrenome, CPF e email são obrigatórios.");
        return false;
    }
    
    boolean cadastroBemSucedido = usuarioDao.cadastrarUsuario(usuario);
    
    if (cadastroBemSucedido) {
        System.out.println("Usuário cadastrado com sucesso!");
        return true;
    } else {
        System.out.println("Erro ao cadastrar o usuário. Por favor, tente novamente.");
        return false;
    }
  }
}
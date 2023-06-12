/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gastoriderapi.Controller;

import com.mycompany.gastoriderapi.Modelos.Usuario;
import com.mycompany.gastoriderapi.Servico.UsuarioService;
import java.util.List;

public class UsuarioController {
    
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

        public void exibirUsuarios() {
            List<Usuario> usuarios = usuarioService.findAll();
            for (Usuario usuario : usuarios) {
                  System.out.println("Nome: " + usuario.getNome());
                  System.out.println("Sobrenome: " + usuario.getSobrenome());
                  System.out.println("CPF: " + usuario.getCpf());
                  System.out.println("Gênero: " + usuario.getGenero());
                  System.out.println("Data de Nascimento: " + usuario.getDataNascimento());
                  System.out.println("Data de Cadastro: " + usuario.getDataCadastro());
                  System.out.println("Cidade: " + usuario.getCidade());
                  System.out.println("Estado: " + usuario.getEstado());
                  System.out.println("País: " + usuario.getPais());
                  System.out.println("Email: " + usuario.getEmail());
                  System.out.println("Senha: " + usuario.getSenha());
                  System.out.println("CNH: " + usuario.getCnh());
                  System.out.println("Tipo de CNH: " + usuario.getTipoCnh());
                  System.out.println("-----------------------------------------");
            }
        }
    
        public Usuario findById(int id) {
        Usuario usuario = usuarioService.findById(id);
        if (usuario != null) {
            System.out.println("Nome: " + usuario.getNome());
            System.out.println("Sobrenome: " + usuario.getSobrenome());
            System.out.println("CPF: " + usuario.getCpf());
            System.out.println("Gênero: " + usuario.getGenero());
            System.out.println("Data de Nascimento: " + usuario.getDataNascimento());
            System.out.println("Data de Cadastro: " + usuario.getDataCadastro());
            System.out.println("Cidade: " + usuario.getCidade());
            System.out.println("Estado: " + usuario.getEstado());
            System.out.println("País: " + usuario.getPais());
            System.out.println("Email: " + usuario.getEmail());
            System.out.println("Senha: " + usuario.getSenha());
            System.out.println("CNH: " + usuario.getCnh());
            System.out.println("Tipo de CNH: " + usuario.getTipoCnh());
            System.out.println("-----------------------------------------");
            
        } else {
            System.out.println("         ");
            System.out.println("#######################");
            System.out.println("Usuário não encontrado.");
            System.out.println("#######################");
            System.out.println("         ");
        }
        return usuario;
    }
        
    public boolean cadastrarUsuario(Usuario usuario) {
        if (!validarCamposObrigatorios(usuario)) {
            System.out.println("Campos obrigatórios estão faltando.");
            return false;
        }

        boolean cadastrado = usuarioService.cadastrarUsuario(usuario);
        if (cadastrado) {
            System.out.println("Usuário cadastrado com sucesso!");
        } else {
            System.out.println("Erro ao cadastrar usuário. Tente novamente.");
        }
        return cadastrado;
    }

    private boolean validarCamposObrigatorios(Usuario usuario) {
        if (usuario.getNome() == null || usuario.getNome().isEmpty()) {
            return false;
        }
        if (usuario.getSobrenome() == null || usuario.getSobrenome().isEmpty()) {
            return false;
        }
        if (usuario.getCpf() == null || usuario.getCpf().isEmpty()) {
            return false;
        }
        if (usuario.getEmail() == null || usuario.getEmail().isEmpty()) {
            return false;
        }
        return true;
    }
}


    


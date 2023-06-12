/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gastoriderapi;

import com.mycompany.gastoriderapi.Controller.UsuarioController;
import com.mycompany.gastoriderapi.DAO.UsuarioDao;
import com.mycompany.gastoriderapi.Modelos.Usuario;
import com.mycompany.gastoriderapi.Servico.UsuarioService;
import java.util.List;
import java.util.Scanner;

public class OperacoesIniciais {
    
    private UsuarioService usuarioService;
    private UsuarioController usuarioController;
    private UsuarioDao usuarioDao;

    public OperacoesIniciais(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }



public static void exibirMenu() {
    UsuarioDao usuarioDao = new UsuarioDao();
    UsuarioService usuarioService = new UsuarioService(usuarioDao);
    UsuarioController usuarioController = new UsuarioController(usuarioService);
    Scanner scanner = new Scanner(System.in);
    int opcao = 0;

    while (opcao != 4) {
        System.out.println("=== Menu de Opções ===");
        System.out.println("1. Exibir todos os usuários");
        System.out.println("2. Buscar usuário por ID");
        System.out.println("3. Cadastrar novo usuário");
        System.out.println("4. Sair");
        System.out.print("Digite a opção desejada: ");
        opcao = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        switch (opcao) {
            case 1:
                usuarioController.exibirUsuarios();
                break;
            case 2:
                System.out.print("Digite o ID do usuário: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer
                Usuario usuario = usuarioController.findById(id);
                if (usuario != null) {
                    System.out.println("Usuário encontrado:");
                    System.out.println(usuario);
                } else {
                    System.out.println("Usuário não encontrado.");
                }
                break;
            case 3:
                Usuario novoUsuario = lerDadosUsuario(scanner);
                boolean cadastrado = usuarioController.cadastrarUsuario(novoUsuario);
                if (cadastrado) {
                    System.out.println("Usuário cadastrado com sucesso!");
                } else {
                    System.out.println("Erro ao cadastrar usuário. Tente novamente.");
                }
                break;
            case 4:
                System.out.println("Encerrando o programa.");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }
    }

    scanner.close();
}
    private static Usuario lerDadosUsuario(Scanner scanner) {
        Usuario usuario = new Usuario();

        System.out.println("Digite os dados do usuário:");
        System.out.print("Nome: ");
        usuario.setNome(scanner.nextLine());

        System.out.print("Sobrenome: ");
        usuario.setSobrenome(scanner.nextLine());

        System.out.print("CPF: ");
        usuario.setCpf(scanner.nextLine());

        System.out.print("Email: ");
        usuario.setEmail(scanner.nextLine());

        return usuario;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gastoriderapi.DAO;

import com.mycompany.gastoriderapi.Modelos.Usuario;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDao implements IUsuarioDao {

//    private final String jdbcUrl = "jdbc:postgresql://localhost:5432/autoMobileDB";
//    private final String username = "postgres";
//    private final String password = "root";
//    
    
    // Metodo findAll
    
    @Override
    public List<Usuario> findAll() {
            List<Usuario> usuarios = new ArrayList<>();
        
        
            Properties prop = new Properties();
            try {
                prop.load(new FileInputStream("./src/main/java/Resources/ApplicationProperties.txt"));
            } catch (IOException ex) {
                Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            }

            String jdbcUrl = prop.getProperty("jdbcUrl");
            String username = prop.getProperty("username");
            String password = prop.getProperty("password");

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            String sql = "SELECT * FROM usuario";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(resultSet.getInt("Id"));
                usuario.setCpf(resultSet.getString("CPF"));
                usuario.setNome(resultSet.getString("Nome"));
                usuario.setSobrenome(resultSet.getString("Sobrenome"));
                usuario.setGenero(resultSet.getString("Genero"));
                usuario.setDataNascimento(resultSet.getString("DataNascimento"));
                usuario.setDataCadastro(resultSet.getString("DataCadastro"));
                usuario.setCidade(resultSet.getString("Cidade"));
                usuario.setEstado(resultSet.getString("Estado"));
                usuario.setPais(resultSet.getString("Pais"));
                usuario.setEmail(resultSet.getString("Email"));
                usuario.setSenha(resultSet.getString("Senha"));
                usuario.setCnh(resultSet.getString("CNH"));
                usuario.setTipoCnh(resultSet.getString("TipoCNH"));
                

                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        

        return usuarios;
    }
    
    @Override
    public Usuario findById(int id) {
        Usuario usuario = null;

        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream("./src/main/java/Resources/ApplicationProperties.txt"));
        } catch (IOException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        String jdbcUrl = prop.getProperty("jdbcUrl");
        String username = prop.getProperty("username");
        String password = prop.getProperty("password");

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            String sql = "SELECT * FROM usuario WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                usuario = new Usuario();
                usuario.setId(resultSet.getInt("Id"));
                usuario.setCpf(resultSet.getString("CPF"));
                usuario.setNome(resultSet.getString("Nome"));
                usuario.setSobrenome(resultSet.getString("Sobrenome"));
                usuario.setGenero(resultSet.getString("Genero"));
                usuario.setDataNascimento(resultSet.getString("DataNascimento"));
                usuario.setDataCadastro(resultSet.getString("DataCadastro"));
                usuario.setCidade(resultSet.getString("Cidade"));
                usuario.setEstado(resultSet.getString("Estado"));
                usuario.setPais(resultSet.getString("Pais"));
                usuario.setEmail(resultSet.getString("Email"));
                usuario.setSenha(resultSet.getString("Senha"));
                usuario.setCnh(resultSet.getString("CNH"));
                usuario.setTipoCnh(resultSet.getString("TipoCNH"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuario;
     }
    
    @Override
    public boolean cadastrarUsuario(Usuario usuario) {
        boolean cadastradoComSucesso = false;

        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream("./src/main/java/Resources/ApplicationProperties.txt"));
        } catch (IOException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        String jdbcUrl = prop.getProperty("jdbcUrl");
        String username = prop.getProperty("username");
        String password = prop.getProperty("password");

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            String sql = "INSERT INTO usuario (cpf, nome, sobrenome, genero, dataNascimento, dataCadastro, cidade, estado, pais, email, senha, cnh, tipo_cnh) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, usuario.getCpf());
            statement.setString(2, usuario.getNome());
            statement.setString(3, usuario.getSobrenome());
            statement.setString(4, usuario.getGenero());
            statement.setString(5, usuario.getDataNascimento());
            statement.setString(6, usuario.getDataCadastro());
            statement.setString(7, usuario.getCidade());
            statement.setString(8, usuario.getEstado());
            statement.setString(9, usuario.getPais());
            statement.setString(10, usuario.getEmail());
            statement.setString(11, usuario.getSenha());
            statement.setString(12, usuario.getCnh());
            statement.setString(13, usuario.getTipoCnh());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                cadastradoComSucesso = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cadastradoComSucesso;
    }
}

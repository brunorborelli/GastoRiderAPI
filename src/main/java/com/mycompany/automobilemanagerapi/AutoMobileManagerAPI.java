/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.automobilemanagerapi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AutoMobileManagerAPI {


    public static void main(String[] args) {
        
                
    //Endereço e Credenciais do banco de dados
    String jdbcUrl = "jdbc:postgresql://localhost:5432/autoMobileDB";
    String username = "postgres";
    String password = "root";
    
    //Caminho carga inicial e proxima carga
    String cargaInicial = "C:\\Users\\bruno\\OneDrive\\Documentos\\NetBeansProjects\\AutoMobileManagerAPI\\src\\main\\java\\DB\\cargaInicial.sql" ;
        
    try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
        System.out.println("Conexão bem-sucedida!");
        
        BufferedReader reader = new BufferedReader(new FileReader(cargaInicial));
        String line;
        StringBuilder script = new StringBuilder();

        // Concatena cada linha em um único script SQL
        while ((line = reader.readLine()) != null) {
            script.append(line);
            script.append("\n");
        }

        // Divide o script em várias instruções SQL separadas
        String[] statements = script.toString().split(";");

        // Executa cada instrução SQL
        for (String sql : statements) {
            if (!sql.trim().isEmpty()) {
                Statement statement = connection.createStatement();
                statement.executeUpdate(sql);
            }
        }

        System.out.println("Scripts executados com sucesso!");
    } catch (SQLException e) {
        System.out.println("Falha na conexão com o banco de dados: " + e.getMessage());
        e.printStackTrace();
    } catch (FileNotFoundException e) {
        System.out.println("Arquivo de carga inicial não encontrado: " + e.getMessage());
        e.printStackTrace();
    } catch (IOException e) {
        System.out.println("Falha ao ler o arquivo de carga inicial: " + e.getMessage());
        e.printStackTrace();
    }
}
}
            
            //------------------------------Start 'Hard Test Insert'-------------------------------------//
//            String sqlInsert = "INSERT INTO carros (descricao, status) VALUES (?, ?)";;
//            PreparedStatement statement2 = connection.prepareStatement(sqlInsert);
//            statement2.setString(1, "Kombi");
//            statement2.setInt(2,1);
//
//            int rowsInserted = statement2.executeUpdate();
//            if (rowsInserted > 0) {
//                System.out.println("Registro inserido com sucesso!");
//            }
            //------------------------------End 'Hard Test Insert'---------------------------------------//
           
            //------------------------------Start 'Hard Test Get'----------------------------------------//
            
//            String sqlGet = "SELECT id, descricao, status FROM carros";
//            PreparedStatement statement1 = connection.prepareStatement(sqlGet);
//            ResultSet result = statement1.executeQuery();
//            
//              while (result.next()) {
//                long id = result.getLong("id");
//                String descricao = result.getString("descricao");
//                boolean status = result.getBoolean("status");
//
//                System.out.println("Carro ID: " + id + ", Descrição: " + descricao + ", Status: " + status);
//            }
            //------------------------------End 'Hard Test Get'-----------------------------------------//
            

            
            //------------------------------Start 'Hard Test Delete'------------------------------------//
            
//            String sqlDelete = "DELETE FROM carros WHERE id = ?";
//            PreparedStatement statement3 = connection.prepareStatement(sqlDelete);
//            statement3.setLong(1, 5L); // Valor do ID a ser excluído
//
//            int rowsDeleted = statement3.executeUpdate();
//            if (rowsDeleted > 0) {
//                System.out.println("Registro excluído com sucesso!");
//            } else {
//                System.out.println("Nenhum registro foi excluído.");
//            }
            
            //------------------------------End 'Hard Test Delete'--------------------------------------//
            
            //------------------------------Start 'Hard Test Update'------------------------------------//
            
//            String sqlUpdate = "UPDATE carros SET status = ? WHERE id = ?";
//            PreparedStatement statement = connection.prepareStatement(sqlUpdate);
//            statement.setInt(1, 0); // Novo valor do campo 'status'
//            statement.setLong(2, 2L); // Valor do ID do registro a ser atualizado
//
//            int rowsUpdated = statement.executeUpdate();
//            if (rowsUpdated > 0) {
//                System.out.println("Registro atualizado com sucesso!");
//            } else {
//                System.out.println("Nenhum registro foi atualizado.");
//            }
            
            //------------------------------End 'Hard Test Update'--------------------------------------//
            

        



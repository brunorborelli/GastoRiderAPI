/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 *
 * @author bruno
 */
public class DataBaseConnection {
    
        public static void Conexao() throws FileNotFoundException, IOException{
        // Carrega as propriedades do arquivo
        Properties properties = new Properties();
        properties.load(new FileInputStream("./src/main/java/Resources/ApplicationProperties.txt"));

        // Obtém as informações de conexão a partir das propriedades
        String jdbcUrl = properties.getProperty("jdbcUrl");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        // Caminho carga inicial e proxima carga
        String cargaInicial = "./src/main/java/DB/cargaInicial.sql";

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
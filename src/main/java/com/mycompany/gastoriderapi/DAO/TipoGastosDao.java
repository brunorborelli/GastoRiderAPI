/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gastoriderapi.DAO;

import com.mycompany.gastoriderapi.Modelos.TipoGastos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TipoGastosDao implements ITipoGastosDao {
    
    private final String jdbcUrl = "jdbc:postgresql://localhost:5432/autoMobileDB";
    private final String username = "postgres";
    private final String password = "root";

    @Override
    public List<TipoGastos> listarTiposGastos() {
        List<TipoGastos> tiposGastos = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            String query = "SELECT * FROM tipo_gastos";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String tipoGasto = resultSet.getString("tipo_gasto");
                String descricao = resultSet.getString("descricao");

                TipoGastos tipo = new TipoGastos(id, tipoGasto, descricao);
                tiposGastos.add(tipo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tiposGastos;
    }

    @Override
    public TipoGastos obterTipoGastosPorId(int id) {
        TipoGastos tipoGasto = null;

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            String query = "SELECT * FROM tipo_gastos WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String tipoGastoStr = resultSet.getString("tipo_gasto");
                String descricao = resultSet.getString("descricao");

                tipoGasto = new TipoGastos(id, tipoGastoStr, descricao);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tipoGasto;
    }

    @Override
    public void adicionarTipoGastos(TipoGastos tipoGastos) {
        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            String query = "INSERT INTO tipo_gastos (tipo_gasto, descricao) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, tipoGastos.getTipoGasto());
            statement.setString(2, tipoGastos.getDescricao());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizarTipoGastos(TipoGastos tipoGastos) {
        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            String query = "UPDATE tipo_gastos SET tipo_gasto = ?, descricao = ? WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, tipoGastos.getTipoGasto());
            statement.setString(2, tipoGastos.getDescricao());
            statement.setInt(3, tipoGastos.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void excluirTipoGastos(int id) {
        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            String query = "DELETE FROM tipo_gastos WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
         
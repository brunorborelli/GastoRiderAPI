/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.gastoriderapi.DAO;

import com.mycompany.gastoriderapi.Modelos.TipoGastos;
import java.util.List;

public interface ITipoGastosDao {
    List<TipoGastos> listarTiposGastos();
    TipoGastos obterTipoGastosPorId(int id);
    void adicionarTipoGastos(TipoGastos tipoGasto);
    void atualizarTipoGastos(TipoGastos tipoGasto);
    void excluirTipoGastos(int id);
}

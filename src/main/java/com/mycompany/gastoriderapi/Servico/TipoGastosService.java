/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gastoriderapi.Servico;


import com.mycompany.gastoriderapi.Modelos.TipoGastos;
import java.util.List;

import com.mycompany.gastoriderapi.DAO.ITipoGastosDao;
import com.mycompany.gastoriderapi.DAO.TipoGastosDao;

public class TipoGastosService {
    private TipoGastosDao tipoGastosDao;

    public TipoGastosService() {
        this.tipoGastosDao = new TipoGastosDao();
    }

    public TipoGastosService(TipoGastosDao tipoGastosDao) {
        this.tipoGastosDao = new TipoGastosDao();
    }

    public List<TipoGastos> listarTiposGastos() {
        return tipoGastosDao.listarTiposGastos();
    }

    public TipoGastos obterTipoGastosPorId(int id) {
        return tipoGastosDao.obterTipoGastosPorId(id);
    }

    public void adicionarTipoGastos(TipoGastos tipoGastos) {
        tipoGastosDao.adicionarTipoGastos(tipoGastos);
    }

    public void atualizarTipoGastos(TipoGastos tipoGastos) {
        tipoGastosDao.atualizarTipoGastos(tipoGastos);
    }

    public void excluirTipoGastos(int id) {
        tipoGastosDao.excluirTipoGastos(id);
    }
}

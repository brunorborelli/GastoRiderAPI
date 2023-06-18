/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gastoriderapi.Controller;

import com.mycompany.gastoriderapi.Modelos.TipoGastos;
import com.mycompany.gastoriderapi.Servico.TipoGastosService;
import java.util.List;

public class TipoGastosController {
    
    private TipoGastosService tipoGastosService;
    

//    public TipoGastosController() {
//        this.tipoGastosService = new TipoGastosService();
//    }

    public TipoGastosController(TipoGastosService tipoGastosService) {
    this.tipoGastosService = tipoGastosService;
    }

  
        
    

    public List<TipoGastos> listarTiposGastos() {
        return tipoGastosService.listarTiposGastos();
    }

    public TipoGastos obterTipoGastoPorId(int id) {
        return tipoGastosService.obterTipoGastosPorId(id);
    }

    public void adicionarTipoGasto(TipoGastos tipoGastos) {
        tipoGastosService.adicionarTipoGastos(tipoGastos);
    }

    public void atualizarTipoGasto(TipoGastos tipoGastos) {
        tipoGastosService.atualizarTipoGastos(tipoGastos);
    }

    public void excluirTipoGastos(int id) {
        tipoGastosService.excluirTipoGastos(id);
    }
}

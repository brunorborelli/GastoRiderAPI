/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.gastoriderapi.DAO;

import com.mycompany.gastoriderapi.Modelos.Usuario;
import java.util.List;

public interface IUsuarioDao {
    
    List<Usuario> findAll();
    Usuario findById(int id);
    boolean cadastrarUsuario(Usuario usuario);
    
}

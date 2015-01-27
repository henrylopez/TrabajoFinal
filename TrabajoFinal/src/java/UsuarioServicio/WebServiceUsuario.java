/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsuarioServicio;

import UsuarioDAO.*;
import UsuariosBean.*;
//import UsuarioDAO.AgregarUsuarioDAO;
//import UsuarioDAO.ListarUsuarioDAO;
import java.sql.SQLException;
import javax.jws.WebService;

/**
 *
 * @author PE-ITHLOPEZ
 */
@WebService
public class WebServiceUsuario {

    public void ListarUsuario() throws SQLException {
        ListarUsuarioDAO listar = new ListarUsuarioDAO();
        listar.ListarUsuarios();
    }

    public static void main(String[] args) throws SQLException {
   AgregarUsuarioDAO agregar = new AgregarUsuarioDAO();
        usuarios nuevo = null;

        agregar.AgregarUser2("Henry", "Lopez", "hlopez", "Passw0rd", "4294006", "MiEmpresa", "Act");
    }
    /*public void AgregararUsuario() throws SQLException {
        AgregarUsuarioDAO agregar = new AgregarUsuarioDAO();
        usuarios nuevo = null;

        agregar.AgregarUser2("Henry", "Lopez", "hlopez", "Passw0rd", "4294006", "MiEmpresa", "Act");
    }*/
}

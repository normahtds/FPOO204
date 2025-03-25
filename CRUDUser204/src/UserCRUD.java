/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hanar
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class UserCRUD {
    
    //metodo para Consultar ID
    public ResultSet buscarPorId(int id){
        String sqlBuscar = "SELECT * FROM usuarios WHERE id= ?";
        
        try{//manejo de excepciones
            PreparedStatement ps= conexion.prepareStatement(sqlBuscar);
            ps.setInt(1,id);
            return ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error al buscar por Id "+ e.getMessage());
            return null;
            
        }
    }//fin de la consulta ID
    
    public ResultSet obtenerTodos (){
        
        String sqlTodos="SELECT * FROM usuarios";
        
        try{
            PreparedStatement ps= conexion.prepareStatement(sqlTodos);
            return ps.executeQuery(); //es donde regresa la consulta de todos
        }
        catch(SQLException s){
            System.out.println("Error al consultar todos"+ s.getMenssage());
            return null;
        }
        
    }//fin de obtener todos
}

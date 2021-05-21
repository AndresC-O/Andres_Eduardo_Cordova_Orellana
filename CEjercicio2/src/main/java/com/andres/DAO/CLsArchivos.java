package com.andres.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.andres.Conexion.ConexionBd;

public class CLsArchivos {

	public void GuardarArchivos(String nombre) {
		try {
			ConexionBd con = new ConexionBd();
			PreparedStatement statement;
			String consulta = "insert into image(nameoffile) value(?)";
			statement = con.RetornarConexion().prepareStatement(consulta);
			statement.setString(1, nombre);
			
			statement.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("Error " + e);
		}
	}
	
	public String MostrarArchivo(String name){
		
		String lista = "";
		try {
			ConexionBd con = new ConexionBd();
			PreparedStatement statement;
			String consulta = "select * from image where nameoffile = ?";
			statement = con.RetornarConexion().prepareStatement(consulta);
			statement.setString(1, name);
			ResultSet result = statement.executeQuery();
			
			while(result.next()) {
				lista = result.getString("nameoffile");
			}
			
		} catch (Exception e) {
			System.out.println("Error en el CLS " + e);
		}
		return lista;
	}
}

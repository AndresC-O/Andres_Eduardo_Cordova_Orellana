package com.andres.Negocio;

import com.andres.DAO.ClsLoginBD;
import com.andres.Entidades.Login;
import com.andres.Entidades.usuario;

public class clsLogin {

	public int acceso(usuario log) {
		int acceso = 0;
		ClsLoginBD clsLoginBD = new ClsLoginBD();
		usuario user = new usuario();
		
		user = clsLoginBD.ValidarLogin(log);
		if (user != null) {
			if (user.getIdTipoUsuario() == 1) {
				acceso = 1;
				System.out.println(user.getIdTipoUsuario());
			} else if (user.getIdTipoUsuario() == 2) {
				acceso = 2;
				System.out.println(user.getIdTipoUsuario());
			}
		} else {
			System.out.println("El usuario no existe");
		}
		return acceso;
	}
}

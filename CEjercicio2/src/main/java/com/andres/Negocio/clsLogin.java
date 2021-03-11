package com.andres.Negocio;

import com.andres.Entidades.Login;

public class clsLogin {

	public int acceso(Login log) {
		int acceso = 0;
		if (log.getUser().equals("andres") && log.getPass().equals("123")) {
			acceso = 1;
		} else {

		}
		return acceso;
	}
}

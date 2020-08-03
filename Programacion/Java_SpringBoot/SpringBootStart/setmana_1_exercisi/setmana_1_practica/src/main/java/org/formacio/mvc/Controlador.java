package org.formacio.mvc;

import org.formacio.component.ServeiAlumnat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class Controlador {

	@Autowired
	private ServeiAlumnat servei;
	
	public ServeiAlumnat getServei() {
		return servei;
	}
	
	@RequestMapping(path="/alumnes")
	@ResponseBody
	public int numAlumnes() {
		return servei.getSizeAlumnes();
	}
	
}
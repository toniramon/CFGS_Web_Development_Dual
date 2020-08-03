package org.formacio.mvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/personal")
public class PersonalController {

	// no toqueu la declaracio de baseDeDades ni el metode getBaseDeDades
	// 
	// als metodes que anau afegint, tracteu aquest array com si fos la base de dades
	//
	// per exemple, obtenir la persona amb id 1 sera fer baseDeDades.get(1), etc etc 
	
	private List<String> baseDeDades = new ArrayList<>(Arrays.asList("Joana","Antonia","Pere"));
	
	public List<String> getBaseDeDades() {
		return baseDeDades;
	}

	// Poseu a partir d'aqui els vostre metodes
	@RequestMapping(path="/info")
	@ResponseBody
	public String info() {
		return "Hi ha " + getBaseDeDades().size() + " persones";
	}
	
	@RequestMapping(path="/consulta")
	@ResponseBody
	public String posicionPersona(@RequestParam(name="id", required=false, defaultValue="0")int id) {
		try {
			return this.getBaseDeDades().get(id);
		}
		catch(IndexOutOfBoundsException exception) {
			return "No existe esa persona";
		}
	}
	
	@RequestMapping(path="/persona/{id}")
	@ResponseBody
	public String posicionPersonaRest(@PathVariable int id) {
		try {
			return this.getBaseDeDades().get(id);
		}
		catch(IndexOutOfBoundsException exception) {
			return "No existe esa persona";
		}
	}
	
	@RequestMapping(path="/afegir", method=RequestMethod.POST)
	@ResponseBody
	public String añadirPersona(@RequestParam String nom) {
		this.getBaseDeDades().add(nom);
		return "ok";
	}
	
}

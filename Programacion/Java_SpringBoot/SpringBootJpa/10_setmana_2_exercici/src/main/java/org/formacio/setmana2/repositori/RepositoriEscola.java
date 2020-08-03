package org.formacio.setmana2.repositori;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.formacio.setmana2.domini.Alumne;
import org.formacio.setmana2.domini.Curs;
import org.formacio.setmana2.domini.Matricula;
import org.springframework.stereotype.Component;

/**
 * Modifica aquesta classe per tal que sigui un component Spring que realitza les 
 * operacions de persistencia tal com indiquen les firmes dels metodes
 */
@Component
public class RepositoriEscola {

	@PersistenceContext
	private EntityManager em;
	
	public Curs carregaCurs(String nom) {
		return em.find(Curs.class, nom);
	}
	
	
	public Matricula apunta (String alumne, String curs) throws EdatIncorrecteException {
	    
	    Alumne user = em.find(Alumne.class, alumne);
	    Curs course = this.carregaCurs(curs);
	   
		Matricula matricula = new Matricula();

	    if(user.getEdat() >= course.getEdatMinima()){
	    	matricula.setAlumne(user);
	    	matricula.setCurs(course);
		    em.persist(matricula);
	    }
	    else{
	    	throw new EdatIncorrecteException();
	    }
	    
	    return matricula;
	    	    
	}
	
	
}

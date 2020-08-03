package org.formacio.repositori;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.Query;

import org.formacio.domain.Persona;
import org.springframework.stereotype.Repository;

@Repository
public class InformesCens {

	@PersistenceContext
	EntityManager em = null;
	
	/**
	 * Retorna la llista de persones que viuen al municipi indicat
	 */
	public List<Persona> habitantsMunicipi(String municipi) {
		TypedQuery<Persona> habitants = em.createQuery("select persona from Persona persona where persona.municipi.nom = :municipi ", Persona.class);
		habitants.setParameter("municipi", municipi);
		List<Persona> resultat = habitants.getResultList();
		return  resultat;
	}

	/**
	 * Retorna el nombre d'habitants de la illa
	 */
	public int nombreHabitantsIlla(String illa) {
		TypedQuery<Persona> habitants = em.createQuery("select persona from Persona persona where persona.municipi.illa.nom = :illa ", Persona.class);
		habitants.setParameter("illa", illa);
		List<Persona> resultat = habitants.getResultList();
		return  resultat.size();
	}
	
	/**
	 * Retorna el nombre d'habitants del municipi que son menors d'edat
	 */
	public int nombreHabitantsMenorsEdat(String municipi) {
		TypedQuery<Persona> habitants = em.createQuery("select persona from Persona persona where persona.edat < 18 and persona.municipi.nom = :municipi", Persona.class);
		habitants.setParameter("municipi", municipi);
		List<Persona> resultat = habitants.getResultList();
		return resultat.size();
	}

	/**
	 * Retorna la llista de persones que no tenen informat de quin municipi son
	 */
	public List<Persona> llistaPersonesSenseMunicipi() {
		TypedQuery<Persona> habitants = em.createQuery("select persona from Persona persona where persona.municipi = null", Persona.class);
		List<Persona> resultat = habitants.getResultList();
		return resultat;
    }

	/**
	 * Retorna la llista de noms de persones d'una illa ordenats per l'edat
	 * siii, ja ho se ..., no hem vist com ordenar, pero emprau order by i la vostra intuicio ;-)
	 */
	public List<String> llistaNomsPersonesOrdenatPerEdat(String illa) {
		Query habitantes = em.createQuery("select persona.nom from Persona persona where persona.municipi.illa.nom =:illa order by persona.edat");
		habitantes.setParameter("illa", illa);
		return  habitantes.getResultList();
    }
	
}

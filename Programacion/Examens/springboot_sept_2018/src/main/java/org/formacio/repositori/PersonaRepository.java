package org.formacio.repositori;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

import org.formacio.domain.Persona;

@RepositoryRestResource(collectionResourceRel = "persones", path="persona")
public interface PersonaRepository extends CrudRepository<Persona, Long>  {

	Optional<Persona> findById(Long Id);
}

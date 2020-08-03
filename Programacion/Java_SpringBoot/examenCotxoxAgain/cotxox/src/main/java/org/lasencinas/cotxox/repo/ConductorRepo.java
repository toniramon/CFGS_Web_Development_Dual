package org.lasencinas.cotxox.repo;


import java.util.Optional;

import org.lasencinas.cotxox.domain.Conductor;
import org.springframework.data.repository.CrudRepository;


public interface ConductorRepo extends CrudRepository<Conductor, Long>{
	
	Optional<Conductor> findByTarjeta(String tarjeta);
	
}

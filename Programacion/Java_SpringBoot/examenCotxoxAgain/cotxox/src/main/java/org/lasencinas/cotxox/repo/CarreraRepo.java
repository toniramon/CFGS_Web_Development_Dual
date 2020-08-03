package org.lasencinas.cotxox.repo;

import java.util.Optional;

import org.lasencinas.cotxox.domain.Carrera;
import org.springframework.data.repository.CrudRepository;


public interface CarreraRepo extends CrudRepository<Carrera, Long>{
	
	Optional<Carrera> findByTarjetaCredito(String c_tarjeta_credito);
	Optional<Carrera> findById(Long c_Id);
}

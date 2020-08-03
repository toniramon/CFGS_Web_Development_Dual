package org.lasencinas.cotxox.service;

import org.lasencinas.cotxox.domain.Carrera;
import org.lasencinas.cotxox.repo.CarreraRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarreraService {
	
	@Autowired
	private CarreraRepo carreraRepo;
	
	public CarreraRepo getCarreraRepo() {
		return this.carreraRepo;
	}

	public Long crearCarrera(String c_tarjeta_credito, String c_origen, String c_destino, int c_distancia, int c_tiempo_esperado) {
		Carrera carrera = new Carrera(c_tarjeta_credito);
		carrera.setOrigen(c_origen);
		carrera.setDestino(c_destino);
		carrera.setDistancia(c_distancia);
		carrera.setTiempoEsperado(c_tiempo_esperado);
		getCarreraRepo().save(carrera);
		return getCarreraRepo().findByTarjetaCredito(c_tarjeta_credito).get().getId();
	}

	public Carrera recuperaCarrera(Long idCarrera) {
		return getCarreraRepo().findById(idCarrera).get();
	}

}

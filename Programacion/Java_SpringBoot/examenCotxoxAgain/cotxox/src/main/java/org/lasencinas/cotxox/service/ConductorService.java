package org.lasencinas.cotxox.service;

import javax.annotation.PostConstruct;

import org.lasencinas.cotxox.domain.Conductor;
import org.lasencinas.cotxox.repo.ConductorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConductorService {
	
	@Autowired
	private ConductorRepo conductorRepo;
	
	public ConductorRepo getConductorRepo() {
		return this.conductorRepo;
	}
	
	public Conductor recuperarConductor(String tarjeta) {
		return conductorRepo.findByTarjeta(tarjeta).get();
	}
	
	public void crearConductor(String tarjeta, String nombre, String matricula, String modelo) {
		Conductor conductor = new Conductor(tarjeta);
		conductor.setNombre(nombre);
		conductor.setMatricula(matricula);
		conductor.setModelo(modelo);
		conductor.setOcupado(false);
		getConductorRepo().save(conductor);
	}
	
    public void init(){
		String[] tarjetas = {"2222222222222222", "3333333333333333"};
		String[] nombres = {"Sabrina", "Cici"};
		String[] matricula = {"5DHJ444", "7JKK555"};
		String[] modelos = {"Toyota Prius", "Mercedes A"};

        for(int i = 0 ; i< nombres.length ; i++){
        	crearConductor(tarjetas[i], nombres[i], matricula[i], modelos[i]);
        }
    }
}

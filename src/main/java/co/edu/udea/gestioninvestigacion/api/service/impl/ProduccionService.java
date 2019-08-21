package co.edu.udea.gestioninvestigacion.api.service.impl;

import co.edu.udea.gestioninvestigacion.api.model.Produccion;
import co.edu.udea.gestioninvestigacion.api.repository.ProduccionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduccionService implements ProduccionServiceInt{

    private ProduccionRepository produccionRepository;

    public ProduccionService(ProduccionRepository produccionRepository){
        this.produccionRepository = produccionRepository;
    }

    public List<Produccion> getProducciones(){return produccionRepository.findAll();}
}
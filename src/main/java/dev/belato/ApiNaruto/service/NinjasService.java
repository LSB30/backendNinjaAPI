package dev.belato.ApiNaruto.service;

import dev.belato.ApiNaruto.models.Ninjas;
import dev.belato.ApiNaruto.repository.NinjasRepository;
import org.springframework.stereotype.Service;

@Service
public class NinjasService {
    private final NinjasRepository repository;

    public NinjasService(NinjasRepository repository) {
        this.repository = repository;
    }

    public Ninjas addNinjas(Ninjas ninja) {
        return repository.save(ninja);
    }
}

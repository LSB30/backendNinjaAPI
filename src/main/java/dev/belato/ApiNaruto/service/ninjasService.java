package dev.belato.ApiNaruto.service;

import dev.belato.ApiNaruto.models.ninjas;
import dev.belato.ApiNaruto.repository.ninjasRepository;

public class ninjasService {
    private ninjasRepository repository;

    public ninjasService(ninjasRepository repository) {
        this.repository = repository;
    }

    public ninjas addNinja(ninjas ninjas) {
        return repository.save(ninjas);
    }
}

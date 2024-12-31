package dev.belato.ApiNaruto.service;

import dev.belato.ApiNaruto.dto.NinjaUpdateDto;
import dev.belato.ApiNaruto.models.Ninjas;
import dev.belato.ApiNaruto.repository.NinjasRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class NinjasService {
    private final NinjasRepository repository;

    public NinjasService(NinjasRepository repository) {
        this.repository = repository;
    }

    public Ninjas addNinjas(Ninjas ninja) {
        return repository.save(ninja);

    }

    public List<Ninjas> showListNinjas() {
        return repository.findAll();
    }

    public Optional<Ninjas> updateNinja(String id, NinjaUpdateDto ninjaDto) {
        var rowsAffected = repository.updateNinja(id, ninjaDto.name(),ninjaDto.village(), ninjaDto.age(), ninjaDto.element(), ninjaDto.imgUrl());

        if(rowsAffected == 0) {
            throw new EntityNotFoundException("Ninja not found to ID:" + id);
        }

        return repository.findById(id);
    }
}

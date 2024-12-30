package dev.belato.ApiNaruto.repository;

import dev.belato.ApiNaruto.models.Ninjas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface NinjasRepository extends JpaRepository<Ninjas, UUID> {
}

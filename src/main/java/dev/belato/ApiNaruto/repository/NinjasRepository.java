package dev.belato.ApiNaruto.repository;

import dev.belato.ApiNaruto.models.Ninjas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjasRepository extends JpaRepository<Ninjas,Long> {
}

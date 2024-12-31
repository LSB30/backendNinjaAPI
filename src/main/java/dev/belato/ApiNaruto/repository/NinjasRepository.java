package dev.belato.ApiNaruto.repository;

import dev.belato.ApiNaruto.models.Ninjas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

public interface NinjasRepository extends JpaRepository<Ninjas, String> {
    @Modifying
    @Transactional
    @Query("UPDATE Ninjas u SET u.name = :name, u.village = :village, u.age = :age, u.element = :element, u.imgUrl = :imgUrl WHERE u.id = :id")
    int updateNinja(@Param("id") String id, @Param("name") String name, @Param("village") String village, @Param("age") int age, @Param("element") String element, @Param("imgUrl") String imgUrl);

}

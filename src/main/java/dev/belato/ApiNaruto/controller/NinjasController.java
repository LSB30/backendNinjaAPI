package dev.belato.ApiNaruto.controller;
import dev.belato.ApiNaruto.models.Ninjas;
import dev.belato.ApiNaruto.service.NinjasService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/ninjas" )
public class NinjasController {
    private final NinjasService service;

    public NinjasController(NinjasService service) {
        this.service = service;
    }
    @PostMapping("/add")
    public ResponseEntity<Ninjas> addNinja(@RequestBody Ninjas ninja) {
        Ninjas newNinja = service.addNinjas(ninja);

        return new ResponseEntity<>(newNinja, HttpStatus.CREATED);
    }

}

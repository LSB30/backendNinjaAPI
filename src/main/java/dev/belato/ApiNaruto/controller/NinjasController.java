package dev.belato.ApiNaruto.controller;
import dev.belato.ApiNaruto.dto.NinjaUpdateDto;
import dev.belato.ApiNaruto.models.Ninjas;
import dev.belato.ApiNaruto.service.NinjasService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

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

    @GetMapping("/show")
    public ResponseEntity<List<Ninjas>> showListNinjas() {
        List<Ninjas> listNinjas = service.showListNinjas();
        return new ResponseEntity<>(listNinjas,HttpStatus.OK);
    }

    @PutMapping("/update/{ninjaId}")
    public ResponseEntity<Optional<Ninjas>> updateNinja(@PathVariable("ninjaId") String id, @RequestBody NinjaUpdateDto ninjaUpdateDto) {
        System.out.println(id);
        var ninja = service.updateNinja(id, ninjaUpdateDto);

        return new ResponseEntity<>(ninja,HttpStatus.OK);
    }
}

package com.example.demo.Controller.Playground;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/salas/goats2")
public class Goat_Controller_V2 {

    private List<String> goats2 = new ArrayList<>(List.of("Sara", "Valentina", "Valeria"));

    //GET - Enlistando todos los elementos
    //Endpoint: GET /salas/goats2
    @GetMapping
    public List<String> getGoats() {
        return goats2;
    }

    //POST - Añadiendo una nueva cabra a la lista
    //Endpoint: POST /salas/goats2?cabra=Sofia
    @PostMapping
    public String addGoat(@RequestParam String cabra) {
        goats2.add(cabra);
        return ("Se ha añadido corectamente la cabra " + cabra);
    }

    //PUT - Actualizando una cabra de la lista
    //Endpoint: PUT /salas/goats2/0?cabra=Luna
    @PutMapping("/{index}")
    public String updateGoat(@PathVariable int index, @RequestParam String cabra) {
        goats2.set(index,cabra);
        return ("Se actualizo la cabra " + cabra + " del indice " + index);
    }

    //DELETE - Eliminar una cabra de la lista
    //Endpoint: DELETE /salas/goats2/0
    @DeleteMapping("/{index}")
    public String deleteGoat(@PathVariable int index){
        goats2.remove(index);
        return ("Se elimino la cabra " + index);
    }


}

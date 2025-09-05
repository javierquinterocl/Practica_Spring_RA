package com.example.demo.Controller.Playground;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
//Se utiliza para mapear las solucitudes HTTPS
@RequestMapping("/salas/goats")
public class Goat_Controller {

    private List<String[]> goats = new ArrayList<>(List.of(
            new String[]{"1", "Federica", "3", "Boer", "45kg"},
            new String[]{"2", "Estrella", "8", "Alpina", "34kg"}
    ));

    //GET -Listar todas las cabras que esten almacenadas en las lista de arrays
    //Endpoint: GET /salas/goats
    @GetMapping
    public List<String[]> getGoats() {
        return goats;
    }

    //POST -Agregar nueva cabra
    //Endpoint: POST /salas/goats?id=3&nombre=Valentina&edad=2&raza=Saenen&peso=2
    //@GetMapping("/add")
    @PostMapping
    public String addGoat(@RequestParam String id, @RequestParam String nombre, @RequestParam String edad, @RequestParam String raza, @RequestParam String peso) {
        goats.add(new String[] {id, nombre, edad,raza, peso});
        return " Cabra agregada cuyo id es: " +id + " y Su nombre: " + nombre;
    }

    //PUT -Actualizar el perfil de alguna cabra que este dentro de la lista indicando el indice de su ubicacion y los parametros que correspondan
    //Endpoint: PUT /salas/goats/0?id=3&nombre=Valentino&edad=1&raza=Humano&peso=6
    @PutMapping("/{index}")
    public String updateGoat(@PathVariable int index, @RequestParam String id, @RequestParam String nombre, @RequestParam String edad, @RequestParam String peso) {
        goats.set(0, new String[] {id, nombre, edad, peso});
        return "Una cabra ha sido actualizada en indice: " +index + " cuyo id es : " +id + " y Su nombre: " + nombre;
    }

    //DELETE -Eliminar el perfil de una cabra almacenada en la lista
    //Endpoint: DELETE /salas/goats/0
    @DeleteMapping("/{index}")
    public String deleteGoat(@PathVariable int index) {
        goats.remove(index);
        return ("La cabra con el indice: " + index + " ha sido eliminada");
    }

}

package se.lexicon.simon.restapp.contoller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import se.lexicon.simon.restapp.Pen;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class PenController {

    List<Pen> pens = Arrays.asList(
            new Pen(0, "Parker", "12618dfg8we8g"),
            new Pen(1, "Parker ballpen", "54d5f453fd")
    );

/*
    @GetMapping("/pen")
    public Pen getPen(){

        return new Pen(120054, "Parker", "12618dfg8we8g");

    }
*/

    @GetMapping("/api/pen")
    public ResponseEntity<Pen> getPenResponseEntity(){

        Pen object = new Pen(120054, "Parker", "12618dfg8we8g");

        return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).body(object);

    }

    @GetMapping("/api/pen/{id}")
    public ResponseEntity<Pen> findById(@PathVariable("id") int id){

        Optional<Pen> optional = Optional.ofNullable(pens.get(id));

        if (optional.isPresent()){
            return ResponseEntity.ok(optional.get());
        } else {
            return ResponseEntity.notFound().build();
        }

    }



}

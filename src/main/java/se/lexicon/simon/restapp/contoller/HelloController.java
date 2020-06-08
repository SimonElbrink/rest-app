package se.lexicon.simon.restapp.contoller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //@RequestMapping(method = RequestMethod.GET, path = "/hello")
    @GetMapping("/hello")
    public String greeting(){
        return "Hello World Wide Web";
    }

}

package skypro.hw_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
    @GetMapping
    public String hello() {
        return "Hello";
    }
}

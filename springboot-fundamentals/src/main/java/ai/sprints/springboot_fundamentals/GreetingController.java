package ai.sprints.springboot_fundamentals;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("/greet")
    public String greet() {
        return "Hello, Spring Boot!";
    }
}

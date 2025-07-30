package ai.sprints;

import org.springframework.stereotype.Component;

@Component
public class Printer {
    public void print(String message) {
        System.out.println(message);
    }
}
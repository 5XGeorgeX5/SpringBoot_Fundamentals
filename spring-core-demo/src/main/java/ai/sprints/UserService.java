package ai.sprints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    private Printer printer;

    @Autowired
    public UserService(Printer printer) {
        this.printer = printer;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public void print(String message) {
        printer.print(message);
    }
}

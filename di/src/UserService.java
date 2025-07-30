
public class UserService {
    private Printer printer;

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

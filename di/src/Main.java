
public class Main {
    public static void main(String[] args) {
        // Constructor injection
        Printer printer = new Printer();
        UserService userService = new UserService(printer);
        userService.print("I'm using constructor injection!");

        // Setter injection
        UserService userService2 = new UserService(null);
        userService2.setPrinter(printer);
        userService2.print("And I'm using setter injection!");
    }
}
package homeworks.homework13;


import homeworks.homework13.console.Console;
import homeworks.homework13.console.SystemConsole;

public class Main {
    public static void main(String[] args) throws Exception {
        Console console = new SystemConsole();
        Core app = new Core(console);
        app.run();
    }
}

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private BirdDatabase birdDB;

    public UserInterface(Scanner scanner, BirdDatabase birdDatabase) {
        this.scanner = scanner;
        this.birdDB = birdDatabase;
    }

    public void start() {
        while (true) {
            System.out.println("?");
            String input = scanner.nextLine();

            switch (input) {
                case "Add":
                    add();
                    break;
                case "Observation":
                    observe();
                    break;
                case "All":
                    printAll();
                    break;
                case "One":
                    printOne();
                    break;
                case "Quit":
                    return;

            }
        }

    }

    public void add() {
        System.out.print("Name");
        String name = scanner.nextLine();
        System.out.print("Name in Latin");
        String latinName = scanner.nextLine();
        birdDB.add(new Bird(name, latinName));
    }

    public void observe() {
        System.out.print("Bird?");
        birdDB.observe(scanner.nextLine());
    }

    public void printAll() {
        birdDB.printAll();
    }

    public void printOne() {
        System.out.print("Bird?");
        birdDB.printOne(scanner.nextLine());
    }

}

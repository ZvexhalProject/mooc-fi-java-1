
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");

        ArrayList<String> list = new ArrayList<>();
        String file = scanner.nextLine();
        try {
            Scanner personScanner = new Scanner(Paths.get(file),"UTF-8");

            while (personScanner.hasNextLine()) {
                list.add(personScanner.nextLine());
            }

        } catch (Exception e) {
            // TODO: handle exception
        }

        // implement reading the file here.
        System.out.println("");

        System.out.println("Enter names, an empty line quits.");
        while (true) {
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            if (list.contains(name)) {
                System.out.println("The name is on the list.");
            } else {
                System.out.println("The name is not on the list.");
            }
        }

        System.out.println("Thank you!");
    }
}

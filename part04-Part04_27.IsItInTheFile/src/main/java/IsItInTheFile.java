
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try (Scanner nameScanner = new Scanner(Paths.get(file))) {
            while (nameScanner.hasNextLine()) {
                names.add(nameScanner.nextLine());
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("Reading the file " + file + " failed.");
        }
        if (names.contains(searchedFor)) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }

    }
}

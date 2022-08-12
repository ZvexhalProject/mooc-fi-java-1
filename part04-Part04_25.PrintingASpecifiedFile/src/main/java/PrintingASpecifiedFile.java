
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have its contents printed?");
        String file = scanner.nextLine();
        try {
            scanner = new Scanner(Paths.get(file));
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}

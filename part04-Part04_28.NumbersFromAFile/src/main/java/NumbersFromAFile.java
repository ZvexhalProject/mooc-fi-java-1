
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> values = new ArrayList<>();
        int count = 0;
        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        try {
            Scanner fileReader = new Scanner(Paths.get(file));
            while (fileReader.hasNextLine()) {
                int line = Integer.valueOf(fileReader.nextLine());
                values.add(line);
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
        for (int number : values) {
            if (number >= lowerBound && number <= upperBound) {
                count++;
            }
        }

        System.out.println("Numbers: "+count);
    }

}

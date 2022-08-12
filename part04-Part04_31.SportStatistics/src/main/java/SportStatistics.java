
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counterWin = 0;
        int counterLoss = 0;
        int counterGames = 0;

        System.out.println("File:");
        String fileName = scan.nextLine();

        System.out.println("Team:");
        String inputTeamName = scan.nextLine();

        try {
            Scanner fileScanner = new Scanner(Paths.get(fileName));
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] splitLine = line.split(",");
                String nameOfTeam = splitLine[0];
                String nameOfOpponent = splitLine[1];
                int resultOfTeam = Integer.valueOf(splitLine[2]);
                int resultOfOpponent = Integer.valueOf(splitLine[3]);

                if (inputTeamName.equals(nameOfTeam)) {
                    counterGames++;
                    if (resultOfTeam > resultOfOpponent) {
                        counterWin++;
                    } else {
                        counterLoss++;
                    }
                }
                if (inputTeamName.equals(nameOfOpponent)) {
                    counterGames++;
                    if (resultOfOpponent > resultOfTeam) {
                        counterWin++;
                    } else {
                        counterLoss++;
                    }
                }

            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("Games: "+counterGames);
        System.out.println("Wins: "+counterWin);
        System.out.println("Losses: "+counterLoss);

    }

}

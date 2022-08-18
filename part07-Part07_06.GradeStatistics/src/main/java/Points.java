import java.util.ArrayList;

public class Points {
    private ArrayList<Integer> pointsList;
    private final String AVERAGE_ALL = "AVERAGE_ALL";
    private final String AVERAGE_PASSING = "AVERAGE_PASSING";
    private final String PASSING_PERCENTAGE = "PASSING_PERCENTAGE";

    public Points() {
        this.pointsList = new ArrayList<>();
    }

    public void add(int pointAmount) {
        if (pointAmount >= 0 && pointAmount <= 100) {
            this.pointsList.add(pointAmount);
        }
    }

    public double averagePointsAll() {
        return this.passHelper(AVERAGE_ALL);
    }

    public double averagePointsPassing() {
        return this.passHelper(AVERAGE_PASSING);
    }

    public double passPercentage() {
        return this.passHelper(PASSING_PERCENTAGE);
    }

    public void gradeDistribution() {
        int gradeFailed = 0;
        int grade1 = 0;
        int grade2 = 0;
        int grade3 = 0;
        int grade4 = 0;
        int grade5 = 0;
        ArrayList<Integer> gradeDistributionListed = new ArrayList<>();

        for (int value : pointsList) {
            if (value < 50) {
                gradeFailed++;
            } else if (value < 60) {
                grade1++;
            } else if (value < 70) {
                grade2++;
            } else if (value < 80) {
                grade3++;
            } else if (value < 90) {
                grade4++;
            } else if (value >= 90) {
                grade5++;
            }
        }
        gradeDistributionListed.add(gradeFailed);
        gradeDistributionListed.add(grade1);
        gradeDistributionListed.add(grade2);
        gradeDistributionListed.add(grade3);
        gradeDistributionListed.add(grade4);
        gradeDistributionListed.add(grade5);

        this.printStars(gradeDistributionListed);

    }

    private void printStars(ArrayList<Integer> gradeDistributionListed){
        for (int i = (gradeDistributionListed.size() - 1); i >= 0; i--) {
            System.out.print(i+": ");
            for(int j=0;j<gradeDistributionListed.get(i);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private double passHelper(String command) {
        int sum = 0;
        int amount = 0;

        for (Integer value : this.pointsList) {
            if (command.equals(AVERAGE_PASSING) || command.equals(PASSING_PERCENTAGE)) {
                if (value >= 50) {
                    sum += value;
                    amount++;
                }
            } else {
                sum += value;
            }
        }

        if (command.equals(AVERAGE_PASSING)) {
            if (amount == 0) {
                return 0;
            }
            return (double) sum / amount;
        }
        if (command.equals(PASSING_PERCENTAGE)) {
            if (amount == 0) {
                return 0;
            }
            return (double) 100 * amount / this.pointsList.size();
        }
        if (command.equals(AVERAGE_ALL)) {
            return (double) sum / this.pointsList.size();
        }

        return 0;
    }
}

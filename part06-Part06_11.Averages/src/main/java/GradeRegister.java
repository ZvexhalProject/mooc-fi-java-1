
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> gradesList;
    private ArrayList<Integer> pointsList;

    public GradeRegister() {
        this.gradesList = new ArrayList<>();
        this.pointsList=new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.gradesList.add(pointsToGrade(points));
        this.pointsList.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.gradesList) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades(){
        if(gradesList.isEmpty()){
            return -1;
        }
        int sum=0;
        for(int grade:gradesList){
            sum+=grade;
        }
        return (double)sum/gradesList.size();
    }

    public double averageOfPoints(){
        if(gradesList.isEmpty()){
            return -1;
        }
        int sum=0;
        for(int points:pointsList){
            sum+=points;
        }
        return (double)sum/gradesList.size();
    }
}

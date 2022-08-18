import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Points pointsList;

    public UserInterface(Scanner scanner){
        this.scanner=scanner;
        this.pointsList=new Points();
    }

    public void start(){
        System.out.println("Enter point totals, -1 stops:");
        while(true){
           int value=Integer.valueOf(this.scanner.nextLine());
           if(value==-1){
            break;
           }
           this.pointsList.add(value);
        }
        double averagePointsAll=this.pointsList.averagePointsAll();
        String averagePointsPassing=(this.pointsList.averagePointsPassing()>0)?""+this.pointsList.averagePointsPassing():"-";
        double passPercentage=this.pointsList.passPercentage();

        System.out.println("Point average (all): "+averagePointsAll);
        System.out.println("Point average (passing): "+averagePointsPassing);   
        System.out.println("Pass percentage: "+passPercentage);
        this.pointsList.gradeDistribution();
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BirdDatabase {
    private ArrayList<Bird> birdList;

    public BirdDatabase(){
        this.birdList=new ArrayList<>();
    }

    public void add(Bird bird){
        if(!birdList.contains(bird)){
            this.birdList.add(bird);
        }
    }
    
    public void observe(String observedBird){
        boolean birdExistent=false;
        for(Bird bird:this.birdList){
            if(observedBird.equals(bird.getName())){
                bird.increaseObservation();
                birdExistent=true;
            }
        }
        if(!birdExistent){
            System.out.println("Not a bird!");
        }
    }

    public void printAll(){
        for(Bird bird:this.birdList){
            System.out.println(bird);
        }
    }

    public void printOne(String birdName){
        for(Bird bird:this.birdList){
            if(birdName.equals(bird.getName())){
               System.out.println(bird);
            }
        }
    }
}

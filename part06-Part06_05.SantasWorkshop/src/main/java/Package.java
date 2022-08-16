import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> pack;
    public Package(){
        this.pack=new ArrayList<>();
    }

    public void addGift(Gift gift){
        this.pack.add(gift);
    }
    public int totalWeight(){
        int sum=0;
        for(Gift gift:pack){
            sum+=gift.getWeight();
        }
        return sum;
    }

}

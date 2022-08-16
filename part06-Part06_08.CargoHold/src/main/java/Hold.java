import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> holdList;
    private int currentWeight;

    public Hold(int maximumWeight){
        this.maximumWeight=maximumWeight;
        this.holdList=new ArrayList<>();
        this.currentWeight=0;
    }
    public void addSuitcase(Suitcase suitcase){
        if(this.currentWeight+suitcase.totalWeight()>this.maximumWeight){
            return;
        }
        this.currentWeight+=suitcase.totalWeight();
        this.holdList.add(suitcase);
    }
    @Override
    public String toString() {
        String languageFormat="suitcases";
        if(this.holdList.size()==0){
            return "no suitcases (0kg)";
        }
        if(this.holdList.size()==1){
            languageFormat="suitcase";
        }

        return this.holdList.size() + " " + languageFormat+" ("+ this.currentWeight +" kg)";
    }

    public void printItems(){
        for(Suitcase suitcase:holdList){  
           suitcase.printItems();
        }
    }
}

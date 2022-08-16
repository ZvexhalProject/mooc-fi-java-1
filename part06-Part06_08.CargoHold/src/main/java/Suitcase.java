import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> itemsInSuitcase;
    private int currentWeight;
    private int maxWeight;

    public Suitcase(int maxWeight){
        this.itemsInSuitcase=new ArrayList<>();
        this.maxWeight=maxWeight;
        this.currentWeight=0;
    }

    public void addItem(Item item){
        if(this.currentWeight+item.getWeight()>maxWeight){
            return;
        }
        this.currentWeight+=item.getWeight();
        this.itemsInSuitcase.add(item);
    }

    public void printItems(){
        for(Item item:itemsInSuitcase){
            System.out.println(item);
        }
    }

    public int totalWeight(){
        return currentWeight;
    }

    public Item heaviestItem(){
        if(itemsInSuitcase.isEmpty()){
            return null;
        }
        Item heaviest=itemsInSuitcase.get(0);
        for(Item item:itemsInSuitcase){
            if(item.getWeight()>heaviest.getWeight()){
                heaviest=item;
            }
        }
        return heaviest;
    }

    @Override
    public String toString() {
        String languageFormat="items";
        if(this.itemsInSuitcase.size()==0){
            return "no items (0kg)";
        }
        if(this.itemsInSuitcase.size()==1){
            languageFormat="item";
        }
        return this.itemsInSuitcase.size()+" "+languageFormat+" ("+this.currentWeight+" kg)";
    }


}

import javax.swing.event.SwingPropertyChangeSupport;

public class Bird {
    private String name;
    private String latinName;
    private int observationCounter;

    public Bird(String name, String latinName){
        this.name=name;
        this.latinName=latinName;
        this.observationCounter=0;
    }
    public String getName(){
        return this.name;
    }

    public String getLatinName(){
        return this.latinName;
    }

    public void increaseObservation(){
        this.observationCounter++;
    }

    public int getObservationCount(){
        return this.observationCounter;
    }

    @Override
    public String toString() {
        return this.name+" ("+this.latinName+"): "+this.observationCounter+" observations";
    }

}

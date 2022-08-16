import java.util.ArrayList;

public class Room {
    private ArrayList<Person> peopleInRoom;

    public Room(){
        this.peopleInRoom=new ArrayList<>();
    }

    public void add(Person person){
        this.peopleInRoom.add(person);
    }
    
    public boolean isEmpty(){
        return peopleInRoom.isEmpty();
    }

    public ArrayList<Person> getPersons(){
        return this.peopleInRoom;
    }
    
    public Person shortest(){
        if(this.peopleInRoom.isEmpty()){
            return null;
        }
        Person shortest=this.peopleInRoom.get(0);
        for(Person person:this.peopleInRoom){
            if(person.getHeight()<shortest.getHeight()){
                shortest=person;
            }
        }
        return shortest;
    }

    public Person take(){
        if(this.peopleInRoom.isEmpty()){
            return null;
        }
        Person shortest=shortest();
        this.peopleInRoom.remove(shortest);
        return shortest;
    }

}


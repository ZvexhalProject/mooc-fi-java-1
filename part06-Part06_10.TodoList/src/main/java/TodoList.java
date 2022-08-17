import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> listOfThingsToDo;

    public TodoList(){
        this.listOfThingsToDo=new ArrayList<>();
    }

    public void add(String task){
        this.listOfThingsToDo.add(task);
    }

    public void print(){
        for(String task:this.listOfThingsToDo){
            System.out.println(this.listOfThingsToDo.indexOf(task)+1+": "+task);
        }
    }

    public void remove(int number){
        this.listOfThingsToDo.remove(this.listOfThingsToDo.get(number-1));
    }
}


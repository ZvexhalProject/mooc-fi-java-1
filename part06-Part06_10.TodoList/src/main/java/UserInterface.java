import java.util.Scanner;

public class UserInterface {
    private TodoList todo;
    private Scanner scanner;

    public UserInterface(TodoList todo, Scanner scanner){
        this.todo=todo;
        this.scanner=scanner;
    }
    public void start(){
        while(true){
            System.out.print("Command: ");
            String command=scanner.nextLine();

            if(command.equals("stop")){
                break;
            }
            if(command.equals("add")){
                System.out.print("To add: ");
                String taskToAdd=scanner.nextLine();
                todo.add(taskToAdd);
            }
            if(command.equals("list")){
                todo.print();
            }
            if(command.equals("remove")){
                System.out.println("Which one is removed? ");
                int removeNumber=Integer.valueOf(scanner.nextLine());
                todo.remove(removeNumber);
            }
        }
    }
}

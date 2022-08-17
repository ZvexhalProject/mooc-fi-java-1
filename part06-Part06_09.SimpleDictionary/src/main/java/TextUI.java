import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.scanner=scanner;
        this.dictionary=dictionary;
    }

    public void start(){
        while(true){
            System.out.print("Command: ");
            String command=scanner.nextLine();
            if(command.equals("end")){
                System.out.println("Bye bye!");
                break;
            }
            if(command.equals("add")){
                System.out.print("Word: ");
                String word=scanner.nextLine();

                System.out.print("Translation: ");
                String translatedWord=scanner.nextLine();

                this.dictionary.add(word, translatedWord);
                continue;
            }

            if(command.equals("search")){
                System.out.print("To be translated: ");
                String wordToBeTranslated=scanner.nextLine();

                String translatedWord=this.dictionary.translate(wordToBeTranslated);
                if(translatedWord==null){
                    System.out.println("Word "+wordToBeTranslated+" was not found");
                    continue;
                }
                System.out.println("Translation: "+translatedWord );
                continue;
            }
            System.out.println("Unknown command");

        }

    }
}

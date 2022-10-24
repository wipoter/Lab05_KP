import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();
            Vowels vowels = new Vowels(text);
            vowels.splittingText();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
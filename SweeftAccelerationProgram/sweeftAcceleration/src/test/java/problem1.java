import java.util.Scanner;

public class problem1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String text = scanner.nextLine();
        String reversed = reversedText(text);
        if(isPalyndrome(text, reversed)) {
            System.out.println(text + " is a palydrome!");
        } else {
            System.out.println(text + " is not a palyndrome!");
        }
    }
    static String reversedText(String text){
        String answer = "";
        for(int i=0; i<text.length(); i++){
            answer = text.charAt(i) + answer;
        }
        return answer;
    }
    static Boolean isPalyndrome(String text, String reversed){
        return text.equals(reversed);
    }
}

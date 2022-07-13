import java.util.Scanner;

public class problem4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String brackets = sc.nextLine();
        // (()(()()))
        System.out.println(isProperly(brackets));
    }
    static Boolean isProperly(String sequence){
        // check the length of a sequence
        if(sequence.length() % 2 != 0){
            return false;
        }
        // check if numbers of "(" are the same as ")"
        char brace = '(';
        int count = 0;
        for(int i = 0; i < sequence.length(); i++){
            if(sequence.charAt(i)== brace) count++;
        }
        if(count != sequence.length()/2) return false;

        // check if order is correct
        for(int i=0; i<sequence.length()/2; i++){
            if(sequence.charAt(i) == sequence.charAt(sequence.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}

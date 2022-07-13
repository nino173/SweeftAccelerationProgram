import java.util.Scanner;

public class problem2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter money : ");
        int amount = sc.nextInt();
        int coins = minSplit(amount);
        System.out.println("Total amount of coins: " + coins);
    }
    static int minSplit(int amount) {
        if (amount == 5 || amount == 10 || amount == 15 || amount == 20) return 1;
        return minSplit(amount) + minSplit(amount - 20);
    }
}

import java.util.Scanner;

public class problem5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("The number of steps: ");
        int n = sc.nextInt();
        System.out.println("The number of ways to reach the top is: " + countWays(n));
    }
    static int countWays(int n){
        return fibbonacci(n+1);
    }
    static int fibbonacci(int x){
        if(x <= 1) return x;
        return fibbonacci(x-1) + fibbonacci(x-2);
    }
}

public class problem3 {
    public static void main(String[] args){
        int[] array = { 9, 1, 12, 44, 2, 3, 4, 47};
        int number = notContains(array);
        System.out.println("Array does not contain " + number);
    }
     static int notContains(int[] array){
        int result = 1;
         for (int j : array) {
             if (j == result) {
                 result++;
             }
         }
        return result;
    }
}

import java.util.ArrayList;
import java.util.HashMap;

public class problem6 {
    ArrayList<Integer> arrayList;
    HashMap<Integer, Integer> hashMap;
    public problem6(){
        arrayList = new ArrayList<>();
        hashMap  = new HashMap<>();
    }
    public static void main(String[] args){
        problem6 p6 = new problem6();
        p6.add(5);
        p6.add(15);
        p6.add(25);
        p6.remove(15);
        p6.remove(5);
    }
    void add(int n){
        if(hashMap.get(n) != null) return;
        arrayList.add(n);
        hashMap.put(n, arrayList.size());
    }
    void remove(int n){
        Integer index = hashMap.get(n);
        if(index == null) return;
        hashMap.remove(n);
    }
}

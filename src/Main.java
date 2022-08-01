import java.util.*;

public class Main {

    public static void main(String[] args) {
        Integer[] someArr = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        List<Integer> intList = new ArrayList<>();
        Collections.addAll(intList, someArr);
        Iterator<Integer> iterator = intList.iterator();
        while (iterator.hasNext()){
            int a = iterator.next();
            if ((a <= 0) || (a % 2 != 0)){
                iterator.remove();
            }
        }
        Collections.sort(intList);
        for (int x : intList){
            System.out.println(x);
        }
    }
}



import java.util.*;
public class NewTopics {
    public static void main(String[] args) {
        //arrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(20);
        System.out.println(arrayList);

        //hashSet
        HashSet<Integer> hs = new HashSet<>(Arrays.asList(1,2,3,45,6,7,8,9,10));
        hs.add(15);
        System.out.println(hs);

        //LinkedHashSet
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>(Arrays.asList(1,2,3,45,6,7,8,9,10));
        lhs.add(15);
        System.out.println(lhs);


    }
}

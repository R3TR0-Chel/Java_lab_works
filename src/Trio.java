import java.util.ArrayList;
import java.util.Arrays;

public class Trio {
    public static void main(String[] args) {
        Storage<String> st1 = new Storage<>();
        st1.add("Hello");
        st1.add("World");
        st1.add("Java");
        ArrayList<Boolean> arr1 = new ArrayList<Boolean>(Arrays.asList(true,false,true));

        Storage<Integer> st2 = new Storage<>();
        st2.add(1);
        st2.add(2);
        st2.add(3);
        st1.printStorage();
        st2.printStorage();
        getAnyArray(arr1);
    }

    public static void getAnyArray(ArrayList<?> arr) {
        System.out.println(arr.toString());
    }
}

class Storage<T>{
    private ArrayList<T> storage = new ArrayList<T>();

    public void add(T item){
        storage.add(item);
    }

    public void remove(T item){
        storage.remove(item);
    }

    public void update(T oldItem, T newItem){
        storage.remove(oldItem);
        storage.add(newItem);
    }

    public void getAnyArray(T [] arr){
        System.out.println(arr.toString());
    }

    public void printStorage(){
        for(T item : storage){
            System.out.println(item);
        }
    }



}


import java.util.*;
public class W3exercises {
}

//ArrayListExercises
class ArraysExsamples{
    static List <String> colors = new ArrayList<>();

    public static void main(String[] args) {
        colors.add("green");
        colors.add("blue");
        colors.add("red");
        reverseArrayList();
        extractArrayList();
        compareArrayList();
        swapArrayList();
    }
    //Write a Java program to shuffle elements in an array list.
    public static void shuffleArrayList(){
        Collections.shuffle(colors);
        System.out.println(colors);
    }

    //Write a Java program to reverse elements in an array list.
    public static void reverseArrayList(){
        colors = colors.reversed();
        System.out.println(colors);
    }

    //Write a Java program to extract a portion of an array list.
    public static void extractArrayList(){
        List<String> subList = colors.subList(0, 2);
        System.out.println(subList);
    }

    //Write a Java program to compare two array lists.
    public static void compareArrayList(){
        List<String> colors2 = new ArrayList<>();
        colors2.add("green");
        colors2.add("blue");
        colors2.add("red");
        System.out.println(colors.equals(colors2));
    }

    //Write a Java program that swaps two elements in an array list.
    public static void swapArrayList(){
        Collections.swap(colors, 0, 2);
        System.out.println(colors);
    }

    //Write a Java program to join two array lists.
    public static void joinArrayList(){
        List<String> colors2 = new ArrayList<>();
        colors2.add("green");
        colors2.add("blue");
        colors2.add("red");
        colors.addAll(colors2);
        System.out.println(colors);
    }
}

class LinkedListExsamples{
    static LinkedList<Integer> nums = new LinkedList<>(Arrays.asList(1,2,57,7));

    public static void main(String[] args) {
        //removeFirstAndLAst();
        //removeAll();

    }

    // Write a Java program to remove the first and last elements from a linked list.
    public static void removeFirstAndLAst(){
        nums.removeFirst();
        nums.removeLast();
        System.out.println(nums);
    }

    //Write a Java program to remove all elements from a linked list.
    public static void removeAll(){
        nums.removeAll(nums);
    }

    // Write a Java program that swaps two elements in a linked list.
    public static void swap(){
        Collections.swap(nums,1,0);
    }

    //Write a Java program to shuffle elements in a linked list.
    public static void shuffle(){
        Collections.shuffle(nums);
    }

    //Write a Java program to join two linked lists.
    public static void join(){
        LinkedList<Integer> nums2 = new LinkedList<>(Arrays.asList(1,2,57,7));
        nums.addAll(nums2);
    }

    //Write a Java program to copy a linked list to another linked list.
    public static void copy(){
        LinkedList<Integer> nums2 = new LinkedList<>(nums);
    }
}

class HashSetExsamples{
    static HashSet<String> colors = new HashSet<>(Arrays.asList("green", "blue", "red"));

    public static void main(String[] args) {
        //removeAll();
        compare();
        compareTwo();
        findLessThan7();
    }

    //Write a Java program to remove all elements from a hash set.
    public static void removeAll(){
        colors.removeAll(colors);
    }

    //Write a Java program to compare two sets and retain elements that are the same.
    public static void compare(){
        HashSet<String> colors2 = new HashSet<>(Arrays.asList("green", "blue", "red"));
        System.out.println(colors.retainAll(colors2));
    }

    //Write a Java program to compare two hash set.
    public static void compareTwo(){
        HashSet<String> colors2 = new HashSet<>(Arrays.asList("green", "blue", "red"));
        System.out.println(colors.equals(colors2));
    }

    //Write a Java program to find numbers less than 7 in a tree set.
    public static void findLessThan7(){
        TreeSet<Integer> nums = new TreeSet<>(Arrays.asList(1,2,57,7));
        System.out.println(nums.headSet(7));
    }

    //Write a Java program to convert a hash set to a tree set.
    public static void convert(){
        TreeSet<String> colors2 = new TreeSet<>(colors);
    }

    //Write a Java program to convert a hash set to an array.
    public static void convertToArray(){
        String[] colors2 = new String[colors.size()];
        colors.toArray(colors2);
    }

    //Write a Java program to clone a hash set to another hash set.
    public static void cloneHashSet(){
        HashSet<String> colors2 = (HashSet<String>) colors.clone();
    }
}

class TreeSetExsamples{
    static TreeSet<Integer> nums = new TreeSet<>(Arrays.asList(1,2,57,7));

    public static void main(String[] args) {

    }


    //Write a Java program to remove a given element from a tree set.
    public static void removeElement(){
        nums.remove(57);
    }

    //Write a Java program to retrieve and remove the last element of a tree set.
    public static void removeLast(){
        nums.pollLast();
    }

    //Write a Java program to retrieve and remove the first element of a tree set.
    public static void removeFirst(){
        nums.pollFirst();
    }

    //Write a Java program to get an element in a tree set that has a lower value than the given element.
    public static void lowerValue(){
        System.out.println(nums.lower(7));
    }

    //Write a Java program to get the element in a tree set strictly greater than or equal to the given element.
    public static void greaterValue(){
        System.out.println(nums.ceiling(7));
    }

    //Write a Java program to get the element in a tree set less than or equal to the given element.
    public static void lessValue(){
        System.out.println(nums.floor(7));
    }
}

class PriorityQueueExsamples{
    static PriorityQueue<Integer> nums = new PriorityQueue<>(Arrays.asList(1,2,57,7));

    public static void main(String[] args) {

    }

    //Write a Java program to change priorityQueue to maximum priority queue.
    public static void maxPriorityQueue(){
        PriorityQueue<Integer> maxNums = new PriorityQueue<>(Collections.reverseOrder());
        maxNums.addAll(nums);
    }

    //Write a Java program to convert a Priority Queue element to string representations.
    public static void convertToString(){
        String numsString = nums.toString();
    }

    //Write a Java program to convert a priority queue to an array containing all its elements.
    public static void convertToArray(){
        Integer[] numsArray = new Integer[nums.size()];
        nums.toArray(numsArray);
    }

    //Write a Java program to retrieve and remove the first element.
    public static void removeFirst(){
        nums.poll();
    }

    //Write a Java program to retrieve the first element of the priority queue.
    public static void getFirst(){
        System.out.println(nums.peek());
    }

    //Write a Java program to compare two priority queues.
    public static void compare(){
        PriorityQueue<Integer> nums2 = new PriorityQueue<>(Arrays.asList(1,2,57,7));
        System.out.println(nums.equals(nums2));
    }

    //Write a Java program to count the number of elements in a priority queue.
    public static void count(){
        System.out.println(nums.size());
    }
}

class HashMapExsamples{
    static HashMap<Integer, String> colors = new HashMap<>();

    public static void main(String[] args) {
        colors.put(1, "green");
        colors.put(2, "blue");
        colors.put(3, "red");

    }

    //Write a Java program to get a collection view of the values contained in this map.
    public static void getValues(){
        Collection<String> values = colors.values();
    }

    //Write a Java program to get a set view of the keys contained in this map.
    public static void getKeys(){
        Set<Integer> keys = colors.keySet();
    }

    // Write a Java program to get the value of a specified key in a map.
    public static void getValue(){
        System.out.println(colors.get(1));
    }

    //Write a Java program to create a set view of the mappings contained in a map.
    public static void getMappings(){
        Set<Map.Entry<Integer, String>> mappings = colors.entrySet();
    }

    //Write a Java program to test if a map contains a mapping for the specified value.
    public static void containsValue(){
        System.out.println(colors.containsValue("green"));
    }

    //Write a Java program to test if a map contains a mapping for the specified key.
    public static void containsKey(){
        System.out.println(colors.containsKey(1));
    }
}

class TreeMapExsamples{
    static TreeMap<Integer, String> colors = new TreeMap<>();

    public static void main(String[] args) {
        colors.put(1, "green");
        colors.put(2, "blue");
        colors.put(3, "red");
    }

    //Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key.
    public static void greaterKey(){
        System.out.println(colors.ceilingKey(2));
    }

    //Write a Java program to get a key-value mapping associated with the least key greater than or equal to the given key. Return null if there is no such key.
    public static void greaterMapping(){
        System.out.println(colors.ceilingEntry(2));
    }

    //Write a Java program to get a portion of a map whose keys are greater than a given key.
    public static void greaterKeys(){
        System.out.println(colors.tailMap(2));
    }

    //Write a Java program to get a portion of a map whose keys are greater than or equal to a given key.
    public static void greaterEqualKeys(){
        System.out.println(colors.tailMap(2, true));
    }

    //Write a Java program to get the portion of a map whose keys range from a given key to another key.
    public static void rangeKeys(){
        System.out.println(colors.subMap(1, 3));
    }

    //Write a Java program to get the portion of a map whose keys range from a given key (inclusive) to another key (exclusive).
    public static void rangeKeysExclusive(){
        System.out.println(colors.subMap(1, false, 3, true));
    }
}
import java.util.*;

public class ToDoList {
    static TreeMap<Integer, Task> scheduledTasks = new TreeMap<>();
    static ArrayList<String> processingTasks = new ArrayList<>();
    static ArrayDeque<Task> pendingTasks = new ArrayDeque<>();

    public static void main(String[] args) {
        Task task1 = new Task("Купить продукты", 2, 30);
        Task task2 = new Task("Сделать домашку", 1, 120);
        Task task3 = new Task("Почитать книгу", 3, 45);
        ToDoList.addTask(task1);
        ToDoList.addTask(task2);
        ToDoList.addTask(task3);
        ToDoList.DisplayScheduledTasks();
        ToDoList.addProcessingTask();
        ToDoList.DisplayProcessingTasks();
        ToDoList.addDelayingTask("Купить продукты");
        ToDoList.DisplayPendingTask();
        ToDoList.DisplayScheduledTasks();
    }

    public static void addTask(Task task){
        int priority = task.getPriority();
        scheduledTasks.put(priority, task);
    }

    public static void DisplayScheduledTasks(){
        if(scheduledTasks.size() == 0){
            System.out.println("No scheduled task");
        }
        else {
            for (int key = scheduledTasks.size(); key > 0; key--) {
                System.out.println(scheduledTasks.get(key).getDetails());
            }
        }
    }

    public static void DisplayProcessingTasks(){
        if(processingTasks.size() == 0){
            System.out.println("No processing task");
        }
        else {
            for (String task : processingTasks) {
                System.out.println(task);
            }
        }
    }

    public static void DisplayPendingTask(){
        if(pendingTasks.size() == 0){
            System.out.println("No pending task");
        }
        else {
            for (Task task : pendingTasks) {
                System.out.println(task.getDetails());
            }
        }
    }

    public static void addProcessingTask(){
        int mostPriorityTask = scheduledTasks.size();
        processingTasks.add(scheduledTasks.get(mostPriorityTask).getTaskName());
        scheduledTasks.remove(mostPriorityTask);

    }

    public static void addDelayingTask(String taskName) {
        for (int key : scheduledTasks.keySet()) {
            if (scheduledTasks.get(key).getTaskName().equals(taskName)) {
                pendingTasks.add(scheduledTasks.get(key));
                scheduledTasks.remove(key);
            }
        }
    }
}

class Task {
    private String TaskName;
    private int priority;
    private int duration;

    public Task(String TaskName, int priority, int duration) {
        this.TaskName = TaskName;
        this.priority = priority;
        this.duration = duration;
    }

    public int getPriority(){
        return priority;
    }

    public String getTaskName() {
        return TaskName;
    }

    public String getDetails(){
        return "[priority "+priority+"]"+" "+TaskName+" "+"("+duration+" mins)";
    }

}

class FirstAssignment {
    public static void main(String[] args) {
        Map<Integer, String> sampleMap = new HashMap<>();
        sampleMap.put(1, "One");
        sampleMap.put(2, "Two");
        sampleMap.put(3, "Three");

        System.out.println("Displaying map:");
        displayAnyMap(sampleMap);
    }

    public static void displayAnyMap(Map<?,?> map){
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}

class ListMerger {
    public static <T> List<T> mergeAlternating(List<T> list1, List<T> list2) {
        List<T> mergedList = new ArrayList<>();
        int size1 = list1.size(), size2 = list2.size();
        int maxSize = Math.max(size1, size2);

        for (int i = 0; i < maxSize; i++) {
            if (i < size1) mergedList.add(list1.get(i));
            if (i < size2) mergedList.add(list2.get(i));
        }

        return mergedList;
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7);
        List<Integer> list2 = Arrays.asList(2, 4, 6);

        List<Integer> mergedList = mergeAlternating(list1, list2);
        System.out.println("Merged List: " + mergedList);

        List<String> listA = Arrays.asList("A", "C", "E");
        List<String> listB = Arrays.asList("B", "D", "F", "G");

        List<String> mergedStrings = mergeAlternating(listA, listB);
        System.out.println("Merged String List: " + mergedStrings);
    }
}

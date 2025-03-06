import java.util.*;

public class HashMapPractice {
    private static HashMap<Integer, Student> studentsList = new HashMap<>();

    public static void main(String[] args) {
        Student s1 = new Student(1, "Ryan Gosling", 20);
        Student s2 = new Student(2, "Mark Grayson", 21);
        Student s3 = new Student(3, "Jeremy Soul", 22);

        addStudent(s1);
        addStudent(s2);
        addStudent(s3);
        DisplayAllStudents();
        addCourseToStudent(2, "Discrete Math");
        addCourseToStudent(1, "Python");
        addCourseToStudent(3, "Java");
        removeStudent(3);
        updateCourseToStudent(1, "Python", "Java");
        DisplayAllStudents();
        SearchStudent(1);
        ListStudentsInCourse("Java");

    }

    public static void addStudent(Student student) {
        studentsList.put(student.getId(), student);
    }

    public static void removeStudent(int id) {
        studentsList.remove(id);
    }

    public static void DisplayAllStudents() {
        for (Map.Entry<Integer, Student> entry : studentsList.entrySet()) {
            System.out.println("List of the students");
            System.out.println("ID: " + entry.getKey()+"\n"
                    + "Name: " + entry.getValue().getName()+"\n"
                    + "Age: " + entry.getValue().getAge()+"\n"
                    + "Courses: " + entry.getValue().getCourses());
        }
    }

    public static void SearchStudent(int id) {
        if (studentsList.containsKey(id)) {
            Student student = studentsList.get(id);
            System.out.println("ID: " + id+"\n"
                    + "Name: " + student.getName()+"\n"
                    + "Age: " + student.getAge()+"\n"
                    + "Courses: " + student.getCourses());
        } else {
            System.out.println("Student not found");
        }
    }

    public static void addCourseToStudent(int id, String course) {
        if (studentsList.containsKey(id)) {
            Student student = studentsList.get(id);
            student.addCourse(course);
        } else {
            System.out.println("Student not found");
        }
    }

    public static void updateCourseToStudent(int id, String oldCourse, String newCourse) {
        if (studentsList.containsKey(id)) {
            Student student = studentsList.get(id);
            student.updateCourse(oldCourse, newCourse);
        } else {
            System.out.println("Student not found");
        }
    }

    public static void ListStudentsInCourse(String course) {
        for (Map.Entry<Integer, Student> entry : studentsList.entrySet()) {
            if (entry.getValue().getCourses().contains(course)) {
                System.out.println("Students in " + course + " course:");
                System.out.println("ID: " + entry.getKey()+"\n"
                    + "Name: " + entry.getValue().getName()+"\n"
                    + "Age: " + entry.getValue().getAge()+"\n"
                    + "Courses: " + entry.getValue().getCourses());
            }
        }
    }
}

class Student {
    private int id;
    private String name;
    private int age;
    private HashSet<String> courses = new HashSet<>();

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashSet<String> getCourses() {
        return courses;
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void updateCourse(String oldCourse, String newCourse) {
        courses.remove(oldCourse);
        courses.add(newCourse);
    }
}


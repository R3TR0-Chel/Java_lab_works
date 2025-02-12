import java.util.Scanner;

public class University {
    public static void main(String[] args) {
        Student[] students = new Student[1000];
        Course[] courses = new Course[1000];
        Scanner scanner = new Scanner(System.in);
        int studentCount = 0;
        int courseCount = 0;

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Показать студентов у предмета по id");
            System.out.println("2. Добавить студента");
            System.out.println("3. Добавить студента на предмет по id");
            System.out.println("4. Показать список предметов студента по id");
            System.out.println("5. Добавить предмет");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите ID предмета: ");
                    String courseId = scanner.nextLine();
                    for (Course course : courses) {
                        if (course != null && course.getId().equals(courseId)) {
                            System.out.println("Студенты:");
                            for (Student student : course.getStudents()) {
                                if (student != null) {
                                    System.out.println(student.getFirstName() + " " + student.getLastName());
                                }
                            }
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.print("Введите имя студента: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Введите фамилию студента: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Введите специальность: ");
                    String major = scanner.nextLine();
                    System.out.print("Введите год обучения: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();
                    students[studentCount++] = new Student(firstName, lastName, major, year, studentCount);
                    System.out.println("Студент добавлен!");
                    break;
                case 3:
                    System.out.print("Введите ID студента: ");
                    int studentId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Введите ID предмета: ");
                    String courseToAdd = scanner.nextLine();
                    Student student = students[studentId];
                    for (Course course : courses) {
                        if (course != null && course.getId().equals(courseToAdd)) {
                            student.addCourse(course);
                            course.addStudent(student);
                            System.out.println("Студент добавлен на предмет!");
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.print("Введите ID студента: ");
                    int studId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Список предметов:");
                    for (Course c : students[studId].getCourseslist()) {
                        if (c != null) {
                            System.out.println(c.getP_name());
                        }
                    }
                    break;
                case 5:
                    System.out.print("Введите ID предмета: ");
                    String newCourseId = scanner.nextLine();
                    System.out.print("Введите название предмета: ");
                    String courseName = scanner.nextLine();
                    System.out.print("Введите количество кредитов: ");
                    int credits = scanner.nextInt();
                    scanner.nextLine();
                    courses[courseCount++] = new Course(credits, newCourseId, courseName);
                    System.out.println("Предмет добавлен!");
                    break;
                case 0:
                    System.out.println("Выход...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Неверный ввод!");
            }
        }
    }

    
}


class Student{
    String firstName;
    String lastName;
    int credits = 12;
    String major;
    int year;
    Course[] courseslist = new Course[10];
    int sID;

    public Student(String firstName, String lastName, String major, int year, int sID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.year = year;
        this.sID = sID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getCredits() {
        return credits;
    }

    public String getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }

    public Course[] getCourseslist() {
        return courseslist;
    }

    public int getsID(){
        return sID;
    }

    public String decoder(int id){
        if(this.sID == id){
            return firstName+lastName+major;
        }
        return "No students with this id";
    }

    public void addCourse(Course course){
        if (credits >= course.getCredit()){
            this.credits-=course.credit;
            for(int i = 0; i < courseslist.length; i++){
                if( courseslist[i]==null){
                    courseslist[i] = course;
                    break;
                }
            }
        }
    }


}

class Course{
    int credit;
    String id;
    String P_name;
    int students_quota = 100;
    Student [] list = new Student[100];

    public Course(int credit, String id, String p_name) {
        this.credit = credit;
        this.id = id;
        P_name = p_name;
    }

    public String getId() {
        return id;
    }

    public String getP_name() {
        return P_name;
    }

    public int getStudents_quota() {
        return students_quota;
    }

    public int getCredit(){
        return credit;
    }

    public void addStudent(Student student){
        for(int i = 0; i < list.length; i++){
            if(list[i] == null){
                list[i]=student;
                break;
            }
        }
    }

    public Student[] getStudents() {
        return list;
    }
}

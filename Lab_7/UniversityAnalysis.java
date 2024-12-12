package Lab_7;

import java.util.*;

// Клас Студент
class Student {
    private String firstName;
    private String lastName;
    private String studentId;
    private double averageGrade;

    public Student(String firstName, String lastName, String studentId, double averageGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.averageGrade = averageGrade;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (ID: " + studentId + ", Grade: " + averageGrade + ")";
    }
}

// Клас Факультет
class Faculty {
    private final String name;
    private List<Student> students;

    public Faculty(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }
}

// Клас Інститут
class Institute {
    private String name;
    private List<Faculty> faculties;

    public Institute(String name) {
        this.name = name;
        this.faculties = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }
}

public class UniversityAnalysis {

    public static void main(String[] args) {
        // Створення студентів
        Student s1 = new Student("John", "Doe", "001", 96.5);
        Student s2 = new Student("Jane", "Smith", "002", 92.0);
        Student s3 = new Student("Alice", "Johnson", "003", 98.0);
        Student s4 = new Student("Bob", "Brown", "004", 88.5);

        // Створення факультетів
        Faculty f1 = new Faculty("Engineering");
        f1.addStudent(s1);
        f1.addStudent(s2);

        Faculty f2 = new Faculty("Science");
        f2.addStudent(s3);
        f2.addStudent(s4);

        // Створення інституту
        Institute institute = new Institute("Tech Institute");
        institute.addFaculty(f1);
        institute.addFaculty(f2);

        // Завдання 1: Знайти загальну кількість студентів (типізований цикл for-each)
        int totalStudents = 0;
        for (Faculty faculty : institute.getFaculties()) {
            totalStudents += faculty.getStudents().size();
        }
        System.out.println("Загальна кількість студентів: " + totalStudents);

        // Завдання 2: Знайти факультет з найбільшою кількістю студентів (нетипізований ітератор)
        String maxFacultyName = "";
        int maxStudents = 0;
        Iterator facultiesIterator = institute.getFaculties().iterator();
        while (facultiesIterator.hasNext()) {
            Faculty faculty = (Faculty) facultiesIterator.next();
            if (faculty.getStudents().size() > maxStudents) {
                maxStudents = faculty.getStudents().size();
                maxFacultyName = faculty.getName();
            }
        }
        System.out.println("Факультет з найбільшою кількістю студентів: " + maxFacultyName);

        // Завдання 3: Скласти список студентів із середнім балом 95..100 (типізований ітератор)
        List<Student> topStudents = new ArrayList<>();
        for (Faculty faculty : institute.getFaculties()) {
            Iterator<Student> studentIterator = faculty.getStudents().iterator();
            while (studentIterator.hasNext()) {
                Student student = studentIterator.next();
                if (student.getAverageGrade() >= 95 && student.getAverageGrade() <= 100) {
                    topStudents.add(student);
                }
            }
        }

        System.out.println("Список студентів із середнім балом 95..100:");
        for (Student student : topStudents) {
            System.out.println(student);
        }
    }
}

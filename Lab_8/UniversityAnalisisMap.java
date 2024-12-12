package Lab_8;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentId, student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }
}

// Клас Факультет
class Faculty {
    private final String name;
    private Set<Student> students;

    public Faculty(String name) {
        this.name = name;
        this.students = new HashSet<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Set<Student> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }
}

// Клас Інститут
class Institute {
    private String name;
    private Set<Faculty> faculties;

    public Institute(String name) {
        this.name = name;
        this.faculties = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public Set<Faculty> getFaculties() {
        return faculties;
    }
}

public class UniversityAnalisisMap {

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
        Set<Student> topStudents = new HashSet<>();
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

        // Додаткова функціональність: Використання Map для зберігання факультетів за назвою
        Map<String, Faculty> facultyMap = new HashMap<>();
        for (Faculty faculty : institute.getFaculties()) {
            facultyMap.put(faculty.getName(), faculty);
        }

        // Приклад: Знайти факультет за назвою
        String searchFacultyName = "Engineering";
        Faculty foundFaculty = facultyMap.get(searchFacultyName);
        if (foundFaculty != null) {
            System.out.println("Знайдений факультет: " + foundFaculty.getName());
        } else {
            System.out.println("Факультет не знайдено.");
        }
    }
}

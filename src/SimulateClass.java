import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class SimulateClass {

    private static Set<Student> students;
    private static List<Trainer> trainers;
    private static List<Group> groups;
    private static Set<Student> studentsRo16, studentsRo17, studentsRo18, studentsRo19;
    private static Trainer trainer1, trainer2, trainer3;


    public static void main(String[] args)  {
        createClassIerarchy();
        printStudents();
        printTrainers();
        printGroups();

    }

    private static void printStudents() {
        System.out.println("Students: " + students);

    }

    private static void printTrainers() {
        System.out.println("Trainers: " + trainers);

    }

    private static void printGroups() {
        System.out.println("Groups: " + groups);

    }

    private static void createClassIerarchy()  {

        addStudents();
        addTrainers();
        addGroups();

    }

    private static void addGroups() {
        Group javaRo16 = new Group(trainer1, studentsRo16);
        Group javaRo17 = new Group(trainer2, studentsRo17);
        Group javaRo18 = new Group(trainer1, studentsRo18);
        Group javaRo19 = new Group(null, studentsRo19);

        groups = Arrays.asList(javaRo16, javaRo17, javaRo18, javaRo19);
        javaRo16.setTrainer(trainer3);

        //System.out.println(javaRo16);
    }

    private static void addTrainers() {
        trainer1 = new Trainer("Paula", "Popa", LocalDate.of(1993, Month.APRIL, 10), false);
        trainer2 = new Trainer("Bogdan", "Tip", LocalDate.of(1993, Month.APRIL, 10), false);
        trainer3 = new Trainer("Matei", "Luncan", LocalDate.of(1993, Month.APRIL, 10), false);

        trainers = Arrays.asList(trainer1, trainer2, trainer3);
        //System.out.println(trainer1);
    }

    private static void addStudents() {
        Student student1 = new Student("Ana", "Popescu", LocalDate.of(1997, Month.DECEMBER, 15), false);
        //System.out.println(student1);
        Student student2 = new Student("Simona", "Malita", LocalDate.of(1997, Month.DECEMBER, 15), false);
        Student student3 = new Student("Alex", "Sabau", LocalDate.of(1997, Month.DECEMBER, 15), false);
        Student student4 = new Student("Radu", "Ciordas", LocalDate.of(1997, Month.DECEMBER, 15), false);
        Student student5 = new Student("Georgiana", "Marincas", LocalDate.of(1997, Month.DECEMBER, 15), false);
        Student student6 = new Student("Maria", "Vladimirescu", LocalDate.of(1997, Month.DECEMBER, 15), false);
        Student student7 = new Student("Adrian", "Pop", LocalDate.of(1997, Month.DECEMBER, 15), false);
        Student student8 = new Student("Camelia", "Curpas", LocalDate.of(1997, Month.DECEMBER, 15), false);
        Student student9 = new Student("Andrei", "Glivan", LocalDate.of(1997, Month.DECEMBER, 15), false);
        Student student10 = new Student("Marius", "Manole", LocalDate.of(1997, Month.DECEMBER, 15), false);

        students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);

        studentsRo16 = new HashSet<>();
        studentsRo16.add(student1);
        studentsRo16.add(student2);
        studentsRo16.add(student3);

        studentsRo17 = new HashSet<>();
        studentsRo17.add(student4);
        studentsRo17.add(student5);
        studentsRo17.add(student6);

        studentsRo18 = new HashSet<>();
        studentsRo18.add(student7);
        studentsRo18.add(student8);

        studentsRo19 = new HashSet<>();
        studentsRo19.add(student9);
        studentsRo19.add(student10);
    }
}
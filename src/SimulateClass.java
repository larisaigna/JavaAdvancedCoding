import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class SimulateClass {

    private static Set<Student> students;
    private static List<Trainer> trainers;
    private static List<Group> groups;
    private static Set<Student> studentsRo16, studentsRo17, studentsRo18, studentsRo19;
    private static Trainer trainer1, trainer2, trainer3;


    public static void main(String[] args) {
        createClassIerarchy();
        printStudents();
        printTrainers();
        printGroups();
        printStudentsAlphabetically();
        showGroupWithMaxNumberOfStudentsClassicMethod();
        showAllGroupsWithMaxNumberOfStudentsClassicMethod();
        showAllStudentsYoungerThan25(25);

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

    private static void createClassIerarchy() {

        addStudents();
        addTrainers();
        addGroups();

    }

    private static void printStudentsAlphabetically() {
        students.stream().sorted(Comparator.comparing(Student::getLastName)).forEach(System.out::println);

        //.sorted(Comparator.comparing(student -> student.getLastName()))
        //.forEach(student -> System.out.println(student));
    }

    private static void showGroupWithMaxNumberOfStudentsClassicMethod() {
        Group aux = new Group(null, new LinkedHashSet<>());
        for (Group group : groups) {
            if (group.getStudentList().size() >= aux.getStudentList().size()) {
                aux = group;
            }
        }
        System.out.println(aux);
    }

    private static void showAllGroupsWithMaxNumberOfStudentsClassicMethod() {

        List<Group> groupList = new ArrayList<>();
        Group maxSizeGroup = new Group(null, new LinkedHashSet<>());

        for (Group group : groups) {
            if (group.getStudentList().size() > maxSizeGroup.getStudentList().size()) {
                maxSizeGroup = group;
                groupList = new ArrayList<>();
                groupList.add(group);

            } else if (group.getStudentList().size() == maxSizeGroup.getStudentList().size()) {
                groupList.add(group);
            }
        }
        System.out.println("Groups with max. number of students are: \n" + groupList);
    }

    private static void showGroupWithMaxNumberOfStudentsFunctionalMethod() {

    }

    private static void showAllStudentsYoungerThan25(int age) {
        System.out.println("Students younger than 25: ");
        students.stream()
                .filter(student -> student.getAge() < age)
                .forEach(student -> System.out.println(student));


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
        Student student1 = new Student("Ana", "Popescu", LocalDate.of(1993, Month.DECEMBER, 11), false);
        //System.out.println(student1);
        Student student2 = new Student("Simona", "Malita", LocalDate.of(1991, Month.DECEMBER, 15), false);
        Student student3 = new Student("Alex", "Sabau", LocalDate.of(1983, Month.DECEMBER, 15), false);
        Student student4 = new Student("Radu", "Ciordas", LocalDate.of(1985, Month.DECEMBER, 15), false);
        Student student5 = new Student("Georgiana", "Marincas", LocalDate.of(1998, Month.DECEMBER, 15), false);
        Student student6 = new Student("Maria", "Vladimirescu", LocalDate.of(1991, Month.DECEMBER, 15), false);
        Student student7 = new Student("Adrian", "Pop", LocalDate.of(1997, Month.DECEMBER, 15), false);
        Student student8 = new Student("Camelia", "Curpas", LocalDate.of(1997, Month.DECEMBER, 15), false);
        Student student9 = new Student("Andrei", "Glivan", LocalDate.of(1980, Month.DECEMBER, 15), false);
        Student student10 = new Student("Marius", "Manole", LocalDate.of(1978, Month.DECEMBER, 15), false);

        students = new LinkedHashSet<>();
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

        studentsRo16 = new LinkedHashSet<>();
        studentsRo16.add(student1);
        studentsRo16.add(student2);
        studentsRo16.add(student3);

        studentsRo17 = new LinkedHashSet<>();
        studentsRo17.add(student4);
        studentsRo17.add(student5);
        studentsRo17.add(student6);

        studentsRo18 = new LinkedHashSet<>();
        studentsRo18.add(student7);
        studentsRo18.add(student8);

        studentsRo19 = new LinkedHashSet<>();
        studentsRo19.add(student9);
        studentsRo19.add(student10);
    }
}
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimulateClass {
    public static void main(String[] args) {
        createClassIerarchy();
        
    }

    private static void createClassIerarchy() {
        Student student1 = new Student("Ana", "Popescu", LocalDate.of(1997, Month.DECEMBER,15), false);
        System.out.println(student1);
        Student student2 = new Student("Simona", "Malita", LocalDate.of(1997, Month.DECEMBER,15), false);
        Student student3 = new Student("Alex", "Sabau", LocalDate.of(1997, Month.DECEMBER,15), false);
        Student student4 = new Student("Radu", "Ciordas", LocalDate.of(1997, Month.DECEMBER,15), false);
        Student student5 = new Student("Georgiana", "Marincas", LocalDate.of(1997, Month.DECEMBER,15), false);
        Student student6 = new Student("Maria", "Vladimirescu", LocalDate.of(1997, Month.DECEMBER,15), false);
        Student student7 = new Student("Adrian", "Pop", LocalDate.of(1997, Month.DECEMBER,15), false);
        Student student8 = new Student("Camelia", "Curpas", LocalDate.of(1997, Month.DECEMBER,15), false);
        Student student9 = new Student("Andrei", "Glivan", LocalDate.of(1997, Month.DECEMBER,15), false);
        Student student10 = new Student("Marius", "Manole", LocalDate.of(1997, Month.DECEMBER,15), false);

        List<Student> studentsRo16 = Arrays.asList(student1, student2, student3);
        List<Student> studentsRo17 = Arrays.asList(student4, student5);
        List<Student> studentsRo18 = Arrays.asList(student6, student7);
        List<Student> studentsRo19 = Arrays.asList(student8, student9, student10);


        Trainer trainer1 = new Trainer("Paula", "Popa", LocalDate.of(1993, Month.APRIL, 10),false);
        Trainer trainer2 = new Trainer("Bogdan", "Tip", LocalDate.of(1993, Month.APRIL, 10),false);
        Trainer trainer3 = new Trainer("Matei", "Luncan", LocalDate.of(1993, Month.APRIL, 10),false);
        System.out.println(trainer1);

        Group javaRo16 = new Group(trainer1,studentsRo16);
        Group javaRo17 = new Group(trainer2,studentsRo17);
        Group javaRo18 = new Group(trainer1,studentsRo18);
        Group javaRo19 = new Group(null,studentsRo19);
        javaRo16.setTrainer(trainer3);
    }
}
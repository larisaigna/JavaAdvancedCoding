import java.time.LocalDate;

public class Student extends Person {

    boolean hasPreviousJavaKnowledge;

    public Student(String firstName, String lastName, LocalDate dateOfBirth, boolean hasPreviousJavaKnowledge) {
        super(firstName, lastName, dateOfBirth);
        this.hasPreviousJavaKnowledge = hasPreviousJavaKnowledge;
    }


    public String getLastName() {
        return super.getLastName();
    }

    public LocalDate getDateOfBirth() {

        return super.getDateOfBirth();
    }

    public int getAge() {

        return LocalDate.now().getYear() - super.getDateOfBirth().getYear();
    }

    @Override
    public String toString() {
        return super.toString() +
                ", hasPreviousJavaKnowledge=" + hasPreviousJavaKnowledge +
                '}';
    }
}

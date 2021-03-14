import java.util.List;
import java.util.Set;

public class Group {

    private Trainer trainer;
    private Set<Student> studentList;

    public Group(Trainer trainer, Set<Student> studentList) {
        this.trainer = trainer;
        if (studentList.size() <= 5) {
            this.studentList = studentList;
        } else {
            throw new MaximumNumberOfStudentsReached("Students limit excedeed");
        }

    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public void setStudentList(Set<Student> studentList) {
        if (studentList.size() <= 5) {
            this.studentList = studentList;
        } else {
            throw new MaximumNumberOfStudentsReached("Students limit excedeed");
        }
    }

    @Override
    public String toString() {
        return "Group{" +
                "trainer=" + trainer +
                ", studentList=" + studentList +
                '}';
    }
}

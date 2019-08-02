import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity

public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @OneToMany(mappedBy = "school")
    private List<Student> students = new ArrayList<>();


    /**
     * @return
     */
    @Override
    public String toString() {
        return "School{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public School setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public School setName(String name) {
        this.name = name;
        return this;
    }

    public List<Student> getStudents() {
        return students;
    }

    public School setStudents(List<Student> students) {
        this.students = students;
        return this;
    }

    public void addStudent(Student student){
        students.add(student);
        student.setSchool(null);

    }

    public void removeStudent(Student student){
        students.remove(student);
        student.setSchool(null);
    }
}

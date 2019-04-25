package SpringBoot.Dao;

import SpringBoot.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
@Qualifier("studentDao")
public class StudensDaoImpl implements StudensDao {

    private static Map<Integer,Student> students;

    static  {
        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1,"Said", "Computer Scient"));
                put(2, new Student(2,"Alex", "Finance"));
                put(3, new Student(3,"Anna", "Maths"));
            }
        };
    }

    @Override
    public Collection<Student> getAllStudents() {
        return this.students.values();
    }

    @Override
    public Student getById(int id) {
        return this.students.get(id);
    }

    @Override
    public void removeStudentById(int id) {
        this.students.remove(id);
    }

    @Override
    public void updateStudent(Student student) {
        Student s = students.get(student.getId());
        s.setCourse(student.getCourse());
        s.setName(student.getName());
        students.put(student.getId(), student);
    }

    @Override
    public void insertStudentToDb(Student student) {
        this.students.put(student.getId(), student);
    }
}

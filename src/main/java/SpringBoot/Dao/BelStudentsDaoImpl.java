package SpringBoot.Dao;

import SpringBoot.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;

@Repository
@Qualifier("bel")
public class BelStudentsDaoImpl implements StudensDao {

    Connection connection;

    @Override
    public Collection<Student> getAllStudents() {
        return new ArrayList<Student>(){
            {
                add(new Student(1, "Mario", "nothing"));
            }
        };
    }

    @Override
    public Student getById(int id) {
        return null;
    }

    @Override
    public void removeStudentById(int id) {

    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void insertStudentToDb(Student student) {

    }
}

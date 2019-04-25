package SpringBoot.Service;

import SpringBoot.Dao.StudensDao;
import SpringBoot.Dao.StudensDaoImpl;
import SpringBoot.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    @Qualifier("studentDao")
    private StudensDao studensDao;

    public Collection<Student> getAllStudents() {
        return this.studensDao.getAllStudents();
    }

    public Student getById(int id) {
        return this.studensDao.getById(id);
    }

    public void removeStudenById(int id) {
        this.studensDao.removeStudentById(id);
    }
    public void updateStudent(Student student) {
        this.studensDao.updateStudent(student);
    }

    public void insertStudent(Student student) {
        this.studensDao.insertStudentToDb(student);
    }
}

package SpringBoot.Dao;

import SpringBoot.Entity.Student;

import java.util.Collection;

public interface StudensDao {
    Collection<Student> getAllStudents();

    Student getById(int id);

    void removeStudentById(int id);

    void updateStudent(Student student);

    void insertStudentToDb(Student student);
}

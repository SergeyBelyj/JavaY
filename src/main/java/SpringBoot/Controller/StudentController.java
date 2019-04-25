package SpringBoot.Controller;

import SpringBoot.Entity.Student;
import SpringBoot.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents() {
        return this.studentService.getAllStudents();
    }

    @RequestMapping(value = "/{id}" , method = RequestMethod.GET)
    public Student getById(@PathVariable("id") int id) {
        return studentService.getById(id);
    }

    @RequestMapping(value = "/{id}" , method = RequestMethod.DELETE)
    public void deleteStudentById (@PathVariable("id") int id) {
        studentService.removeStudenById(id);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public void updateStudent(@RequestBody Student student) {
        this.studentService.updateStudent(student);
    }
    @RequestMapping(method = RequestMethod.POST)
    public void insertStudent(@RequestBody Student student) {
        this.studentService.insertStudent(student);
    }
}

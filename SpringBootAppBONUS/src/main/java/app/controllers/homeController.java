package app.controllers;

import app.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class homeController {

    public List<Student> students;

    @GetMapping(value = "")
    public ModelAndView home(ModelAndView modelAndView) {
        Student student = new Student("Peter", 6.00);
        Student student2 = new Student("Ivan", 5.00);
        Student student3 = new Student("Kaloyan", 4.00);
        students.add(student);
        students.add(student2);
        students.add(student3);

        modelAndView.setViewName("index");
        modelAndView.addObject("students", students);
        return modelAndView;
    }
}

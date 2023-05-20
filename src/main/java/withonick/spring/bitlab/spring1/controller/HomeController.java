package withonick.spring.bitlab.spring1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import withonick.spring.bitlab.spring1.db.DBManager;
import withonick.spring.bitlab.spring1.db.Student;

import java.util.ArrayList;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String index(Model model){
        ArrayList<Student> students = DBManager.getStudents();
        model.addAttribute("student",students);
        return "index";
    }
    @PostMapping(value = "/addStudent")
    public String addStudent(Student student) {
        DBManager.addStudent(student);
        return "redirect:/";
    }
    @GetMapping(value = "/addStudent")
    public String addStudent(){
        return "addStudent";
    }


}

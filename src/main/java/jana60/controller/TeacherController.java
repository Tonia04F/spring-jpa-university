package jana60.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import jana60.model.Department;
import jana60.model.Teacher;
import jana60.repository.TeacherRepository;

@Controller
@RequestMapping("/")
public class TeacherController {
	
	@Autowired
	private TeacherRepository repo;
	
	@GetMapping("/teachers")
	private String teachers(Model model) {
		List<Teacher> insegnanti = (List<Teacher>)repo.findAll();
		model.addAttribute("tList", insegnanti);
		return "teachers";
	}

}

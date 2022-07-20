package jana60.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jana60.model.Department;
import jana60.repository.DepartmentRepository;

@Controller
@RequestMapping("/departments")
public class DepartmentController {
	
	
	private DepartmentRepository repo;
	
	public String listaDip(Model model) {
		
			List<Department> listaDip = (List<Department>)repo.findAll();
			model.addAttribute("listaDipartimenti" , listaDip);
			return "listaDip";
	}
	

}

package jana60.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.server.ResponseStatusException;

import jana60.model.Department;
import jana60.repository.DepartmentRepository;
import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@Controller
@RequestMapping("/department")
public class DepartmentController {
	
	@Autowired
	private DepartmentRepository repo;
	
	@GetMapping
	public String listaDip(Model model) {
		
			List<Department> listaDip = (List<Department>)repo.findAllByOrderByName();
			model.addAttribute("listaDipartimenti" , listaDip);
			return "departments";
	}
	
	//creo metodo che mostra i dettagli di ogni dipartimento
	@GetMapping("/dettagli/{id}")
	  public String departmentDetail(@PathVariable("id") Integer departmentId, Model model) {
	    Department dett = repo.findById(departmentId).get();
	    model.addAttribute("department", dett);
	   return"/departmentDetails";
	  }
}

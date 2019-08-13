package in.javahome.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import in.javahome.mvc.dao.IEmployeeDao;
import in.javahome.mvc.pojo.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	private IEmployeeDao empDao;

	@RequestMapping(path = "/welcome", method = RequestMethod.GET)
	public String welcome() {
		return "Welcome to sprint boot RESTFule Api !!!!";
	}
	
	@RequestMapping(path="/employee", method = RequestMethod.POST)
	@ResponseStatus(code = HttpStatus.CREATED)
	public void addEmployee(@RequestBody Employee emp) {
		empDao.save(emp);
	}
	
	@GetMapping(path = "/employee")
	public Employee getEmployee(@RequestParam(name = "id") Integer id) {
		return empDao.findById(id).get();
	}
	@GetMapping(path = "/employees")
	public List<Employee> getAllEmployees(){
		List<Employee> employees = new ArrayList<>();
		empDao.findAll().forEach(employees::add);
		return employees;
	}
	@GetMapping(path = "/employee/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public void deleteEmployee(@PathVariable Integer id){
		empDao.deleteById(id);
	}
}

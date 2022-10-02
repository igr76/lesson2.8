import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("\employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("\add")
    public Employee add(@RequestParam String Name,
                        @RequestParam int department,@RequestParam double salary) throws EmployeeAlreadyAddedException {
        return employeeService.add(Name,department,salary);
    }
    @GetMapping("\find")
    public Employee find(@RequestParam String firstName,
                         @RequestParam String lastName) throws EmployeeNotFoundException {
        return employeeService.find(firstName);
    }
    @GetMapping("\remove")
    public Employee remove(@RequestParam String Name,
                           @RequestParam  int department,@RequestParam double salary) throws EmployeeNotFoundException {
        return employeeService.remove(Name,department,salary);
    }

}


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    private final DepartmentService departmentService;


    public DepartmentController(DepartmentService departmentService) {

        this.departmentService = departmentService;
    }
    @GetMapping(path = "/max-salary")
    public Employee MaxSalaryFromDepartment(@RequestParam("departmentId") int department){
        return departmentService.departmentMax(department);
    }
    @GetMapping(path = "/min-salary")
    public Employee MinSalaryFromDepartment(@RequestParam("departmentId") int department){
        return departmentService.departmentMin(department);
    }
    @GetMapping(path = "/all", params = "departmentId")
    public double AllSalaryFromDepartment(@RequestParam("departmentId") int department){
       double summ = departmentService.departmentSumm(department);
       return System.out.println("В отделе : " + department +  "Сумма зарплат в месяце : " +  summ);
    }


}

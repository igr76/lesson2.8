
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
    public double MaxSalaryFromDepartment(@RequestParam("departmentId") int department){
        return DepartmentService.departmentMax(department);
    }
    @GetMapping(path = "/min-salary")
    public double MinSalaryFromDepartment(@RequestParam("departmentId") int department){
        return DepartmentService.departmentMin(department);
    }
    @GetMapping(path = "/all", params = "departmentId")
    public double AllSalaryFromDepartment(@RequestParam("departmentId") int department){
        return DepartmentService.departmentSumm(department);
    }


}

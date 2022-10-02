import org.springframework.stereotype.Service;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Long.SIZE;

@Service
public class EmployeeService {
    public static final Map<String, Employee> employees = new HashMap<>();

   // public EmployeeService() {        this.employees = new ArrayList<>();


    public Map<String,Employee> add(String Name,  int department,double salary) {
        Employee employee = new Employee(Name, department,salary);

        return employees.values().stream()
                .filter(e -> {Name != e.getName(Name)})
                .employees.put(Name, employee)
                .orElseThrow(() -> new EmployeeAlreadyAddedException());


    }
    public Employee remove(String Name, int department,double salary)  {
        Employee employee = new Employee(Name, department,salary);
        return employees.values().stream()
                .filter(e -> e.getName(Name))
                .employees.put(Name, employee)
                .orElseThrow(() -> new EmployeeAlreadyAddedException());


    }
    public Employee find(String Name) {
        if (employees.containsKey(Name)) {
            return employees.get(Name);
        } throw new EmployeeNotFoundException();


    }


}

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DepartmentService {
    public DepartmentService(EmployeeService employeeService) {
    }

    public static Employee departmentMin(int x) {
      //  Employee min = Double.MAX_VALUE;
       /* for (Map.Entry<String, Employee> entry : EmployeeService.employees.entrySet()) {
            Employee employee = entry.getValue();
            if (employee.getDepartment() == x && employee.getSalary() < min) {
                min = employee.getSalary();
            }
        }*/
      Employee employee = EmployeeService.employees.values().stream()
                .filter(e -> e.getDepartment() == x)
                .min( (a,b) -> (int) (a.getSalary()- b.getSalary())).get();
     //   if (min != Double.MAX_VALUE) {
     //       System.out.println("В отделе : " + x + "Минимальная " +
     //               "зарплата в месяце : " + min);
     //   } else System.out.println("нет данных");
        return employee;
    }

    public static Employee departmentMax(int x) {
       // double max = 0;
       /* for (Map.Entry<String, Employee> entry : EmployeeService.employees.entrySet()) {
            Employee employee = entry.getValue();
            if (employee.getDepartment() == x && employee.getSalary() > max) {
                max = employee.getSalary();
            }
        }*/
        Employee employee =EmployeeService.employees.values().stream()
                .filter(e -> e.getDepartment() == x)
                .max( (a,b) -> (int) (a.getSalary()- b.getSalary())).get();
     //   if (max != 0) {
      //      System.out.println("В отделе : " + x + "Максимальная " +
      //              "зарплата в месяце : " + max);
     //   } else System.out.println("нет данных");
        return employee;
    }
    public  static double departmentSumm(int x) {
        double summ = 0;
       /* for (Map.Entry<String, Employee> entry : EmployeeService.employees.entrySet()) {
            Employee employee = entry.getValue();
            if (x == employee.getDepartment()) {
                summ = summ + employee.getSalary();

            }
        }  System.out.println("В отделе : " + x +  "Сумма зарплат в месяце : " +  summ);*/
        EmployeeService.employees.values().stream()
                .filter(e -> e.getDepartment() == x)
                .forEach(e -> summ +=e.setSalary());
        return summ;
    }
    public static Employee allEmployeeOfDepartment(int x) {
       return List<Employee>  employeeList =EmployeeService.employees.values().stream()
                .filter(e -> e.getDepartment() == x)
                .collect(Collectors.toList());
    }


}

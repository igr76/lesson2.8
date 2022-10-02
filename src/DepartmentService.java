import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class DepartmentService {

    public static double departmentMin(int x) {
        double min = Double.MAX_VALUE;
        for (Map.Entry<String, Employee> entry : EmployeeService.employees.entrySet()) {
            Employee employee = entry.getValue();
            if (employee.getDepartment() == x && employee.getSalary() < min) {
                min = employee.getSalary();
            }
        }
     //   if (min != Double.MAX_VALUE) {
     //       System.out.println("В отделе : " + x + "Минимальная " +
     //               "зарплата в месяце : " + min);
     //   } else System.out.println("нет данных");
        return min;
    }

    public static double departmentMax(int x) {
        double max = 0;
        for (Map.Entry<String, Employee> entry : EmployeeService.employees.entrySet()) {
            Employee employee = entry.getValue();
            if (employee.getDepartment() == x && employee.getSalary() > max) {
                max = employee.getSalary();
            }
        }
     //   if (max != 0) {
      //      System.out.println("В отделе : " + x + "Максимальная " +
      //              "зарплата в месяце : " + max);
     //   } else System.out.println("нет данных");
        return max;
    }
    public  static double departmentSumm(int x) {
        double summ = 0;
        for (Map.Entry<String, Employee> entry : EmployeeService.employees.entrySet()) {
            Employee employee = entry.getValue();
            if (x == employee.getDepartment()) {
                summ = summ + employee.getSalary();

            }
        } // System.out.println("В отделе : " + x +  "Сумма зарплат в месяце : " +  summ);
        return summ;
    }


}

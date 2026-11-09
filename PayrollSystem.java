import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PayrollSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee("E101", "Hasan", 3500, LocalDate.of(2019, 2, 10), 600));
        employees.add(new FullTimeEmployee("E102", "Mohammed", 5200, LocalDate.of(2017, 9, 5), 900));
        employees.add(new ContractorEmployee("C101", "Yahya", LocalDate.of(2024, 3, 1), 30, 100));
        employees.add(new ContractorEmployee("C102", "Moataz", LocalDate.of(2025, 8, 15), 45, 90));

        // الترتيب باستخدام compareTo
        Collections.sort(employees);

        double performanceScore = 90;
        System.out.println("===== Payroll Report =====");
        for (Employee e : employees) {
            System.out.println(e);
            System.out.printf("  Tax: %.2f | Bonus: %.2f | Net Salary: %.2f%n",
                    e.calculateTax(),
                    e.calculateBonus(performanceScore),
                    e.calculateNetSalary());
        }
    }
}

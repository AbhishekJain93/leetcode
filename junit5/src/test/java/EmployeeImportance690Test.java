import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeImportance690Test {

    @Test
    public void happy_case() {
        List<Employee> list = new ArrayList<>();
        Employee e1 = new Employee();
        e1.id = 1;
        e1.importance = 5;
        e1.subordinates = List.of(2, 3);
        Employee e2 = new Employee();
        e2.id = 2;
        e2.importance = 3;
        e2.subordinates = List.of();
        Employee e3 = new Employee();
        e3.id = 3;
        e3.importance = 3;
        e3.subordinates = List.of();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        Assertions.assertEquals(new EmployeeImportance690().getImportance(list, 1), 11);
    }
}

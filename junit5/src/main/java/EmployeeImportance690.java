import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeImportance690 {
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> map = new HashMap<>();
        for (int i = 0; i < employees.size(); i++) {
            map.put(employees.get(i).id, employees.get(i));
        }

        return totalImportance(id, map);
    }

    private int totalImportance(int id, Map<Integer, Employee> map) {
        Employee parent = map.get(id);
        int pImportance = parent.importance;
        int childImportance = 0;

        for (Integer child : parent.subordinates) {
            childImportance += totalImportance(child, map);
        }

        return pImportance + childImportance;
    }
}

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};

package Java8Ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Main {
    public static void main(String []args){


        Employee emp1 = new Employee(1,"Bob","Senior");
        Employee emp2 = new Employee(2,"Mary","Junior");
        Employee emp3 = new Employee(3,"James","Associate");
        Employee emp4 = new Employee(4,"Brandon","Senior");
        Employee emp5 = new Employee(5,"Alice","Junior");
        Employee emp6 = new Employee(6,"Jeremiah","Senior");
        Employee emp7 = new Employee(7,"Zack","Associate");

        List<Employee> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);
        empList.add(emp6);
        empList.add(emp7);

       // System.out.println(empList);
        System.out.println(groupByTitle(empList));

    }
    public static Map<String,List<Employee>> groupByTitle(List<Employee> empList){ //

//        Map<String, List<Employee>> resultMap = new HashMap<>();

//        for(int i=0;i<empList.size();i++){
//            Employee emp = empList.get(i);
//            List<Employee> employeeSubList = resultMap.getOrDefault(emp.getTitle(),new ArrayList<Employee>());
//            employeeSubList.add(emp);
//            resultMap.put(emp.getTitle(),employeeSubList);
//
//
//        }
//        return resultMap;
        return empList.stream().collect(Collectors.groupingBy(Employee::getTitle));

    }
}

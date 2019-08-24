package pl.sdacademy.javapoz19programowanie1.employee;


import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class EmployeeServiceTest {

    @Test
    public void findAllShouldReturnGivenEmployes() {
        //given -> dajemy dane

        List<Employee> employees = Arrays.asList(
                new Employee("name-1", 26, 5000),
                new Employee("name-2", 20, 2000),
                new Employee("name-3", 24, 5100)

        );
        EmployeeService employeeService = new EmployeeService(new InMemoryEmployeeRepository(employees));
        // when -> co ma robic
        List<Employee> result = employeeService.findAll();

        //then -> wynik
        Assert.assertEquals(employees, result);
    }

        @Test
       public void sortByAgeShouldReturnListOfEmployeesSortedByAge(){
            List<Employee> employees = Arrays.asList(
                new Employee("name-1", 36, 2000),
                new Employee("name-2", 25, 3000),
                new Employee("name-3", 46, 1100)
        );
            EmployeeService employeeService = new EmployeeService(new InMemoryEmployeeRepository(employees));
            List<Employee> result = employeeService.sortByAge();
            Assert.assertEquals(employees.get(1),result.get(0));
            Assert.assertEquals(employees.get(0),result.get(1));
            Assert.assertEquals(employees.get(2),result.get(2));

        }
    @Test
    public void sortBySalaryShouldReturnListOfEmployeesSortedBySalary(){
        List<Employee> employees = Arrays.asList(
                new Employee("name-1", 36, 2000),
                new Employee("name-2", 25, 3000),
                new Employee("name-3", 46, 1100)
        );
        EmployeeService employeeService = new EmployeeService(new InMemoryEmployeeRepository(employees));
        List<Employee> result = employeeService.sortByAge();
        Assert.assertEquals(employees.get(1),result.get(0));
        Assert.assertEquals(employees.get(0),result.get(1));
        Assert.assertEquals(employees.get(2),result.get(2));

    }
    @Test
     public void  groupByAgeSegmentShouldReturnMapWithAgeSegmentAsKeyAndListOfEmployeesAsValue(){
        // given
        EmployeeService employeeService = new EmployeeService(new InMemoryEmployeeRepository());
        //when
        Map<String,List<Employee>> result = employeeService.groupByAgeSegment();
        //then
        System.out.println();
    }
    @Test
    public void getAvgSalaryOfAgeSegment_ShouldReturnAverageOfSalaryForEmployeesInAgeSegment(){
        List<Employee> employees = Arrays.asList(
                new Employee("name-1", 31, 1000),
                new Employee("name-2", 33, 2000),
                new Employee("name-3", 36, 50000)
        );

        EmployeeService employeeService = new EmployeeService(new InMemoryEmployeeRepository(employees));
        Double result = employeeService.getAvgSalaryOfAgeSegment(32);

        Assert.assertEquals(1500.0,result,0.1);

    }

    @Test
    public void getAvgSalaryOfAgeSegment_ShouldReturnZeroWhenEmployeesForGivenAgeSementAreNotEcit(){

        List<Employee> employees = Arrays.asList(
                new Employee("name-1", 31, 2500),
                new Employee("name-2", 33, 5000),
                new Employee("name-3", 36, 50000)
        );

        EmployeeService employeeService = new EmployeeService(new InMemoryEmployeeRepository(employees));
        Double result = employeeService.getAvgSalaryOfAgeSegment(50);

        Assert.assertEquals(0.0,result,0.1);

    }

}
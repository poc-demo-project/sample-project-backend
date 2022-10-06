package com.example.demo;
import java.util.List;


import org.springframework.data.domain.Page;


public interface EmployeeService 
{
List<Employee> getAllEmployees();
void saveEmployee(Employee employee);
void deleteEmployeeById(long id);
Page<Employee> findPaginated(int pageNo, int pageSize);
//void searchEmployee(String Subtopic);
}

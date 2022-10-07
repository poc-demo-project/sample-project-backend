package com.example.demo;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;



@Service
public class EmployeeServiceimp implements EmployeeService {
	
@Autowired
private EmployeeRepository employeeRepository;

@Override
public List<Employee> getAllEmployees() {
return employeeRepository.findAll();
}

@Override
public void saveEmployee(Employee employee) {
this.employeeRepository.save(employee);
}



@Override
public void deleteEmployeeById(long id) {
this.employeeRepository.deleteById(id);
}

@Override
public Page<Employee> findPaginated(int pageNo, int pageSize) {
Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
return this.employeeRepository.findAll(pageable);
}
}




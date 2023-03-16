// Java Program to Illustrate DepartmentService File

// Importing package to this code fragment
package com.example.BackendSpringbootNew.service;
// Importing required classes
import com.example.BackendSpringbootNew.model.Department;

import java.util.List;

// Interface
public interface DepartmentService {

	// Save operation
	Department saveDepartment(Department department);

	// Read operation
	List<Department> fetchDepartmentList();

	// Update operation
	Department updateDepartment(Department department,
								Long departmentId);

	// Delete operation
	void deleteDepartmentById(Long departmentId);
}

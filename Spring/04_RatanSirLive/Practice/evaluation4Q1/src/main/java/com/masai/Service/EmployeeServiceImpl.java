package com.masai.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exceptions.EmployeeException;
import com.masai.Model.Employee;
import com.masai.Model.EmployeeDTO;
import com.masai.Repo.EmployeeDao;

import net.bytebuddy.asm.Advice.Return;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;

	@Override
	public Employee registerEmployee(Employee emp) throws EmployeeException {

		Employee opt = dao.save(emp);

		return opt;

	}

	@Override
	public Employee getEmployeeById(Integer empId) throws EmployeeException {

		Optional<Employee> emp = dao.findById(empId);

		if (emp.isPresent()) {
			Employee em = emp.get();
			return em;
		}

		throw new EmployeeException("employee not present with id : " + empId);

	}

	@Override
	public List<Employee> getAllEmployeeDetails() throws EmployeeException {
		Optional<List<Employee>> emp = Optional.of(dao.findAll());

		if (emp.isPresent()) {
			List<Employee> em = emp.get();
			return em;
		}

		throw new EmployeeException("employee not present ");
	}

	@Override
	public Employee deleteEmployeeById(Integer empId) throws EmployeeException {

		Optional<Employee> emp = dao.findById(empId);

		if (emp.isPresent()) {
			Employee em = emp.get();

			dao.delete(em);
			return em;
		}

		throw new EmployeeException("employee not present ");
	}

	@Override
	public List<Employee> getEmployeeDetailsByAddress(String address) throws EmployeeException {

		Optional<List<Employee>> emp = Optional.of(dao.findByAddress(address));

		if (emp.isPresent()) {

			List<Employee> list = emp.get();

			return list;

		}
		throw new EmployeeException("not any employee with this address : " + address);

	}

	@Override
	public Employee updateEmployee(Employee emp) throws EmployeeException {
		
	Employee emp12 = dao.save(emp);
	
	if(emp12!= null) {
		return emp12;
	}
	
	
	throw new EmployeeException("not any employee foundd");

	}

	@Override
	public String[] getNameAndAddressOfEmplyeeById(Integer empId) throws EmployeeException {
		
		Optional<Employee> emp = dao.findById(empId);

		if (emp.isPresent()) {
			Employee jk = emp.get();
			String[] arr =new String[2];
			arr[0] = jk.getEmpName();
			arr[1] = jk.getAddress();
			return arr;
		}

		throw new EmployeeException("not any employee foundd");
	}

	@Override
	public List<EmployeeDTO> getNameAddressSalaryOfAllEmployee() throws EmployeeException {
		
		Optional<List<Employee>> emp =Optional.of(dao.findAll());
		List<EmployeeDTO> listdto = new ArrayList<>();

		if (emp.isPresent()) {

			List<Employee> list = emp.get();
			for(int i = 0;i<list.size();i++) {
				
				EmployeeDTO dto = new EmployeeDTO();
				dto.setAddress(list.get(i).getAddress());
				dto.setName(list.get(i).getEmpName());
				dto.setSalary(list.get(i).getSalary());
				
				listdto.add(dto);
			}

			return listdto;

		}
		throw new EmployeeException("not any employee presetn : "  );
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

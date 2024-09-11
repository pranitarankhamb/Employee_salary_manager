package EmployeeService;

import java.util.List;

import EmployeeModel.EmployeeModel;
import EmployeeModel.Leave_empModel;
import EmployeeRepository.EmployeeRepository;

public class EmployeeService {
	EmployeeRepository er = new EmployeeRepository();
	
	public int addEmployee(EmployeeModel em,String name)
	{
		return er.isEmployeePresent(em.getUsername(),em.getPassword())?-1:er.addEmployee(em,name)?1:0;
	}
//	---------------------------Employee List-----------------------------------------------------
	public List <EmployeeModel> employeelist()
	{
		return er.employeelist();
	}
//	-------------------------Delate Employee-------------------------------------------------------------
	public int isDelete(int id)
	{
		return er.isDelete(id)?1:0;
	}
	
//------------------------deleted Employee by using trigger--------------------------------------------
	public List <Leave_empModel> leaveEmpList()
	{
		return er.leaveEmpList();
	}
//--------------------------UPDATE EMPLOYEE--------------------------------------------------------------
	public boolean isUpdateEmployee(EmployeeModel em,String user,String pass)
	{
		return er.isUpdateEmployee(em,user,pass)?true:false;
	}
	
//-----------------------------SEARCH EMPLOYEE------------------------------------------------------
	public void isSerchEmployee(int id) {
		er.isSerchEmployee(id);
	}

}

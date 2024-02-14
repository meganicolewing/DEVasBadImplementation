package badImplementation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class thingsTest
{
	things wage_employee;
	things wage_employee_overtime;
	things salary_employee;
	things contract_employee;
	things employee_set;
	@BeforeEach
	void setUp() throws Exception
	{
		wage_employee = new things();
		wage_employee.add("Alice", 10.0,20.0, "Hourly");
		wage_employee_overtime = new things();
		wage_employee_overtime.add("Bob", 10.0,50.0, "Hourly");

		salary_employee = new things();
		salary_employee.add("Charlie", 10.0,50.0,"Salary");
		contract_employee = new things();
		contract_employee.add("David", 10.0, 50.0, "Contractor");
		
		employee_set = new things();
		employee_set.add("Alice", 10.0,20.0, "Hourly");
		employee_set.add("Bob", 10.0,50.0, "Hourly");
		employee_set.add("Charlie", 10.0,50.0,"Salary");
		employee_set.add("David", 10.0, 50.0, "Contractor");

		

		
	}

	@Test
	void testWage()
	{
		double[] expected_amount = new double[1];
		expected_amount[0] = 20.0 * 10.0;
		assertEquals(wage_employee.money()[0], expected_amount[0]);
		double[] expected_ot = new double[1];
		expected_ot[0] = 40.0 * 10.0 + 10.0 * 10.0 * 1.5;
		assertEquals(wage_employee_overtime.money()[0], expected_ot[0]);
	}

	@Test
	void testSalary()
	{
		double[] salary_amt = new double[1];
		salary_amt[0] = 40.0*10.0;
	    assertEquals(salary_employee.money()[0], salary_amt[0]);
	}
	
	@Test
	void testContractor()
	{
		double[] contract_amt = new double[1];
		contract_amt[0] = 50.0*10.0;
	    assertEquals(contract_employee.money()[0], contract_amt[0]);
	}
	
	@Test
	void testAll()
	{
		double[] expected_amounts = new double[4];
		expected_amounts[0] = 20.0 * 10.0;
		expected_amounts[1] = 40.0 * 10.0 + 10.0 * 10.0 * 1.5;
		expected_amounts[2] = 40.0 * 10.0;
		expected_amounts[3] = 50.0 * 10.0;
		
		double[] returned_amounts = employee_set.money();
		for(int i=0;i<returned_amounts.length; i++)
		{
			assertEquals(expected_amounts[i], returned_amounts[i]);
		}
	}
	

}

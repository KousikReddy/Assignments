package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment3_Collections {

	public static void main(String[] args) {

		Map<String, String> student1 = new HashMap<String, String>();

		student1.put("Name", "John Doe");
		student1.put("Age", "Twenty");
		student1.put("Gender", "Male");
		student1.put("Roll Number", "SBA12345");
		student1.put("Grade", "A++");
		student1.put("Major", "Computer Science");
		student1.put("GPA", "A3.8");
		student1.put("Email", "john@example.com");
		student1.put("Pan Number", "SDF6543210");
		student1.put("Address", "123 Elm St");

		Map<String, String> student2 = new HashMap<String, String>();

		student2.put("Name", "Jane Smith");
		student2.put("Age", "Twenty one");
		student2.put("Gender", "Female");
		student2.put("Roll Number", "SBA12346");
		student2.put("Grade", "B+");
		student2.put("Major", "Mathematics");
		student2.put("GPA", "A3.5");
		student2.put("Email", "jane@example.com");
		student2.put("Pan Number", "REW6543211");
		student2.put("Address", "456 Oak St");

		Map<String, String> student3 = new HashMap<String, String>();

		student3.put("Name", "Mike Brown");
		student3.put("Age", "Twenty two");
		student3.put("Gender", "Male");
		student3.put("Roll Number", "SBA12347");
		student3.put("Grade", "A+");
		student3.put("Major", "Physics");
		student3.put("GPA", "A3.9");
		student3.put("Email", "mike@example.com");
		student3.put("Pan Number", "TYR6543212");
		student3.put("Address", "789 Pine St");
		
		//Students List
		List<Map<String, String>> studentDetails = new ArrayList<>();

		studentDetails.add(student1);
		studentDetails.add(student2);
		studentDetails.add(student3);
		

		Map<String, String> employee1 = new HashMap<String, String>();

		employee1.put("Employee ID", "E001");
		employee1.put("Name", "Alice Green");
		employee1.put("Age", "Thirty");
		employee1.put("Gender", "Female");
		employee1.put("Department", "Engineering");
		employee1.put("Position", "Software Engineer");
		employee1.put("Salary", "75k Pounds");
		employee1.put("Email", "alice@example.com");
		employee1.put("Pan Number", "SDF6543210");

		Map<String, String> employee2 = new HashMap<String, String>();

		employee2.put("Employee ID", "E002");
		employee2.put("Name", "Bob Johnson");
		employee2.put("Age", "Thirty Five");
		employee2.put("Gender", "Male");
		employee2.put("Department", "Marketing");
		employee2.put("Position", "Marketing Manager");
		employee2.put("Salary", "85k Pounds");
		employee2.put("Email", "bob@example.com");
		employee2.put("Pan Number", "REW6543211");

		Map<String, String> employee3 = new HashMap<String, String>();

		employee3.put("Employee ID", "E003");
		employee3.put("Name", "Carol White");
		employee3.put("Age", "Twenty Eight");
		employee3.put("Gender", "Female");
		employee3.put("Department", "Sales");
		employee3.put("Position", "Sales Executive");
		employee3.put("Salary", "65k Pounds");
		employee3.put("Email", "carol@example.com");
		employee3.put("Pan Number", "TYR6543212");
		
		//Employees List
		List<Map<String, String>> employeeDetails = new ArrayList<>();

		employeeDetails.add(employee1);
		employeeDetails.add(employee2);
		employeeDetails.add(employee3);


		Map<String, String> product1 = new HashMap<String, String>();

		product1.put("Product ID", "P001");
		product1.put("Name", "Laptop");
		product1.put("Category", "Electronics");
		product1.put("Price", "12k Pounds");
		product1.put("Stock Quantity", "Not Available");
		product1.put("Supplier", "Tech Supplies");
		product1.put("Warrenty", "2 Years");
		product1.put("Rating", "4.5 Stars");
		product1.put("Manufacturing Date", "Aug 2023");
		product1.put("Expiring Date", "Aug 2028");

		Map<String, String> product2 = new HashMap<String, String>();

		product2.put("Product ID", "P002");
		product2.put("Name", "Desk Chair");
		product2.put("Category", "Furniture");
		product2.put("Price", "150k Pounds");
		product2.put("Stock Quantity", "Two");
		product2.put("Supplier", "Office Depot");
		product2.put("Warrenty", "1 Year");
		product2.put("Rating", "4 Stars");
		product2.put("Manufacturing Date", "Sep 2024");
		product2.put("Expiring Date", "N/A");

		Map<String, String> product3 = new HashMap<String, String>();

		product3.put("Product ID", "P003");
		product3.put("Name", "Coffee Maker");
		product3.put("Category", "Kitchen");
		product3.put("Price", "75 Pounds");
		product3.put("Stock Quantity", "Two Hundered");
		product3.put("Supplier", "Kitchen World");
		product3.put("Warrenty", "6 Months");
		product3.put("Rating", "4.2 Stars");
		product3.put("Manufacturing Date", "Jan 2025");
		product3.put("Expiring Date", "Jan 2027");
		
		//Products List
		List<Map<String, String>> productDetails = new ArrayList<>();

		productDetails.add(product1);
		productDetails.add(product2);
		productDetails.add(product3);
		
		
		//Total Data List
		List<List<Map<String, String>>> totalData = new ArrayList<>();

		totalData.add(studentDetails);
		totalData.add(employeeDetails);
		totalData.add(productDetails);
		
		
		System.out.println("Data from Product details of supplier name:  "+totalData.get(2).get(1).get("Supplier")); //Office Depot
	}

}

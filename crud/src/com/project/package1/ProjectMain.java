package com.project.package1;

import java.util.*;

public class ProjectMain {

	public static void main(String[] args) {
		
			Scanner s=new Scanner(System.in);
			
			ArrayList<Employee> empList=new ArrayList<Employee>();
			AllMethod allmethod=new AllMethod();

			while(true) {
				System.out.println("WELCOME TO THE EMPLOYEE EDITING PLATFROM");
				System.out.println();
				System.out.println("press 1 for add the emp details");
				System.out.println("press 2 for update the emp details");
				System.out.println("press 3 for delete the emp details");
				System.out.println("press 4 for show the emp details");
				System.out.println("press 5 for exit");
				System.out.println();

				int choice=s.nextInt();

				if(choice>5 && choice<1) {
					System.out.println("Enter the valid number in between 1 to 5");
				}
				else {
					switch (choice) {
					case 1:
						allmethod.addEmployee(empList);
						break;
					case 2:
						allmethod.updateEmployee(empList);
						break;
					case 3:
						allmethod.deleteEmployee(empList);
						break;
					case 4:
						System.out.println("press 1 for particuler employee details/ press 0 for all employee details");
						int num=s.nextInt();
						if(num==1) {
							System.out.println("Enter Emp id");
							long id=s.nextLong();
							allmethod.getEmployee(empList, id);
						}
						else if(num==0) {
							allmethod.getAllEmployee(empList);
						}
						else {
							System.out.println("Invalid input");
							return;
						}
						break;
					case 5:
						System.exit(0);
						break;


					}
				}

			}

		

	


	}

}

package com.project.package1;

	
	import java.util.*;



	public class AllMethod {

		Scanner s=new Scanner(System.in);


		public void addEmployee(ArrayList<Employee> emplist) {
			System.out.println("Enter employee name : ");
			String empName=s.nextLine();

			System.out.println("Enter employee Age : ");
			int empAge=s.nextInt();
			
			s.nextLine();
			System.out.println("Enter employee Address : ");
			String empAddress=s.nextLine();
			
			


			long empid=10125+(emplist.size()-1)+1;

			Employee emp=new Employee(empid,empName,empAddress,empAge);
			emplist.add(emp);
			System.out.println("Employee add succesfully.......");

		}


		public void updateEmployee(ArrayList<Employee> emplist) {
			System.out.println("Enter Employe ID : ");
			long id=s.nextLong();

			Employee emp=null;
			for (Employee e : emplist) {
				if(e.getEmpId()==id || e.getEmpId()==10125+id) {
					emp=e;
					break;
				}
			}

			if(emp==null) {
				System.out.println("Invalid input id");
				return;
			}

			System.out.println("Enter the field you want to update(1 for name/ 2 for age/ 3 for address)");
			int str=s.nextInt();
			if(str==1) {
				s.nextLine();
				System.out.println("Enter new name : ");
				String str1=s.nextLine();
				
				emp.setEmpName(str1);
				System.out.println("Employe details updated");
			}
			else if(str==2) {
				System.out.println("Enter new age : ");
				int str1=s.nextInt();
				emp.setEmpAge(str1);
				System.out.println("Employe details updated");
			}
			else if(str==3) {
				s.nextLine();
				System.out.println("Enter new address : ");
				String str1=s.nextLine();
				
				emp.setEmpAddress(str1);
				System.out.println("Employe details updated");
			}
			else {
				System.out.println("Invalid input");
				return;
			}
		}


		public void getEmployee(ArrayList<Employee> emplist, long id) {
			Employee emp=null;
			for (Employee e : emplist) {
				if(e.getEmpId()==id || e.getEmpId()==10125+id) {
					emp=e;
					break;
				}
			}
			if(emp==null) {
				System.out.println("Invalid input id");
				return;
			}
			System.out.println("EMP-ID\tEMP-NAME\tEMP-AGE\tEMP-ADDRESS");
			System.out.println(emp.getEmpId()+"\t"+emp.getEmpName()+"\t"+emp.getEmpAge()+"\t"+emp.getEmpAddress());

		}

		public void getAllEmployee(ArrayList<Employee> emplist) {
			System.out.println("EMP-ID\tEMP-NAME\tEMP-AGE\tEMP-ADDRESS");
			for (Employee emp : emplist) {
				System.out.println(emp.getEmpId()+"\t"+emp.getEmpName()+"\t"+emp.getEmpAge()+"\t"+emp.getEmpAddress());
			}	
		}




		public void deleteEmployee(ArrayList<Employee> emplist) {
			System.out.println("Enter Employe ID : ");
			long id=s.nextLong();

			Employee emp=null;
			for (Employee e : emplist) {
				if(e.getEmpId()==id || e.getEmpId()==10125+id) {
					emp=e;
					break;
				}
			}

			if(emp==null) {
				System.out.println("Invalid input id");
				return;
			}
			emplist.remove(emp);
			for(int i=0;i<emplist.size();i++) {
				emplist.get(i).setEmpId(10125+(i-1)+1);
			}
			System.out.println("Employee deleted successfully");
		}

	}




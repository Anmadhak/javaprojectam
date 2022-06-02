package OOPS;

public class Employee {

	  int employeeid;
	  String empname;
	  int salary;
	  int deptno;
	  
	  void setdata(int id,String name,int sala,int dno)
		 {
			 employeeid=id;                                        //same value class ma pan chhe
	          empname=name;                                         // int =data type
	           salary=sala; 
	          deptno=dno;
	          
		 }
	  
	  void display()
	  {
		  System.out.println(employeeid);
		  System.out.println(empname);
		  System.out.println(salary);
		  System.out.println(deptno);
	  }       
	  
	  //this is the class now we creat object. we need object to access this variable or mathod 
	  //now down is main method.  
	  
	  
	  public static void main (String args[])
	  {
	 /*Employee emp1= new Employee();                        // first employee     //THIS IS OBJECT
	 emp1.employeeid=101;
	 emp1.empname="Ankit";
	 emp1.salary=50000;
	 emp1.deptno=5;
	 emp1.display(); */ 
	 
	/* Employee emp2= new Employee();                         //second employee  //second object
	 emp1.employeeid=102;
	 emp1.empname="tarun";
	 emp1.salary=40000;
	 emp1.deptno=2;
	 emp1.display();  */                                     //display method add in this main method
	   
		  
		  
		  //ASSING VALUE TO CLASS variables using method -third mathod
		  Employee emp1=new Employee();
		  emp1.setdata(101,"Ankit",50000, 5);
		  emp1.display();
		  
		  Employee emp2=new Employee();
		  emp1.setdata(102,"tarun",40000, 2);
		  emp1.display();
        }
	  
	  
}                                                                        //display & main method in one class


// note:   IN THIS PROGRAM WE JUST CREATED simple class which contains some method & variable  . 
//         then we created object for same class and through object we access some variable& call(run)mathod through object.
//in this program object having same variable(emid,no,salary)but value means (name salary no)are different.

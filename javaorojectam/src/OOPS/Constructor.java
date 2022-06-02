package OOPS;

public class Constructor{ 
	


	  int employeeid;
	  String empname;
	  int salary;
	  int deptno;
	  
	  Constructor (int id,String name,int sala,int dno)       //Employee is a constructor. CONSTRUCTER MA CLASS NU JE NAME HOY A J CONSTRUCTER NU NAME HOY
	  {
	        employeeid=id;                                        //same value class ma pan chhe
	         empname=name;                                          //NAME IS a variable
	         salary=sala;
	         deptno=dno; 
	  }
	 
		  
	  
	 void setdata(int id,String name,int sala,int dno)
	 {
		 employeeid=id;                                        //same value class ma pan chhe
          empname=name;                                          //NAME IS a variable
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
	  
	 
	  public static void main (String args[])
	  {
		  //Assigning value to class variable using constructor  -second mathod
		  
		Constructor emp1=new Constructor(101,"Ankit",50000,5) ;                     //constructor object
		emp1.display();                                                      //display method
		Constructor emp2=new Constructor(102,"kiran",30000,1);
		emp2.display();
		 
		 
	  }  
		
}	
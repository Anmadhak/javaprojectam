package OOPS;

public class Methodoverloading {
	
	int a;                 						 //variable =a & b
	int b;
	
	void sum()                       				 //first method          (no parameter  ).method name same in 4 methods MA (SUM)
	{
	  a=10;
	  b=20;	
	  System.out.println(a+b);              			   //empty parameter
	}
	
	void sum(int x, int y)              					   //second method              (AMA 2 Parameter int X & int y)
	{
		int a=x;
		int b=y;
		System.out.println(a+b);
	}
	
	
	
	void sum(int x, int y,int z)            			 //third method         (3 parameter)
	{
		System.out.println(x+y+z);                         //3 parameter
		
	}
	
	void sum(int x, double y)                         // fourth method
	{
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		
          Methodoverloading  mo=new Methodoverloading();
          
          mo. sum();                                  //call first method 30
          mo.sum(100,200);  							 //call second method KEMKE AMA 2 INTEGER CHEE 
          mo.sum(10,20,40);	                            //call 3 method KEMKE 3 INTEGER CHEE AMA
          mo.sum(10,10.5);							//call 4 method because AMA AK DOUBLE INT CHEE
	}

}


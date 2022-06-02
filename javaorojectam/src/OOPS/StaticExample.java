package OOPS;

public class StaticExample {
	
	int a;                		//non static
	 static int b;              // static  (static method ACCESS KARVA MATE OBJECT NI JARUR NA PADE. a class name THE j access the jay) 
	
	static void m1()
	 {
		 System.out.println("This is m1 - static method");
	 }
	 
	 void m2()
	 {
		 System.out.println("This is m2 - non static method");
	 }
	 
	 
	 void m3()          		//non static                  //(m3 method non static HOVATHE A STATIC NE NONSTATIC BANE NE ACCESS KARI SAKE)
	 {														 //(RULE=3 non static can access everything (static & non static -direct access))
		 a=500;						//non static variable
		 b=1000;					 //non static variable
	     
	     
	       m1();
	       m2();
	 }
	 
	 
	 
	  public static void main(String[] args)        //static method (rule: 1  static method can access only static stuff.) static JAYA
	{	                                            // LAKHELU HOY AVI MATHOD NE VARIABLE NE J ACCESS KARE
		  	
	    b=100;
	    System.out.println(b);
	    m1();
	   
	    //a =200;  //not accessible because a is a non static variable
	    //  m2();  //this also not access because it is also non static method
	    
	    
	    StaticExample se =new  StaticExample();      //(rule 2: static methods can also access non static stuff but through object= means using object)  
	    se.a=200;
	    System.out.println(se.a);
	    se.m2();
	}

}

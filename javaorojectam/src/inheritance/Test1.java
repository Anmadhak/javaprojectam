package inheritance;

class A
{
	int a;
	int b;
	
	public void display()										//1 method
	{
		System.out.println(a+b);
	}
}

class B extends A
{
	int x;
	int y;
	
	public void show()                 					//2 method
	{
		System.out.println(x+y);
	}
}

class C extends B
{
	int p;
	int q;
	
	public void addition()
	{
		System.out.println(p+q);
	}
}

//execution always start with main method.  inheritance =parent child relation ship.


public class Test1 {                             		 //A main method  	//tesT1 .java name CHE A file CHE UPER CHE A   

	public static void main(String[] args) 
	{
		A aobj=new A();					//class A nO object .CHE MATE CLASS A NE J access KARI SAKAY.
		aobj.a=100;
		aobj.b=200;
		aobj.display();
		
		B bobj=new B();					
		bobj.x=300;
		bobj.y=400;
		bobj.show();					//show LAKHAVU PADYU KEMKE MATHOD NU NAME show CHE	
		
		bobj.a=150;                   //parent child relation NE LIDHE (B) =child class TO( A)= PARENT CLASS  NA variable NE method no use KARI SAKE.
		bobj.b=250;                   //CLASS B NA object no use KARIYO
		bobj.display();						//class B acquired everything from class A.  
	
		
		C cobj=new C();					//MULTI level inheritance= AK J object NO UPYOG KARI PROGRAM RUN KARAYO
		cobj.a=30;							//last 3 output;				
		cobj.b=50;
		cobj.x=60;
		cobj.y=70;
		cobj.p=20;
		cobj.q=80;
		
		cobj.display();
		cobj.show();
		cobj.addition();
	
	}

}

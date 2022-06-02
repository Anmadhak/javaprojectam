package OOPS;

public class calculation {
	int a;
	int b;
	
	//(1)method may not takes parameter-empty parameters
	//(4) a method not return any value
	
	/*void sum()
	{
		System.out.println(a+b);
	}*/
	
	
	//(2) method takes parameter
	/*void sum(int x,int y)
	{
		a=x;
		b=y;
		System.out.println(a+b);
	}*/
	
	//(3)a method return some value
	
	int sum()
	{
		return(a+b);
		
	}
	
	
	
    public static void main(String[] args) 
	{	
	calculation cal=new calculation();
	
	//this is (1)method may not takes parameter-empty parameters
    /*  cal.a=100;
      cal.b=200;
      cal.sum();*/
	
	
		
	//(2)method takes parameter
     /*cal.sum(100,200);*/
	
	
	//(3)a method return some value
	 cal.a=100;
    cal.b=200;
    int r =cal.sum();
    System.out.println(r);
	}

}

package OOPS;

public class Constructoroverloading {
	
	int a=0;
	int b=0;
	double c=0;
	
	Constructoroverloading()                      //method CHE ATLE AMA void KE KOI DATATYPE NA AVE
	{                                              //method constructor name same
		a=10;										//default constructor   =not taking any parameter
		b=30;
		c=20.5;
	}
	
	
	Constructoroverloading(int a, int b)					//2 constructor  //this no use KARYO    //Constructoroverloading(int x, int y)				                                                                                     
	{																								//	{
																									//		a=x;
																									//		b=y;
		this.a=a;																					//   }
		this.b=b;
	}
	
	
	
	Constructoroverloading(int x, double z)                     //3 constructor
	{
	       a=x;
		   c=z;
	}
	
	Constructoroverloading(int x, int y,double z)                //4 constructor
	{
		a=x;
		b=y;
		c=z;
	}
	
	Constructoroverloading(int x, double y,int z)                //5 constructor
	{
		a=x;
		b=z;
		c=y;
	}
	
	
	void display()											//for display this value we create void display method.we use void so any value cannot 
	{														//	return
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
	
	public static void main(String[] args) {
		//Constructoroverloading co=new Constructoroverloading();   // AMA 1 construct0r RUN THASE KEMKE we are not passing any parameter
		
		//Constructoroverloading co =new Constructoroverloading(10,30);  //this called SECOND  constructor (2 NE 3  BANE MA 2 PARAMETER CHE PAN A RUN 
																	     // 2 KARSE KEMKE 3 MA DOUBLE CHE NE AHI KIMAT INT MA CHE ATLE
		
		// Constructoroverloading co =new Constructoroverloading(10,20.5);    //THIRD CONSTRUCTOR RUN
		
		//Constructoroverloading co =new Constructoroverloading(10,30,20.5);      //4 CONSTRUCTOR
																				//co.display BADHA MA MUKTU JAVANU RUN KARAVNU TOJ THASE
		
		 Constructoroverloading co =new Constructoroverloading(10,20.5,30);     // 5 CONSTRUCTOR  /parameter same but order of parameter is different (DOUBLE NE INT
		co.display();													        //NI position ALAG CHE

	}

}

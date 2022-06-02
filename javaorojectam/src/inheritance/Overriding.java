package inheritance;

class Bank								//parent class
{
    int getrateofinterest()
   {
	   return 0;
   }
}

class SBI extends Bank     		    // child class . this child class extends by superclass(parent class)
{
	int getrateofinterest()                 //method overriding = definition is same but body is different
	   {
		   return 10;
	   }
}

class ICICI extends Bank					//child class . A 3 child class no parent class same CHE Bank.
{
	int getrateofinterest()
	   {
		   return 15;
	   }
}

class RBI extends Bank                        //child class
{
	int getrateofinterest()
	   {
		   return 12;
	   }
}


public class Overriding {								//same method OVERIDEN in the sub class.body change but defination same

	public static void main(String[] args)
	{
		SBI sbiobj=new SBI();
		System.out.println(sbiobj.getrateofinterest());  //10
		
		ICICI iciciobj=new ICICI();
		System.out.println(iciciobj.getrateofinterest());  //15
		
		RBI rbiobj=new RBI();
		System.out.println(rbiobj.getrateofinterest());  //1
		
		

	}

}

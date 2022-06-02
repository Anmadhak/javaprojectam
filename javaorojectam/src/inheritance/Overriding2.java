package inheritance;

class vehicle
{
	void run()
	{
		System.out.println("vehicle is running");
	}
}

class Bike extends vehicle                       //extends from parent class
{
	void run()
	{
		System.out.println("Bike is running");       //body change the
	}
}

public class Overriding2 {

	public static void main(String[] args) 
	{
		vehicle vobj=new vehicle();
		vobj .run();
       
		Bike bobj=new Bike();
		bobj .run();

	}

}

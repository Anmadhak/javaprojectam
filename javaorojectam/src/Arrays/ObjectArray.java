package Arrays;

public class ObjectArray {

	public static void main(String[] args) {
	
		/*Object a[]=new Object[5];
		
		a[0]=10;   //integer
		a[1]=20.5;    //double
		a[2]="happy";  //string
		a[3]='d';		//character
		a[4]=true;		//bollean */
		
		/*for(Object  i : a)		//a=array name
		{
			System.out.println(i);
		}*/                                     
		
		Object a[]= {100,345.67,"good",'a',true,400,675.89};
		for(Object  i : a)		
		{
			System.out.println(i);
		}
	}

}

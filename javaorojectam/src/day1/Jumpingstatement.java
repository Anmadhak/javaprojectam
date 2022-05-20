package day1;

public class Jumpingstatement {

	public static void main(String[] args) {
		
		for(int i=1; i<=10;i=i+2)
			
		{
			if(i==8)
			{
			
				break;
				
			}
			System.out.println(i);
		}
		
		
		
                for(int j=1; j<=10;j++)
			
		{
			if(j==3 )
			{
				continue;
				
			}
			System.out.println(j);
		}
		
		
		
                	
                	//using or operator skip 3 mumber
                	  for(int i=1; i<=10;i++)
              			
              		{
              			if(i==3 ||i==5|| i==7 )
              			{
              				continue;
              				
              			}
              			System.out.println("---------");
              			System.out.println(i);
              		}
                	
                	
			}

}

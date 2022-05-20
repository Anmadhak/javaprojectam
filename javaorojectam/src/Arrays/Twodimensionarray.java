package Arrays;

public class Twodimensionarray {

	public static void main(String[] args) {
		
		int a[] []=new int[3][2];  //declaration 2 diamension use 3raws 2colum
		
		//storing element//value into array
		
		
		a[0][0]=10;
		a[0][1]=20;
		
		a[1][0]=30;
		a[1][1]=40;
		
		a[2][0]=50;
		a[2][1]=60;
		
		/*for(int i=0;i<=2;i++);        //for increment raws
				{
		for(int j=0;j<=1;j++);          //increment colum	for each raw
		{[i][j] +"  ");
			                   
		}
		   System.out.prin
			System.out.println(atln(); 
		}*/
				//for--each loop
				
				for(int i[]:a)
				{
					for(int j:i)
					{
						System.out.print(j+ "  ");  //10 20
					}
					{
						System.out.println();
					}
				}
				
	
	}

}

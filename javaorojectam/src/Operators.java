
public class Operators {

	public static void main(String[] args) {
		//Arithemetic operators   + - / * %  //
		
		
		
		int a=20;
		int b=30;
		System.out.println ("---------------------------------------");
		System.out.println ("sum ofa &b :" +(a+b));
		System.out.println ("diff ofa &b :" +(a-b));
		System.out.println ("mul ofa &b :" +(a*b));
		System.out.println ("div ofa &b :" +(a/b));
		System.out.println ("per ofa &b :" +(a%b));
		
		//relational operators == <> <= >= !=//
		System.out.println ("---------------------------------------");
		System.out.println (a==b);
		System.out.println (a>b);
		System.out.println  (a<b);
		System.out.println (a>=b);
		System.out.println (a<=b);
		System.out.println (a!=b);
		
	//logical operator && || //
		
		boolean x=false;
		boolean y=true;		
		System.out.println ("---------------------------");
		System.out.println (x && y);
		System.out.println (x||y);
		System.out.println (!x);
		System.out.println (!y);
		
		//increment ++   & decrement -- //
		
		a=10;
		a++;    // a=a+1;
		System.out.println ("------------------------------------------");
		System.out.println(a);
		
		
		b=20;
		b--;                 //b=b-1;
		System.out.println (b);
	
	}
	
	
	

}

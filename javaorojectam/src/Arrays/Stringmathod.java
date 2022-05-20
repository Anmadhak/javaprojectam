package Arrays;

public class Stringmathod {

	public static void main(String[] args) {
		
		String s="Welcome";
		
		System.out.println(s.length()); // its show howmany charactor in srtring
 
		//concatenation =joining 2 or more string
		
		String s1="welcome to";
		String s2="training";
		
		System.out.println(s1+s2);
		
		System.out.println(s1.concat(s2));   //second method
		
		System.out.println("welcome to"+ "training");    
		System.out.println("welcome".concat ("training"));   //concat use  between two string using variable and joint both string
		
		
		//Equals  =is mathod use for compairing two diff string  string are same then true otherwise fail they always return boolean value
		
		String s3= "WELCOME";
		String s4= "welcome";

		System.out.println(s3.equals(s4));  //both string different so false
		
		//equalsIgnorecase= ama bane string same na hoy toy chale case sensivity matter na kare
		
		System.out.println(s3.equalsIgnoreCase(s4));
		
		//contain  = if we want to verify particuler latter or word  are in this string or not JO HOY TO TRUE NAITO FALSE
		
		
		s3.contains("WEL"); //TRUE
		System.out.println(s3.contains("ABC"));  //FALSE		
		
		
		
		//SUBSTRING =  WRITE IN BOOK
		 
		System.out.println(s.substring(0,3));
		System.out.println(s.substring(2,5));
		System.out.println(s.substring(4,7));
		
		//replace  =in this it replace word or single character 
		
		System.out.println(s.replace('e', 'a'));
		System.out.println(s.replace("come", "kame"));
		
		
	}

}

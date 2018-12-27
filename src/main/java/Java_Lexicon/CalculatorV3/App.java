package Java_Lexicon.CalculatorV3;

import java.util.Scanner;


public class App 
{
	
	
	public static Scanner userIn = new Scanner(System.in);
	    
	    public static String getUserOperator()
	    {
	    	
	    	
	    	
	    	String userOperator = userIn.nextLine();
	    	return userOperator;
	    }
	    
	    public static boolean Fortsätt(String svar)
	    {
	    	String storBokstav = svar.toUpperCase();
	    	switch(storBokstav)
	    	{
	    	case "Y": return true;
	    	default: return false;
	    	}
	    }
	    
	    public static double getUserNumber()
	    {
	    	boolean villRäkna = false;
	    	int Num = 0;
	    	while(!villRäkna)
	    	{
	    		try {
	    			Num = Integer.parseInt(getUserOperator());
	    			villRäkna = true;
	    		    }
	    		catch(NumberFormatException e)
	    		{
	    			System.out.println("din inmatning var inte ett nummer");
	    		}
	    	}
	    	
	    	return Num;
	    }
	    
	    
	    public static double Beräkna(double Nummer1,double Nummer2, String Operator)
	    {
	    	switch(Operator)
	    	{
	    	case "+": return Nummer1 + Nummer2;
	    	case "-": return Nummer1 - Nummer2;
	    	case "*": return Nummer1 * Nummer2;
	    	case "/": if(Nummer1 == 0 || Nummer2 == 0) {return 0;} return Nummer1 / Nummer2;
	    	default: return 0;
	    	}
	    }
    public static void main( String[] args )
    {
    	System.out.println("välkommen. I denna kalkylator kan du räkna + - / * av två Tal");
    	System.out.println("Vill du göra detta?");
    	
    	double Num1;
    	double Num2;
    	double result;
    	
    	String Operator;
    	String calc;
    	
    	calc = getUserOperator();
    	boolean villRäkna = Fortsätt(calc);
    	
    	
    	
    	
    	
    	while(villRäkna)
    	{
    		System.out.println("Ange ditt första Nummer");
    		Num1 = getUserNumber();
    		
    		System.out.println("Ange ett räknesätt, + - / *");
    		Operator = getUserOperator();
    		
    		System.out.println("Ange ditt andra Nummer");
    		Num2 = getUserNumber();
    		
    		result = Beräkna(Num1,Num2,Operator);
    		System.out.println("Resultatet är: " + result);
    		
    		System.out.println("Vill du räkna igen Y/N");
    		calc = getUserOperator();
    		villRäkna = Fortsätt(calc);
    		
    	}
    	
    	
    	
    	
	}
    
  
    // this code is done with help of Maria Hofstam and i would not have been able to make this code as clean as it is without her own code as reference
    // check her GitHub at: https://github.com/MariaHofstam
    // get my input (done)
    // chose the right math method(done)
    // do the math (done)
    // return the result (done)
    // be able to keep going until i chose to turn it of (done0)
    // tested the code (not done)
    
    

    
  
    
    
    
}

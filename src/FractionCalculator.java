import java.util.*;

public class FractionCalculator
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter equation or \"quit\" to end");
      String frac1 = input.nextLine();
      String[] fractions = frac1.split(" ");
      Fraction f1 = new Fraction(fractions[0]);
      Fraction f2 = new Fraction(fractions[2]);

      while(!frac1.equalsIgnoreCase("quit"))
      {
		  System.out.println(f1.addFractions(f2.getNumerator(), f2.getDenominator()));
/*
    	  if(fractions[1].equalsIgnoreCase("+"))
    		  System.out.println(f1.addFractions(f2.getNumerator(), f2.getDenominator()));
    	  else if(fractions[1].equalsIgnoreCase("-"))
    		  System.out.println(f1.subtractFractions(f2.getNumerator(), f2.getDenominator()));
    	  else if(fractions[1].equalsIgnoreCase("*"))
    		  System.out.println(f1.multiplyFractions(f2.getNumerator(), f2.getDenominator()));
    	  else if(fractions[1].equalsIgnoreCase("/"))
    		  System.out.println(f1.divideFractions(f2.getNumerator(), f2.getDenominator()));
    	  else
    		  System.out.println("Not working right now");*
    	  
    	  frac1 = input.next();
      }      
   }   
}
public class Fraction
{
   private String fraction;
   private String operator;
   private int numerator;
   private int denominator;   
   Fraction(String _fraction)
   {
      fraction = _fraction;
      processFractions();
   }
   
   
   
   public void processFractions()
   {
      if(fraction.contains("_"))
      {
         int wholeNumber = Integer.parseInt(fraction.substring(0,fraction.indexOf("_")));
         denominator = Integer.parseInt(fraction.substring(fraction.indexOf("/") + 1));
         numerator = (wholeNumber * denominator) + (Integer.parseInt(fraction.substring(fraction.indexOf("_") + 1, fraction.indexOf("/"))));
      }
      else if(fraction.contains("/"))
      {
         numerator = Integer.parseInt(fraction.substring(0, fraction.indexOf("/")));
         denominator = Integer.parseInt(fraction.substring(fraction.indexOf("/") + 1));
      }
      else
    	  numerator = Integer.parseInt(fraction.substring(0));
    	  denominator = 1;
   }
   
   public String subtractFractions(int num, int den)
   {
      int numTotal = (numerator * den) - (num * denominator);
      int denTotal = (denominator * den);
      
      return reduceFraction(numTotal,denTotal);   
   }
   
   public String multiplyFractions(int num, int den)
   {
	   int numTotal = (numerator * num);
	   int denTotal = (denominator * den);	
	   
	   return reduceFraction(numTotal,denTotal);
   }
   
   public String divideFractions(int num, int den)
   {
	   int numTotal = (numerator * den);
	   int denTotal = (denominator * num);
	   
	   return reduceFraction(numTotal,denTotal);
   }
   
   public String addFractions(int num, int den)
   {
      int numTotal = (numerator * den) + (num * denominator);
      int denTotal = (denominator * den);
      
      return reduceFraction(numTotal,denTotal);   
   }
   
   public String reduceFraction(int num, int den)
   {
      String frac = "";
      int numFinal = num/euclidAlgorithm(num, den); 
      int denFinal = den/euclidAlgorithm(num, den);
      
      if(denFinal == 1)
      {
    	  frac = Integer.toString(numFinal);
      }
      else      
    	  frac = numFinal + "/" + denFinal;
      
      return frac;   
   }

   public int euclidAlgorithm(int a, int b)
   {
	   if(b == 0)
		   return a;
	   else
		   return euclidAlgorithm(b, a % b);
   }
   
   public String getFraction()
   {
      return fraction;
   }
   
   public String getOperator()
   {
      return operator;
   }
   
   public int getDenominator()
   {
      return denominator;
   }
   
   public int getNumerator()
   {
      return numerator;
   }

}
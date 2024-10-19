package SW_Package_6;

public class This_Keyword_Assignment // Class definition
{ 
  public This_Keyword_Assignment() // Default Constructor definition
  {
	  this(12,24,36); // Constructor chaining - Call  Three-parameterised constructor 
	  System.out.println("Default Constructor");  
  }
  public This_Keyword_Assignment(int a) // One-parameterised Constructor definition
  {
	  this(12,24); // Constructor chaining - Call  Two-parameterised constructor 
	  System.out.println("One-parameterised Constructor");
  }
  
  public This_Keyword_Assignment(int a, int b) //Two-parameterised constructor definition
  {
	  this(); // Constructor chaining - Call default constructor 
	  System.out.println("Two-parameterised Constructor");
  }
  public This_Keyword_Assignment(int a, int b, int c) //Three-parameterised constructor definition
  {
	  System.out.println("Three-parameterised Constructor");
  }

  public static void main(String[] args)
  {
	  This_Keyword_Assignment T1= new This_Keyword_Assignment(12);// call one-parameterised constructor 
  }
}

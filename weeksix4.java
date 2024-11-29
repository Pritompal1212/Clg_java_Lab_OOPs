
class AgeException extends Exception
{  
      AgeException(String s)
      {   
		super(s);  
	}
}
class weeksix4
{    
	static void validate(int age)throws AgeException
     {   
		if(age<18)
                throw new AgeException("not valid");       
           else  
                System.out.println("welcome to vote");  
     }  
     public static void main(String args[])
	{    
		try
		{	
			validate(13);  
      	}
      	catch(Exception m)
		{	
			System.out.println("Exception occured: "+m);
		}
      	System.out.println("rest of the code...");  
	}  
}  

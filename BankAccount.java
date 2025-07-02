class BankAccount{
   
   static double balance;
   
   public static void main (String[] acc){
	   System.out.println("main Started");
	   //methodName
	   credit=1000;
	   System.out.println("The");
   System.out.println("main ended");
   // debit
   // credit
   // transfer
   
             //Datatype variable - parameter
			 //<access-specifier> returnType methodName(parameter)
			 
			 public static void debit(double amount){
				 System.out.println("debit started");
			         balance = balance - amount ;
					 System.out.println("debit ended");
					 }
					 
			public static void credit(double amount){
				System.out.println("credit started");
			         balance = balance + amount ;
					 System.out.println("credit ended");
					 }
}
					 
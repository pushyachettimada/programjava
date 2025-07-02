class Calculator{
  public static void main(String[]cal){
  add(62 , 85);
  sub(562 , 896);
  mul(85 , 89);
  div(875 , 26);
  mod(56 , 78);
  }
  
  public static void add(int num1 , int num2 ){
    int total = num1+num2;
	System.out.println(total);
  }
	 public static void sub(int num1 , int num2 ){
    int total = num1-num2;
	 System.out.println(total);
	 }
	 public static void mul(int num1 , int num2 ){
    int total = num1*num2;
	System.out.println(total);
	 }
	 public static void div(int num1 , int num2 ){
    int total = num1/num2;
	System.out.println(total);
	 }
	 public static void mod(int num1 , int num2 ){
    int total = num1%num2;
	System.out.println(total);
	}
	}
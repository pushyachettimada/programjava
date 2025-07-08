class Speaker{
 
 static boolean isConnected;
 static  int currentVolume;
 
 static int maxVolume = 7 ;
  
  //onOrOff// increaseVolume //decreaseVolume
  
  public static void onOrOff(){
	  if(isConnected == false){
            isConnected   = true;
            System.out.println("The Speaker is Turned On");
}
else if(isConnected == true){

  isConnected = false;
  
            System.out.println("The Speaker is Turned Off");
			}
}

// increaseVolume

public static void increaseVolume(){
	System.out.println("increaseVolume Started");
	if(isConnected == true){
		if(currentVolume <= maxVolume){
			currentVolume = currentVolume + 1;
			System.out.println("The current volume is:" +currentVolume);
		}
		
		else{
			System.out.println("Max volume reached ");
		}
}else{
			System.out.println("On.....madu...Speaker Na...");
			

  }
  }







}
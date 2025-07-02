class SocialMedia{
/*static String facebook="Facebook";
static String instagram="Instagram";
static String whatsapp="Whatsapp";
static String twitter="Twitter";
static String snapchat="Snapchat";
static String youTube="You Tube";
static String linkedin="Linkedin";
static String zoom="zoom";
static String moj="Moj";
static String Josh="Josh";
static String sharechat="Sharechat";


static String MediaNames[] ={"Facebook","Instagram","Whatsapp","Twitter","Snapchat","You Tube","Linkedin","zoom","Moj","Josh","Sharechat"};*/



public static void main(String[] args){
 String facebook="Facebook";
 String instagram="Instagram";
 String whatsapp="Whatsapp";
 String twitter="Twitter";
 String youTube="YouTube";
 String linkedin="Linkedin";
 String zoom="Zoom";
 String moj="Moj";
 String Josh="Josh";
 String sharechat="Sharechat";


 String MediaNames[] ={"Facebook","Instagram","Whatsapp","Twitter","Snapchat","YouTube","Linkedin","Zoom","Moj","Josh","Sharechat"};
	  System.out.println("main started");
//System.out.println("The no of MediaNames added are"+MediaNames.length);
//System.out.println(MediaNames[0]+" "+MediaNames[1]+" "+MediaNames[2]+" "+MediaNames[3]+" "+MediaNames[4]+" "+MediaNames[5]+" "+MediaNames[6]+" "+MediaNames[7]+""+MediaNames[8]+""+MediaNames[9]);
System.out.println("The no of MediaNames added are:");
	for(String MediaName:MediaNames){
	  System.out.println(MediaName);
	}
	  System.out.println("main ended");
}
}

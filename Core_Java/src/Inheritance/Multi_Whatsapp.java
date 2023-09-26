package Inheritance;

public class Multi_Whatsapp {
	
	public static void main(String[] args) 
	{
		//Create Object of WhatsAppV3 Class
		Multi_Whatsapp3 V3=new Multi_Whatsapp3();
		V3.AudioCalling();
	    V3.Textmsg();
	    V3.VideoCalling();
		
	    //Create Object of WhatsAppV2 Class    
	    Multi_Whatsapp2 V2=new Multi_Whatsapp2(); 
		V2.AudioCalling();
		V2.Textmsg();	
	}
}

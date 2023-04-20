 import arc .*;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.Font;

public class textbubble{
	public static void main(String[] args){
		Console con = new Console("Midterm Project", 1280, 720);
 
	int intCount;
	int intCount2;
	BufferedImage imgHospital2 = con.loadImage("Hospital2.png");
	BufferedImage imgRuinedCity = con.loadImage("My project-1(1).png");
	BufferedImage imgDarkHallway = con.loadImage("DarkHallway2.png");
	String strOp1;
	strOp1 = "";
	String strGetkey;
	
	//Title Screen
	//while(intCount2 == 1){
		//con.setDrawColor(Color.BLACK);
			//con.fillRect(0, 0, 1280, 720);
			
		//con.setDrawColor(Color.WHITE);
		//con.drawString("BAD", 200, 160);
		//con.repaint();
		//con.sleep(33);
	//}
	
	
	//Scene 1
	for(intCount = 1; intCount <=150; intCount++){
		con.drawImage(imgHospital2, 0, 0);
	
		con.setDrawColor(Color.WHITE);
		con.drawString("You wake up in hospital groggy and tired.", 400, 500);
		con.drawString("You step out of bed.", 520, 520);

	con.repaint();
	con.sleep(33);
	}
		con.clear();
	
	//Scene 2
	while(intCount == 1){
	con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
	
	
	con.setDrawColor(Color.BLACK);
		con.println("Do you look around or leave the room");
		strOp1 = con.readLine();
	
			con.clear();
			con.repaint();
		
		if(strOp1.equalsIgnoreCase("Look around")){
			while(intCount == 1){
			con.clear();
			con.setDrawColor(Color.BLACK);
			con.fillRect(0, 0, 1280, 720); 
			con.drawImage(imgRuinedCity, 0, 0);
			con.repaint();
			con.sleep(33);
			}
		}else if(strOp1.equalsIgnoreCase("Leave")){
			while(intCount == 1){
			con.clear();
			con.setDrawColor(Color.BLACK);
			con.fillRect(0, 0, 1280, 720);
			con.drawImage(imgDarkHallway, 0, 0);
			con.repaint();
			con.sleep(33);
			}
		
	
		

		
			}
		}
	}
}

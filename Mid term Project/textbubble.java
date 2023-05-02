import arc .*;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.Font;

public class textbubble{
	public static void main(String[] args){
		Console con = new Console("Midterm Project", 1280, 720);

int intCount;
intCount = 1;
int intCount2;
intCount2 = 1;
int intCount3;
intCount3 = 1;
int intCount4;
intCount4 = 1;
int intCount5;
intCount5 = 1;
int intCount6;
intCount6 = 1;
int intCount7;
intCount7 = 1;
int intCount8;
intCount8 = 1;
int intCount9;
intCount9 = 1;
int intCount10;
intCount10 = 1;
int intCount11;
intCount11 = 1;
int intCount12;
intCount12 = 1;
int intCount13;
intCount13 = 1;
int intCount14;
intCount14 = 1;
int intCount15;
intCount15 = 1;
int intCount16;
intCount16 = 1;
int intCount17;
intCount17 = 1;
int intCount18;
intCount18 = 1;
int intCount19;
intCount19 = 1;
int intCount20;
intCount20 = 1;
int intCount21;
intCount21 = 1;
int intAnswer;
intAnswer = 0;
int inthealth;
inthealth = 100;
int intRand;
String strOp1;
strOp1 = "";
String strOp2;
strOp2 = "";
String strOp3;
strOp3 = "";
String strOp4;
strOp4 = "";
String strOp5;
strOp5 = "";
String strRoll;
strRoll = "";
String strName = reverse("racecar racecar");
String strName2 = reverse("bob bob");


	

	
	String strGetkey;
	//Title
		Title(con);	
		con.repaint();
		con.sleep(33);
		con.clear();
	//Scene1
		for(intCount2 = 1; intCount2 <=50; intCount2++){
		scene1(con);
		con.repaint();
		}
		con.clear();
	//Scene2
		scene2(con);
		con.println("Do you 'look around' or leave' the room");
			strOp1 = con.readLine();
		con.clear();
	//Scene3
		if(strOp1.equalsIgnoreCase("Look around")){
		for(intCount5 = 1; intCount5 <= 50; intCount5++){
			scene3(con);
			}
			for(intCount4 = 1; intCount4 <=50; intCount4++){
				intCount5 = intCount5 + 1;
				if(intCount5 != 1){
					scene4(con);
				}
				}	
			con.clear();
	//Scene4
		}else if(strOp1.equalsIgnoreCase("Leave")){
			for(intCount6 = 1; intCount6 <= 50; intCount6++){
			scene4(con);
			}
			}
		con.clear();
	//Scene5
		scene5(con);
		con.println("Do you go 'left' or 'right'");
		strOp2 = con.readLine();
		con.clear();
		
		//RIGHT//
	
	//scene6
	if(strOp2.equalsIgnoreCase("Right")){
		for(intCount13 = 1; intCount13 <= 50; intCount13++){
		scene6(con);
		}
		
	con.clear();
	
	//scene7
		scene7(con);
		con.println("");
			strOp3 = con.readLine();
		con.clear();
	//scene8
	if(strOp3.equalsIgnoreCase("Yes")){
		scene8(con);
	con.repaint();
	con.sleep(33);
	con.clear();
	
	//scene9
	}else if(strOp3.equalsIgnoreCase("No")){
		con.println("You go back to the main hallway and decided to take the left path");
		for(intCount15 = 1; intCount15 <=50; intCount15++){
			scene9(con);
		}
		}
		
		//LEFT//
		
	//Scene10
		}else if(strOp2.equalsIgnoreCase("left")){
			for(intCount7 = 1; intCount7 <=50; intCount7++){
			scene9(con);
		}
		}
		con.clear();
		
	//scene11
		for(intCount8 = 1; intCount8 <= 50; intCount8++){ 
			scene10(con);
			}
		con.clear();
	//scene12
		scene11(con);
		con.println("what is the code? ");
		intAnswer = con.readInt();
		if(intAnswer == 1968){
				//scene13
				for(intCount9 = 1; intCount9 <= 50; intCount9++){
				scene12(con);
				}
			con.clear();
				//scene14
				for(intCount10 = 1; intCount10 <= 50; intCount10++){
					scene13(con);
					con.println("The name: "+strName);
					}
				con.clear();		
		}else if(intAnswer != 1968){
				//scene15
			con.println("The name: "+strName2);
			for(intCount11 = 1; intCount11 <= 50; intCount11++){
				scene14(con);
				con.clear();
				}
				}
		
	//scene16
		scene16(con);
	con.clear();
	
	//scene17
	scene17(con);
	con.println("");
	strOp4 = con.readLine();
	con.clear();
	
	//SNEAK//
	
	if(strOp4.equalsIgnoreCase("Sneak")){
		for(intCount16 = 1; intCount16 <= 50; intCount16++){
		scene18(con);
		con.clear();
		}
		for(intCount20 = 1; intCount20 <= 50; intCount20++){
		scene19(con);
		}
		
	//ATTACK//
	
	}else if(strOp4.equalsIgnoreCase("Attack")){
		for(intCount17 = 1; intCount17 <= 50; intCount17++){
		scene19(con);
		}
		con.clear();
		for(intCount18 = 1; intCount18 <= 50; intCount18++){
			scene20(con);
			}
			con.clear();
			for(intCount19 = 1; intCount19 <= 50; intCount19++){
				scene21(con);
			}
				strOp5 = con.readLine();
				con.println("");
				con.clear();
				if(strOp5.equalsIgnoreCase("dodge")){
					scene23(con);
				}else{
					scene22(con);
			}
		}
		while(inthealth > 0){
		scene24(con);
		con.println("type 'roll'");
		strRoll = con.readLine();
		if(strRoll.equalsIgnoreCase("Roll")){
			intRand = (int)(Math.random()*100+1);
			con.println("your roll was: "+intRand);
			inthealth = inthealth - intRand;
			con.println("Monster health: "+inthealth);
			}
		}
		con.clear();
	//scene25
		scene25(con);
		con.println("You defeat the moster and grab the keycard");
		con.clear();
	//scene26
			scene26(con);
	//scene27
		scene27(con);
	
	
}		
	
///////////////////////////////////////////////////////////////////////////////////////////
		
	//Title Screen
	public static void Title(Console con){
	BufferedImage imgHospital = con.loadImage("scaryhospital.jpg");
	BufferedImage imgMoon = con.loadImage("moon.png");

		int intcount;
		intcount = 1;
		int intMoon;
		intMoon = 1000; 
		Font fntOswald = con.loadFont("Oswald-Regular.ttf", 60);
		con.setDrawFont(fntOswald);
		con.drawImage(imgHospital, 0, 0);
		con.setDrawColor(Color.WHITE);
		for(intMoon = 1000; intMoon >= 600; intMoon--){
		con.drawImage(imgHospital, 0, 0);
		con.setDrawColor(new Color(50, 74, 168));
		con.drawString("HOSPITAL ADVENTURES", 400, 300);
		con.drawImage(imgMoon, intMoon, 0);
		intMoon = intMoon - 2;
		con.repaint();
		con.sleep(33);
		}
		}
	//Scene 1
	public static void scene1(Console con){
	BufferedImage imgHospital2 = con.loadImage("Hospital2.png");
	Font fntOswald = con.loadFont("Metropolitano-Regular.ttf", 30);
		con.setDrawFont(fntOswald);
		con.drawImage(imgHospital2, 0, 0);
		con.setDrawColor(Color.WHITE);
		con.drawString("You wake up in hospital groggy and tired.", 400, 500);
		con.drawString("You step out of bed.", 520, 530);
	con.repaint();
	con.sleep(33);
	}
	//Scene2
	public static void scene2(Console con){
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.setDrawColor(Color.BLACK);
		con.repaint();
		}
	//Scene 3
	public static void scene3(Console con){
	BufferedImage imgRuinedCity = con.loadImage("RuinedCity.png");
				con.setDrawColor(Color.BLACK);
				con.fillRect(0, 0, 1280, 720); 
				con.drawImage(imgRuinedCity, 0, 0);
				con.repaint();
				con.sleep(33);		
			}
	//scene4
	public static void scene4(Console con){
	BufferedImage imgDarkHallway = con.loadImage("DarkHallway2.png");
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.drawImage(imgDarkHallway, 0, 0);
		con.repaint();
		con.sleep(33);
			}
	//scene5
	public static void scene5(Console con){	
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.setDrawColor(Color.BLACK);
		con.repaint();
		}
		
		//RIGHT//
		
	public static void scene6(Console con){
		BufferedImage imgbighole = con.loadImage("BigHole.jpg");
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.drawImage(imgbighole, 0, 0);
		con.setDrawColor(Color.WHITE);
		con.drawString("you see a large hole infront of you",500,500); 
		con.sleep(33);
		con.repaint();
		}
	public static void scene7(Console con){
		BufferedImage imgbighole = con.loadImage("BigHole.jpg");
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.drawImage(imgbighole, 0, 0);
		con.setDrawColor(Color.WHITE);
		con.drawString("Do you try to jump over", 500,500);
		con.drawString(" 'Yes' or 'No' ", 550, 530);
		con.repaint();
		con.sleep(33);
		}
	public static void scene8(Console con){
		int intcount;
		intcount = 1;
		int intcount2;
		intcount2 = 1;
		int intWaltuh;
		intWaltuh = 500; 
		BufferedImage imgbighole = con.loadImage("BigHole.jpg");
		BufferedImage imgWaltuh = con.loadImage("Walterfalling.png");
		for(intWaltuh = 1000; intWaltuh >= 600; intWaltuh--){
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.drawImage(imgbighole, 0, 0);
		con.drawImage(imgWaltuh, intWaltuh, 300);
		intWaltuh = intWaltuh - 3;
		con.repaint();
		con.sleep(33);
		}
		while(intcount2 == 1){
			con.setDrawColor(Color.BLACK);
			con.fillRect(0, 0, 1280, 720);
			con.setDrawColor(new Color(62, 50, 168));
			Font fntOswald = con.loadFont("Oswald-Regular.ttf", 60);
			con.setDrawFont(fntOswald);
			con.drawString("YOU DIED",500,300);
			con.repaint();
			con.sleep(33);
			}
		}
		
		//LEFT//
		
	//scene9
	public static void scene9(Console con){
	BufferedImage imgOpenTheNoor = con.loadImage("OpenDoor.jpg");
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.drawImage(imgOpenTheNoor, 0, 0);
		con.repaint();
		con.sleep(33);
		}
	//scene10
	public static void scene10(Console con){
	BufferedImage imgCabinet = con.loadImage("cabinet.jpg");
		con.setDrawColor(Color.WHITE);
		con.fillRect(0, 0, 1280, 720);
		con.drawImage(imgCabinet, 460, 300);
		Font fntOswald = con.loadFont("Metropolitano-Regular.ttf", 30);
		con.setDrawFont(fntOswald);
		con.setDrawColor(Color.BLACK);
		con.drawString("the code for this cabinet:", 500, 30);
		con.drawString("(123/8)*(2^7)", 600, 70);
		con.repaint();
		con.sleep(33);
		}
	//scene11
	public static void scene11(Console con){
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.setDrawColor(Color.WHITE);
		con.drawString("the code for this cabinet:", 500, 30);
		con.drawString("(123/8)*(2^7)", 600, 70);
		con.repaint();
		}
	//scene12
	public static void scene12(Console con){
	BufferedImage imgRacecar = con.loadImage("RaceCar.png");
	BufferedImage imgBlurryCabinet = con.loadImage("blurrycabinet.png");
		con.setDrawColor(Color.WHITE);
		con.fillRect(0, 0, 1280, 720);
		con.drawImage(imgBlurryCabinet, 460, 300);			
		con.drawImage(imgRacecar, 300, 200);
		con.repaint();
		con.sleep(33);
		}
	//scenen13
	public static void scene13(Console con){
	BufferedImage imgBlurryCabinet = con.loadImage("blurrycabinet.png");
		con.setDrawColor(Color.WHITE);
		con.fillRect(0, 0, 1280, 720);
		con.drawImage(imgBlurryCabinet, 460, 300);
		con.setDrawColor(Color.BLACK);
		con.drawString("Wow my name is a palindrome",400, 400);
		con.repaint();
		con.sleep(33);
		}
	//scene14
	public static void scene14(Console con){
	BufferedImage imgBlurryCabinet = con.loadImage("blurrycabinet.png");
		con.setDrawColor(Color.WHITE);
		con.fillRect(0, 0, 1280, 720);
		con.drawImage(imgBlurryCabinet, 460, 300);
		con.setDrawColor(Color.BLACK);
		con.drawString("Ah whatever, I can make my own name", 400, 400);
		con.drawString("My new name will be Bob Bob", 430, 430);
		con.repaint();
		con.sleep(33);
		}
			public static String reverse(String strWord){
				String strBack = "";
				int intcount;
				int intLength = strWord.length();
				for(intcount = intLength; intcount > 0; intcount--){
						strBack = strBack + strWord.substring(intcount-1, intcount);
				}
				return strBack;
				}
	//scene15
	public static void scene15(Console con){
	BufferedImage imgBlurryCabinet = con.loadImage("blurrycabinet.png");
		con.setDrawColor(Color.WHITE);
		con.fillRect(0, 0, 1280, 720);
		con.drawImage(imgBlurryCabinet, 460, 300);
		con.setDrawColor(Color.BLACK);
		con.drawString("Wow my name is a palindrome",500, 400);
	}
	//scene16
	public static void scene16(Console con){
	BufferedImage imgMonster = con.loadImage("ScaryMonsters.jpg");
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.drawImage(imgMonster, 0, 0);
		con.setDrawColor(Color.WHITE);
		con.drawString("After finding nothing else",400, 400);	
		con.drawString("you leave the room",450, 430);
		con.drawString("and find a large humanoid creautre faces the other way",250, 460);
		con.repaint();
		con.sleep(33);
		}
	//scene17
	public static void scene17(Console con){
	BufferedImage imgMonster = con.loadImage("ScaryMonsters.jpg");
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.drawImage(imgMonster, 0, 0);
		con.setDrawColor(Color.WHITE);
		con.drawString("Do you 'Attack' or 'Sneak'?",375, 400);
		con.repaint();
		con.sleep(33);
		}
		
	//SNEAK//
	//scene18
	public static void scene18(Console con){
	BufferedImage imglockeddoor = con.loadImage("LockedDoor.jpg");
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.drawImage(imglockeddoor, 0, 0);
		con.setDrawColor(Color.WHITE);
		con.drawString("You notice that you need a keycard to open this door",250, 400);
		con.drawString("You turn around and see its around the creatures neck", 250, 430);
		con.repaint();
		con.sleep(33);
		}
		
	//ATTACK//
	
	public static void scene19(Console con){
	BufferedImage imgFight = con.loadImage("Fighting.png");
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.drawImage(imgFight, 0, 0);
		con.repaint();
		con.sleep(33);
	}
	public static void scene20(Console con){
	BufferedImage imgclawmarks = con.loadImage("clawmakrs.png");
	BufferedImage imgFight = con.loadImage("Fighting.png");	
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.drawImage(imgFight, 0, 0);
		con.drawImage(imgclawmarks, 300,100 );
		con.setDrawColor(Color.WHITE);
		con.drawString("The monster slashes at you", 400, 500);
		con.repaint();
		con.sleep(33);
		}
	public static void scene21(Console con){
	BufferedImage imgclawmarks = con.loadImage("clawmakrs.png");
	BufferedImage imgFight = con.loadImage("Fighting.png");	
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.drawImage(imgFight, 0, 0);
		con.drawImage(imgclawmarks, 300,100 );
		con.setDrawColor(Color.WHITE);
		con.drawString("Type 'dodge'", 400, 500);
		con.repaint();
		con.sleep(33);
		}
	public static void scene22(Console con){
		int intcount;
		intcount = 1;
		while(intcount == 1){
			con.setDrawColor(Color.BLACK);
			con.fillRect(0, 0, 1280, 720);
			con.setDrawColor(new Color(62, 50, 168));
			Font fntOswald = con.loadFont("Oswald-Regular.ttf", 60);
			con.setDrawFont(fntOswald);
			con.drawString("YOU DIED",500,300);
			con.repaint();
			con.sleep(33);
			}
		}
	public static void scene23(Console con){
	BufferedImage imgFight = con.loadImage("Fighting.png");	
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.drawImage(imgFight, 0, 0);
		Font fntOswald = con.loadFont("Metropolitano-Regular.ttf", 30);
		con.setDrawFont(fntOswald);
		con.setDrawColor(Color.WHITE);
		con.drawString("type 'roll' to attack", 350, 300);
		con.repaint();
		con.sleep(33);
		}
	public static void scene24(Console con){
	BufferedImage imgFight = con.loadImage("Fighting.png");	
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.drawImage(imgFight, 0, 0);
		con.repaint();
		con.sleep(33);
	}
	public static void scene25 (Console con){
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.repaint();
		con.sleep(33);
	}
	public static void scene26 (Console con){
	int	intkeycard;
	intkeycard = 500;
	BufferedImage imgkeycarddoor = con.loadImage("keycarddoor.png");
	BufferedImage imgkeycard = con.loadImage("keycard.png");	
		for(intkeycard = 500; intkeycard >= 275; intkeycard--){
			con.setDrawColor(Color.BLACK);
			con.fillRect(0, 0, 1280, 720);
			con.drawImage(imgkeycarddoor, 200, 200);
			con.drawImage(imgkeycard, intkeycard, 500);
			intkeycard = intkeycard - 1;
			con.repaint();
			con.sleep(33);
			}
	}
	public static void scene27(Console con){
	BufferedImage imgfinal = con.loadImage("final.jpg");
		con.drawImage(imgfinal, 0, 0);
		con.setDrawColor(Color.RED);
		Font fntOswald = con.loadFont("Oswald-Regular.ttf", 60);
		con.setDrawFont(fntOswald);
		con.drawString("THE END",500,300);
		con.repaint();
		con.sleep(33);
		}	
}




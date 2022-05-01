
public class Shirt {
public static String color;
public static char size;
Shirt(){};
Shirt(String newColor, char newSize){
	color=newColor;
	size=newSize;
}
	public static void putOn() {
		// TODO Auto-generated method stub
System.out.println("Shirt is on!");
	}
public static void takeOff() {
	System.out.println("Shirt is off!");
}
}

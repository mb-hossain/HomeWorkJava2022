package hw4Q2JavaVariables;


public class AboutMe {
	
	//Variable declare Here.
	public String Name;
	public byte age;
	public int houseNumber;
	public short streetNumber;
	public long yearlyIncome;
	public float myHeight;
	public double myGpa;
	public char sex;
	public boolean liveInUsa;
	
	//Constructor declare Here.
	public AboutMe() {
		System.out.println("Information About Me Below:");
	}
	
	//Method implemented.
	public void aboutMe() {
		System.out.println("My Nama Is: "+ Name + "\nMy Age is: " + age + "\nMy HouseNumber: " + houseNumber
				+ "\nMy StreetNumber: " + streetNumber + "\nMy Yearly Income :" + yearlyIncome + "\nSex: " + sex
				+ "\nMy Height: " + myHeight + "\nMy Grade: " + myGpa + "\nAm I live in USA? Ans: " + liveInUsa);
	}

}

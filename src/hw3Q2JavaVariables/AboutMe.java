package hw3Q2JavaVariables;


public class AboutMe {
	
	public String aboutMeInfo; //Variable is declared. Start with Upper case, all other start with lower case.
	
	public String myName = "Belayet"; //Variable is initialized.
	
	public byte myAge= 30; // byte can be -128 to 127
	
	public  int myHouseNumber= 35; // int can contain 2,147,483,648 to 2,147,483, 647 only.
	
	public short myStreetNumber= 164; // short can contain –32,768 to 32,767 only.
	
	public long myPhoneNumber=5647236827l; //Using l at the end of long type.
	
	public float myHeight=1.721000f; //Using f at the end of float type. decimal till 6 to 7 digit
	
	public double myGpa=3.5764755343; //decimal till 15 to 16 digit.
	
	public char mySex='M'; //Can be used only single character within ' ' single quotation.
	
	public boolean bangladeshi =true; // boolean can be True or False only. 

	public static void main(String[] args) {
		
		AboutMe aboutMe= new AboutMe();
		System.out.println("My Name is "+aboutMe.myName );
		System.out.println("My Age Is= "+aboutMe.myAge);
		System.out.println("My House Number= "+aboutMe.myHouseNumber);
		System.out.println("My Street Number= "+aboutMe.myStreetNumber);
		System.out.println("My Phone Number= "+aboutMe.myPhoneNumber);
		System.out.println("My Height "+aboutMe.myHeight+", My Gpa is "+aboutMe.myGpa );
		System.out.println("I am a Bangladeshi= "+aboutMe.bangladeshi+", And I am a "+aboutMe.mySex );
        
		
	}
}

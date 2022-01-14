package hw4Q2JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {
		// MyInfo class is instantiated, always inside main method, not in other method
		AboutMe aboutMe1 =new AboutMe();
		aboutMe1.Name="MB Hossain";
		aboutMe1.age=38;
		aboutMe1.houseNumber=35;
		aboutMe1.streetNumber=164;
		aboutMe1.yearlyIncome= 26736487l;
		aboutMe1.myHeight=1.710f;
		aboutMe1.myGpa= 3.4299;
		aboutMe1.sex='M';
		aboutMe1.liveInUsa=true;
		aboutMe1.aboutMe(); //Method Implemented.
		
		System.out.println("\n@@@@@@@@@@@@@@@@@\n");
		
		AboutMe aboutMe2 =new AboutMe();
		aboutMe2.Name="Belayet Hossain";
		aboutMe2.age=48;
		aboutMe2.houseNumber=39;
		aboutMe2.streetNumber=124;
		aboutMe2.yearlyIncome= 1236736487l;
		aboutMe2.myHeight=1.6910f;
		aboutMe2.myGpa= 3.2299;
		aboutMe2.sex='M';
		aboutMe2.liveInUsa=true;
		aboutMe2.aboutMe();
	}

}

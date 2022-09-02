package First_Task;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		ZooClub zc = new ZooClub();
		Scanner scn = new Scanner(System.in);
		int key = 0;
		
		while(true) {
			System.out.print("================================================="
							   + "\n-Enter:" 
		                       + "\n'1' to add person to club;"
		                       + "\n'2' to add pet to person;"
		                       + "\n'3' to remove pet from person;"
		                       + "\n'4' to remove person from club;"
		                       + "\n'5' to remove one type of pet from all persons;"
		                       + "\n'6' to see all zoo club;"
		                       + "\n'7' to exit;"
		                       + "\n-Type here: ");
			key = scn.nextInt();
			
			switch(key) {
			case 1 : {
				zc.addPerson();
				break;
			}
			case 2:{
				zc.addPet();
				break;
			}
			case 3:{
				zc.removePet();
				break;
			}
			case 4:{
				zc.removePerson();
				break;
			}
			case 5:{
				zc.removeAllPets();
				break;
			}
			case 6:{
				zc.seeZooClub();
				break;
			}
			case 7:{
				zc.exit();
				break;
			}
			}
		
		}
	}
}

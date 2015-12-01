
public class InfoApp {

	public static void main(String[] args) {

		System.out.println("Team 2 Member list:");
		InfoPrintLogan printLogan = new InfoPrintLogan();
		printLogan.printLogan();
		InforPrintMeneley meneley = new InforPrintMeneley();
		meneley.printMeneley();
		InfoPrintWestfield west = new InfoPrintWestfield();
		west.printWestfield();
	}

}

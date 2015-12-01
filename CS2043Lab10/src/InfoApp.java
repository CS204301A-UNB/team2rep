
public class InfoApp {

	public static void main(String[] args) {

		System.out.println("Team 2 Member list:");
		InfoPrintLogan logan = new InfoPrintLogan();
		logan.printLogan();
		InforPrintMeneley meneley = new InforPrintMeneley();
		meneley.printMeneley();
		InfoPrintWestfield west = new InfoPrintWestfield();
		west.printWestfield();
		InfoPrintZotov zotov = new InfoPrintZotov();
		zotov.printZotov();
		InfoPrintCarr carr = new InfoPrintCarr();
		carr.printCarr();
		InfoPrintWood wood = new InfoPrintWood();
		wood.printWood();
	}

}

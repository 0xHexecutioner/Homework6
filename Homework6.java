package sample;

import java.util.Scanner;

public class Main {
	
	public static final String ANSI_GREEN = "\u001B[32m";
	 public static final String ANSI_RED = "\u001B[31m";
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int floors = 9;
	        int apartmentsPerFloor = 4;
	        int entrances = 5;
	        int apartmentsPerEntrance = floors * apartmentsPerFloor;
	        int totalApartments = apartmentsPerEntrance * entrances;
	        
	        System.out.println("Enter the apartment number:");
	        int apartmentNumber = scanner.nextInt();
	        
	        if (apartmentNumber < 1 || apartmentNumber > totalApartments) {
	            System.out.println(ANSI_RED + "Error: Such an apartment does not exist in this building.");
	        } else {
	            int entrance = (apartmentNumber - 1) / apartmentsPerEntrance + 1;
	            int floor = ((apartmentNumber - 1) % apartmentsPerEntrance) / apartmentsPerFloor + 1;
	            
	            System.out.println(ANSI_GREEN + "The apartment is in " + entrance + " the entranceway to " + floor + " floor.");
	        }

	    }
	}

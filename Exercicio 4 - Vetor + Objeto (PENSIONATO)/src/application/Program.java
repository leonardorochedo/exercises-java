package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int sizeStudents = sc.nextInt();
		
		Student[] pension = new Student[9]; // vetor de Student com 9 posicoes
		
		
		for(int i=0; i<sizeStudents; i++) {
			sc.nextLine();
			System.out.println();
			int room;
			System.out.println("Rent #" + (i+1) + ": ");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			room = sc.nextInt();
			if(pension[room] != null) {
				System.out.println();
				System.out.print("Room haven been occuped, try another: ");
				room = sc.nextInt();
			}
			
			// occupation of room
			pension[room] = new Student(name, email);
		}
		
		System.out.println();
		System.out.println("Busy Rooms: ");
		
		for(int i=0; i<pension.length; i++) {
			if(pension[i] != null) {
				System.out.println(i + ": " + pension[i].getName() + ", " + pension[i].getEmail());
			}
		}
		sc.close();
	}

}

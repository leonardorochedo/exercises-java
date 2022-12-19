package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Students;

public class Program {

	public static void main(String[] args) {
		// Added students in classes, after count how many students this professor have
		
		Set<Students> setStudents = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many students for course A? ");
		Integer a = sc.nextInt();
		
		for(int i=0; i<a; i++) {
			setStudents.add(new Students(sc.nextInt()));
		}
		
		System.out.print("How many students for course B? ");
		Integer b = sc.nextInt();
		
		for(int i=0; i<b; i++) {
			setStudents.add(new Students(sc.nextInt()));
		}
		
		System.out.print("How many students for course C? ");
		Integer c = sc.nextInt();
		
		for(int i=0; i<c; i++) {
			setStudents.add(new Students(sc.nextInt()));
		}
		
		System.out.println("Total students: " + setStudents.size());
	}

}

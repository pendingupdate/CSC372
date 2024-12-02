package finalprogram;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		LinkedList<Student> studentEntries = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter the student's name, address, and GPA when prompted. Type 'exit' as the student name to stop.\n");

		while (true) {
			System.out.print("Student name: ");
			String name = scanner.nextLine();
			if (name.equalsIgnoreCase("exit")) {
				break;
			}

			System.out.print("Student address: ");
			String address = scanner.nextLine();

			double gpa;
			while (true) {
				System.out.print("Student GPA (ranges from 0.0 to 4.0): ");
				try {
					gpa = Double.parseDouble(scanner.nextLine());
					if (gpa >= 0.0 && gpa <= 4.0) {
						break;
					} else {
						System.out.println("GPA must be no less than 0.0 and no more than 4.0. Please try again.");
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid input. GPA must be a numeric value between 0.0 and 4.0. Please try again.");
				}
				
			}

			studentEntries.add(new Student(name, address, gpa));
			System.out.print("\n");
		}

		// Sort students by name
		Collections.sort(studentEntries, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return s1.getName().compareTo(s2.getName());
			}
		});

		System.out.println("\n=================\n\nStudent Entries:\n");
		for (Student student : studentEntries) {
			System.out.print(student.toString());
		}
		
		// Write student entries to a file in ascending alphabetical order by name
		String studentEntriesFile = "StudentEntries.txt";
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(studentEntriesFile))) {
			for (Student student : studentEntries) {
				writer.write(student.toString());
				writer.newLine();
			}
			System.out.println("=================\n");
			System.out.println("List of student entries has been saved to " + studentEntriesFile);
		} catch (IOException e) {
			System.err.println("Error writing to file: " + e.getMessage());
		}

		scanner.close();
	}
}
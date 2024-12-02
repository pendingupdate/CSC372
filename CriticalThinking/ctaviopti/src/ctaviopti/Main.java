package ctaviopti;

import java.util.ArrayList;

import ctaviopti.Student.SortByName;
import ctaviopti.Student.SortByRollNumber;

public class Main {

	public static void main(String[] args) {
		// Create ArrayList of Students
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student(3, "Lizzie Tithe", "1234 State Avenue, York, PA"));
		students.add(new Student(1, "Roberto Ecomio", "5678 Chicken Drive, Savannah, GA"));
		students.add(new Student(10, "Everett Haversmith", "910 Bright Eye Drive, Omaha, NE"));
		students.add(new Student(4, "Charles Ndegeocello", "1112 Happen Street, Austin, TX"));
		students.add(new Student(5, "Christopher Apple", "113114 Development Lane, Phoenixville, PA"));
		students.add(new Student(2, "Grace Jones", "151 Disco Cove, San Francisco, CA"));
		students.add(new Student(9, "Frank Hopkins", "1781 Aperture Avenue, Portland, ME"));
		students.add(new Student(6, "Hannah Ayers", "1920 Route 20, Nashville, TN"));
		students.add(new Student(7, "Ivy Winters", "2122 S. 7th Street, Los Angeles, CA"));
		students.add(new Student(8, "Jack White", "3 Man Road, Nashville, TN"));

		System.out.println("Unsorted List:\n");
		for (Student student : students) {
			System.out.println(student);
		}

		System.out.println("--------------------------\n\nSorted by Name:\n");
		Student.selectionSort(students, new SortByName());
		for (Student student : students) {
			System.out.println(student.printNameFirst());
		}

		System.out.println("--------------------------\n\nSorted by Roll Number:\n");
		Student.selectionSort(students, new SortByRollNumber());
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}

}

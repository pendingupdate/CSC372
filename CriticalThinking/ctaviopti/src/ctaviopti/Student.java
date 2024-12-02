package ctaviopti;

import java.util.ArrayList;
import java.util.Comparator;

public class Student {

	// attributes
	int rollno;
	String name;
	String address;

	// constructor
	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	// format general string output
	@Override
	public String toString() {
		return "Roll Number: " + rollno + " \nName: " + name + " \nAddress: " + address + "\n";
	}

	// format output with name first
    public String printNameFirst() {
        return "Name: " + name + ", \nAddress: " + address + "\nRoll Number: " + rollno + "\n";
    }
	
	// sorts student objects by name
	public static class SortByName implements Comparator<Student> {
		@Override
		public int compare(Student s1, Student s2) {
			return s1.name.compareTo(s2.name);
		}
	}

	// sorts student objects by roll number
	public static class SortByRollNumber implements Comparator<Student> {
		@Override
		public int compare(Student s1, Student s2) {
			return Integer.compare(s1.rollno, s2.rollno);
		}
	}

	public static void selectionSort(ArrayList<Student> list, Comparator<Student> comparator) {
	    // Get the number of elements in the list
	    int numItems = list.size();

	    // Outer loop: iterate through the list, sorting one element at a time
	    for (int i = 0; i < numItems - 1; i++) {
	        // Assume the current element is the smallest
	        int minimumIndex = i;

	        // Inner loop: find the smallest element in the unsorted portion
	        for (int j = i + 1; j < numItems; j++) {
	            if (comparator.compare(list.get(j), list.get(minimumIndex)) < 0) {
	                minimumIndex = j; // Update minIndex if a smaller element is found
	            }
	        }

	        // Swap the smallest element found with the current element
	        Student temp = list.get(minimumIndex);
	        list.set(minimumIndex, list.get(i));
	        list.set(i, temp);
	    }
	}
}

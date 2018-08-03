//main method to generate the random numbers and write it into the file and place them it into the java collection
package com.Stream;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RandomGenrator {

	public static void main(String[] args) throws IOException {
		Random rm = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the path");
		String path = sc.nextLine();

		WriteFile wf = new WriteFile(path, true);

		// generating the random numbers between 1 and 100
		for (int i = 0; i < 100; i++) {
			wf.WriteFile("" + rm.nextInt(50));
			System.out.println("\n");
		}

		// store the generated numbers in java collection using treeset
		Scanner s = new Scanner(new File(path));
		Set<Integer> set = new TreeSet<>();

		while (s.hasNextInt()) {
			set.add(s.nextInt());
		}
		s.close();
		set.stream().distinct().sorted().forEach(System.out::println);
	}

}

//main method for displaying the ans
package com.exmpel.checking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.StreamTokenizer;
import java.util.StringTokenizer;

public class CheckingMain {

	public static void main(String[] args) throws IOException {
		Math ob = new Math();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		performOperation op;
		int ret = 0;
		String ans = null;
		while (t-- > 0) {
			String s = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(s);
			int ch = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());

			if (ch == 1) {
				op = ob.checkEvenOdd();
				ret = ob.checker(op, num);
				ans = (ret == 0) ? "EVEN" : "ODD";

			} else if (ch == 2) {
				op = ob.checkPrime();
				ret = ob.checker(op, num);
				ans = (ret == 0) ? "PRIME" : "COMPOSITE";
			} else if (ch == 3) {
				op = ob.checkPallindrome();
				ret = ob.checker(op, num);
				ans = (ret == 0) ? "PALLINDROME" : "NOT PALLINDROME";
			}
			System.out.println(ans);

		}

	}

}

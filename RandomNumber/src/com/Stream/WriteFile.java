 package com.Stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.print.attribute.standard.PrinterState;

public class WriteFile {
	private String path;
	private boolean appended_to_file = false;

	public WriteFile(String file_path, boolean append) {
		path = file_path;
		appended_to_file = append;
	}

	// method for writing data into the file and place each number in new line
	public void WriteFile(String textLine) throws IOException {

		FileWriter write = new FileWriter(path, appended_to_file);
		PrintWriter pw = new PrintWriter(write);

		pw.printf("%s" + "%n", textLine);
		pw.close();

	}
}

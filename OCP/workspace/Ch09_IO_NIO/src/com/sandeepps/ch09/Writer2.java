package com.sandeepps.ch09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Writer2 {
	public static void main(String[] args) {
		char[] in = new char[50]; // to store input
		int size = 0;

		try {
//			File file = new File( // just an object
//					"fileWrite2.txt");
//			FileWriter fw = new FileWriter(file); // create an actual file
//			// & a FileWriter obj
//			fw.write("howdy\nfolks\nsandeep pulikathara sahadevan"); // write characters to
//			// the file
//			fw.flush(); // flush before closing
//			fw.close(); // close file when done
//
//			FileReader fr = new FileReader(file); // create a FileReader
//			// object
//			size = fr.read(in); // read the whole file!
//			System.out.print(size + "= "); // how many bytes read
//			for (char c : in)
//				// print the array
//				System.out.print(c);
//			fr.close(); // again, always close
//			
//			
//			File file1 = new File("foo1"); // no file yet
//			PrintWriter pw = new PrintWriter(file1);
//			pw.println("HOW HOW ARE YOU? I AM GOOD THANK YOU!!!");
//			pw.flush();
//			pw.close();
			
			File myDir = new File("mydir");
			//myDir.mkdir(); // call to mkdir() omitted!
			File myFile = new File(myDir, "addAccountRequest1.xml");
			File myFileRes = new File(myDir, "addAccountResponse1.xml");
			FileReader fr2 = new FileReader(myFile);
			FileWriter fw2 = new FileWriter(myFileRes);
			BufferedReader br2 = new BufferedReader(fr2);
			BufferedWriter bw2 = new BufferedWriter(fw2);
			String s;
			while ((s=br2.readLine()) != null){
				System.out.println(s);
				bw2.write(s);;
			}
			br2.close();
			bw2.flush();
			bw2.close();
			//myFile.createNewFile();
		} catch (IOException e) {
		}
	}
}

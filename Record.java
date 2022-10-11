/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
import java.io.*;
import java.util.*;


/**
 *
 * @author ASUS
 */
public class Record {
 // Name of the associated file
 private String filename;
 public static Record instance;
 public Record(String n) {
 filename = n;
 }

  public static Record getInstance(String n){
     if (instance==null){
         instance = new Record(n);
     }
     return instance;
 }
 
 // Effects: Reads and prints the contents of the associated 
 // file to the standard output. 
 public void read() {
 try {
      FileReader reader = new FileReader(filename);
      Scanner scan = new Scanner(reader);
      while(scan.hasNextLine()){
          System.out.println(scan.nextLine());
      }
      scan.close();
 // Write the code here
 } catch (IOException e) {
 System.out.println("An error occurred.");
 e.printStackTrace();
 }
 }

 // Effects: Appends the specified message, msg, to the 
 // associated file.
 public void write(String msg) {
 try {
      FileWriter writer = new FileWriter(filename, true);
      BufferedWriter bw = new BufferedWriter(writer);
      PrintWriter out = new PrintWriter(bw);
      out.append(msg);
      out.close();
 // Write the code here
 
 } catch (IOException e) {
 System.out.println("An error occurred.");
 e.printStackTrace();
 }
 }
 
 public static void main(String[] args) {
//     FileWriter r = new FileWriter("record.txt", true);
 // Fill the blank below that obtains the sole instance 
 // of the Record class. 
 // (You should not invoke the Record constructor here.)
 Record r = new Record("record.txt");
 
 
 // Do not modify the code below
 r.write("Hello-1\n");
 r.write("Hello-2\n");
 
 System.out.println("Currently the file record.txt " +
 "contains the following lines:");
 r.read();
 }
}

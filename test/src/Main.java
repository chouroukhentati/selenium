package tests;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.apache.commons.io.output.TeeOutputStream;

public class Main {
	
	static {
		// This block is for redirect the System.out to two streams: standard output (console) and a file
		try {
			// Build the file name
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy_HH-mm-ss");  
			LocalDateTime now = LocalDateTime.now();
			String currentDateTime = dtf.format(now);
			// Create "output" folder if not exist
			File folder = new File("output");
			folder.mkdirs();
			// create output file under "output" folder
		    FileOutputStream fileOutputStream = new FileOutputStream("output/" + currentDateTime + ".txt");
		    Runtime.getRuntime().addShutdownHook(new Thread(() -> {
		        try {
		            fileOutputStream.flush();
		        }
		        catch (Throwable t) {
		            // Ignore
		        }
		    }, "Shutdown hook Thread flushing " + fileOutputStream));
		    // We want to print in standard "System.out" and in "file"
		    OutputStream newOut=new TeeOutputStream(System.out, fileOutputStream);
		    PrintStream ps = new PrintStream(newOut, true); //true - auto-flush after println
		    System.setOut(ps);
		} catch (Exception e) {
		    e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		new MultTest().runTest();
		new AddTest().runTest();
	}

}

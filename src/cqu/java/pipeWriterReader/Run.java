package cqu.java.pipeWriterReader;

import java.io.PipedReader;
import java.io.PipedWriter;

public class Run {
	public static void main(String[] args) {
		new Run().begin();
	}
	
	public void begin() {
		try {
			WriteData writeData = new WriteData();
			ReadData readData = new ReadData();
			
			PipedWriter out = new PipedWriter();
			PipedReader input = new PipedReader();
			
			out.connect(input);
			
			ThreadW threadW = new ThreadW(out, writeData);
			threadW.start();
			
			ThreadR threadR = new ThreadR(input, readData);
			threadR.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	class ThreadW extends Thread{
		private PipedWriter out;
		private WriteData writeData;
		
		public ThreadW(PipedWriter out, WriteData writeData) {
			super();
			this.out = out;
			this.writeData = writeData;
		}
		
		@Override
		public void run() {
			super.run();
			writeData.writeMethod(out);
		}
	}
	
	class ThreadR extends Thread{
		private PipedReader input;
		private ReadData readData;
		
		public ThreadR(PipedReader input, ReadData readData) {
			super();
			this.input = input;
			this.readData = readData;
		}
		
		@Override
		public void run() {
			super.run();
			readData.readMethod(input);
		}
	}
}

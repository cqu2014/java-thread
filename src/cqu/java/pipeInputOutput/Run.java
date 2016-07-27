package cqu.java.pipeInputOutput;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Run {
	public static void main(String[] args) {
		new Run().begin();
	}
	
	public void begin() {
		try {
			WriteData writeData = new WriteData();
			ReadData readData = new ReadData();
			
			PipedInputStream inputStream = new PipedInputStream();
			PipedOutputStream outputStream = new PipedOutputStream();
			
			//inputStream.connect(outputStream);
			outputStream.connect(inputStream);
			
			ThreadR threadR = new ThreadR(readData, inputStream);
			threadR.start();
			
			Thread.sleep(2000);
			
			ThreadW threadW = new ThreadW(writeData, outputStream);
			threadW.start();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	class ThreadW extends Thread{
		private WriteData data;
		private PipedOutputStream out;
		
		public ThreadW(WriteData data, PipedOutputStream out) {
			super();
			this.data = data;
			this.out = out;
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();
			data.writeMethod(out);
		}
		
	}
	
	class ThreadR extends Thread{
		private ReadData readData;
		private PipedInputStream inputStream;
		public ThreadR(ReadData readData, PipedInputStream inputStream) {
			super();
			this.readData = readData;
			this.inputStream = inputStream;
		}
		
		@Override
		public void run() {
			super.run();
			readData.readMethod(inputStream);
			
		}
		
	}
}

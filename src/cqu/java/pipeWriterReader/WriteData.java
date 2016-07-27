package cqu.java.pipeWriterReader;

import java.io.PipedWriter;

public class WriteData {
	public void writeMethod(PipedWriter out) {
		try {
			System.out.println(" Write :******************************");
			for(int i=0;i<300;i++){
				String outData = ""+(i+1);
				out.write(outData);
				System.out.print(outData+",");
			}
			System.out.println();
			out.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

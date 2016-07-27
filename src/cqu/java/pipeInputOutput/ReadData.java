package cqu.java.pipeInputOutput;

import java.io.PipedInputStream;

public class ReadData {
	public void readMethod(PipedInputStream in) {
		try {
			System.out.println("Read :****************");
			byte[] byteArray = new byte[20];
			int readLength = in.read(byteArray);
			while(readLength != -1){
				String newData = new String(byteArray, 0, readLength);
				System.out.println(newData);
				readLength = in.read(byteArray);
			}
			System.out.println("--------------------------");
			in.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

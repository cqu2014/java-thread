package cqu.java.pipeWriterReader;

import java.io.PipedReader;

public class ReadData {
	public void readMethod(PipedReader input) {
		try {
			System.out.println(" read :############################");
			//设置临时存放的地点--数组
			char[] byteArray = new char[21];
			//保存当前读取返回的状态
			int readLength = input.read(byteArray);
			while(readLength != -1){
				String  newData = new String(byteArray, 0, readLength);
				System.out.print(newData);
				//只知道读完是返回-1
				readLength = input.read(byteArray);
			}
			System.out.println();
			input.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

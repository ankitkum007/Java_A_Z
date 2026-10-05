package DataStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PrimitivData {
	public static void main(String[] args) {
		try {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("D:\\LearnFileHandling\\DataStream\\WriteFile.txt"));
		
		dos.writeInt(10);
		dos.writeLong(1234567891992l);
		dos.writeChars("ankit kuamr");
		dos.writeChar('A');
		
		DataInputStream dis = new DataInputStream(new FileInputStream("D:\\LearnFileHandling\\DataStream\\WriteFile.txt"));
		
		System.out.println(dis.readInt());
		System.out.println(dis.readLong());
		System.out.println(dis.readChar());
		System.out.println(dis.readChar());
		
		dos.close();
		dis.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}

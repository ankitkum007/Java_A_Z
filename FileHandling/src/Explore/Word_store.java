package Explore;

import java.io.FileWriter;
import java.io.IOException;

public class Word_store {
	public static void main(String[] args) {
		String word = "i/o stream is id use to read the sorce data(like: file, keyword, network) and write data to the destination(like: file, sreen, socket) at the one pices. ";
		try (FileWriter store = new FileWriter("D:\\LearnFileHandling\\I_OStream\\ApplicationText.txt", true)) {
			store.write(word);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("store in file");
		}
	}

}

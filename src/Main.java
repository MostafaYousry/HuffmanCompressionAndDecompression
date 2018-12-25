import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Utilities utilities = new Utilities();
		String inputFile = new String();
		int option;
//		ExtendedAscii extendedAscii = new ExtendedAscii();
////		for(int i  =0 ; i < 256; i++){
////			extendedAscii.printChar(i);
////		}
////		
//		System.out.println((char) 0x8c);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("****** Huffman Compression & Decompression ******");
		System.out.println("Want to compress a file or decompress a file ?");
		System.out.println("1 : Compress        2 : Decompress");
		option = scanner.nextInt();
		scanner.nextLine();
		if(option == 1){
			System.out.print("File name : ");
			inputFile = scanner.nextLine();
			utilities.readInputFile(inputFile);
			utilities.setCharactersAndFrequencies();
			utilities.buildHuffmanQueue();
			utilities.buildHuffmanTree();
			try {
				utilities.writeEncodedFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("File is compressed succesfully");
		}
		else if(option == 2){
			System.out.println("File name : ");
			inputFile = scanner.nextLine();
			utilities.readEncodedFile(inputFile);
			utilities.writeDecodedFile();
			System.out.println("\nFile is decompressed succesfully");
		}
		else{
			System.out.println("Not an option good bye");
		}
		
//		
		
	}
}

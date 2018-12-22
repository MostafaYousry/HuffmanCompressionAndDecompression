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
		Utilities utilities = new Utilities();
		utilities.readEncodedFile("outputFile.txt");
		utilities.writeDecodedFile();
	}
}

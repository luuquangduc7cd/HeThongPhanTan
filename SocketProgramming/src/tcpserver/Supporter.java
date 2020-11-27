package tcpserver;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Supporter {
	File file;
	float[][] data;
	
	public Supporter() throws IOException {
		file = new File("C:\\Users\\Gia Lai\\Documents\\HeThongPhanTan\\SocketProgramming\\data.txt");
		data = new float[360][2];
		Scanner scn = new Scanner(file);
		for(int i = 0; i < 360; i++) {
			String temp = scn.nextLine();
			float sin = Float.parseFloat(temp.split("\t")[0]);
			float cos = Float.parseFloat(temp.split("\t")[1]);
			data[i][0] = sin;
			data[i][1] = cos;
			System.out.println(String.format("%.2f\t%.2f", sin, cos));
		}
		scn.close();
	}
	
	public float getSin(int deg) {
		return data[deg][0];
	}
	
	public float getCos(int deg) {
		return data[deg][1];
	}
	
	public float getTan(int deg) {
		return data[deg][0]/data[deg][1];
	}
	public float getCot(int deg) {
		return data[deg][1]/data[deg][0];
	}
	
}

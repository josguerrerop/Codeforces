package logica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ahorcado {
	static char arr[][]= new char [9][9];
	static Random ran = new Random();
	
	public static void getStarted() {
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				arr[i][j]='0';
			}
		}
		//Putmines(arr);
	}
	
	public static void Putmines() {
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				int ram = ran.nextInt(5);
				if(ram== 3) {
					arr[i][j]='*';
				}else {
					arr[i][j]='0';
					
				}
			}
		}
		
	}

	public static void show() {
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws IOException {
			
	Ahorcado ar = new Ahorcado();
	ar.Putmines();
	ar.show();
}

}

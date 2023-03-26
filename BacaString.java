/* NIM : 13020210133
Nama : Fifian
Waktu : 18/3/2023 01:00 PM */

import java.io.BufferedReader;ssss
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.*;
public class BacaString {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/* Kamus */
		String str;


		BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));
		/* Program */

		System.out.print ("\nBaca string dan Integer: \n");
		System.out.print ("masukkan sebuah string: ");
		str= datAIn.readLine();
		System.out.print ("String yang dibaca : "+ str);

	}
}
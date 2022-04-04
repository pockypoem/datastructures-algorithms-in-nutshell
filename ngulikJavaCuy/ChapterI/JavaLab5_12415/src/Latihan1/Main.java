package Latihan1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int jumlahData;
		int[] arrData;
		Scanner num = new Scanner(System.in);
		System.out.print("Masukkan Jumlah Data: ");
		jumlahData = num.nextInt();
//		num.close();
		
		Array DataAngka = new Array(jumlahData);
		arrData = new int[jumlahData];
		
		DataAngka.setArray(arrData);
		
		System.out.println("Isi Array: ");
		DataAngka.cetakArray(arrData);
		System.out.println();
		
		System.out.print("Jumlah Angka = ");
		System.out.println(DataAngka.jumlahArray(arrData));
	}
}

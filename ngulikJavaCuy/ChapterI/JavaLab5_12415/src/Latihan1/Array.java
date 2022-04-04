package Latihan1;

import java.util.Scanner;

public class Array {
	private int kolom;
	private int jumlah;
	private int [] data;
	
	public Array(int kolom) {
		this.kolom = kolom;
		data = new int [kolom];
	}
	
	public void setArray(int[] arr) {
		kolom = arr.length;
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < kolom; i++) {
			int idx = i + 1;
			System.out.print("Masukkan Angka ke-" + idx + " : ");
			arr[i] = input.nextInt();
		}
		input.close();
	}
	
	public void cetakArray(int[] arr) {
		kolom = arr.length;
		for(int i = 0; i < kolom; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public int jumlahArray(int[] arr) {
		kolom = arr.length;
		for(int i = 0; i < kolom; i++) {
			jumlah += arr[i];
		}
		return jumlah;
	}
	
}

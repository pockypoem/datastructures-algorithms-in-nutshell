package Latihan2;

import java.util.*;

public class MahasiswaArrayList {
	static int n;
	static String[] nim;
	static String[] nama;
	static Double[] ipk;
	static ArrayList<Mahasiswa> dataMahasiswa = new ArrayList <>();
	
	public static void main(String[] args) {
		System.out.print("Masukkan Jumlah Data: ");
		Scanner inp = new Scanner(System.in);
		n = inp.nextInt();
		
		nim = new String[n];
		nama = new String[n];
		ipk = new Double[n];
		
		for(int i = 0; i < n; i++) {
			int idx = i + 1;
			System.out.println("Data ke-" + idx);
			System.out.print("Masukkan NIM: ");
			nim[i] = inp.next();
			System.out.print("Masukkan Nama: ");
			nama[i] = inp.next();
			System.out.print("Masukkan IPK: ");
			ipk[i] = inp.nextDouble();
//			Mahasiswa data = new Mahasiswa(dataNim, dataNama, dataIpk);
//			dataMahasiswa.add(data);
		}
		
		setMahasiswa(nim, nama, ipk);
		cetakMahasiswa(dataMahasiswa);
		inp.close();
	}
	
	public static void setMahasiswa(String[] nim, String[] nama, Double[] ipk) {
		//gunakan perulangan untuk menyimpan data ke Class Mahasiswa
		for (int i = 0; i < n; i++) {
			Mahasiswa mhs = new Mahasiswa(nim[i], nama[i], ipk[i]);
			dataMahasiswa.add(mhs);
		}
	}
	
	public static void cetakMahasiswa(ArrayList<Mahasiswa> list) {
		//gunakan perulangan untuk mencetak data yang diambil dari atribut di class Mahasiswa
		for(int i = 0; i < n; i++) {
			int idx = i + 1;
			System.out.println("Data ke-" + idx);
			System.out.println("NIM: " + list.get(i).nim);
			System.out.println("Nama: " + list.get(i).nama);
			System.out.println("IPK: " + list.get(i).ipk);
		}
	}
}

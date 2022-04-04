package Latihan3;

import java.util.Vector;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class SomeVector {
	
	static Vector<String> mamalia = new Vector<>();
	static Vector<String> unggas = new Vector<>();
	static Vector<String> hewan = new Vector<>();
	static Vector<Integer> i = new Vector<>();
	static Vector<Kendaraan> k = new Vector<>();
	
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		int pilihan;
		int elemen;
		int pilihanHewan;
		int pilihanAngka;
		int idxHewan;
		int bilangan;
		String nama;
		
		do {
			System.out.println("==Daftar Komplit==");
			System.out.println("1.Mamalia");
			System.out.println("2.Unggas");
			System.out.println("3.Hewan");
			System.out.println("4.Bilangan");
			System.out.println("5.Kendaraan");
			System.out.println("6.Keluar");
			
			System.out.print("Masukkan Pilihanmu: ");
			pilihan = inp.nextInt();
					
			if(pilihan == 1) {
				System.out.println("1.Tambah Mamalia");
				System.out.println("2.Tampilkan Mamalia");
				System.out.println("3.Update Mamalia");
				System.out.println("4.Hapus Semua Mamalia");
				System.out.println("5.Hapus Spesifik Mamalia");
				System.out.println("6.Keluar");
				
				System.out.print("[Mamalia] Masukkan pilihanmu: ");
				pilihanHewan = inp.nextInt();
				
				while(pilihanHewan != 6) {
					switch(pilihanHewan) {
					case 1:
						System.out.print("Masukkan nama mamalia: ");
						nama = inp.next();
						mamalia.add(nama);
						System.out.println("Berhasil ditambahkan ke mamalia");
						System.out.print("[Mamalia] Masukkan pilihanmu: ");
						pilihanHewan = inp.nextInt();
						break;
					case 2:
						System.out.println("Daftar Mamalia: ");
						display(mamalia);
						System.out.print("[Mamalia] Masukkan pilihanmu: ");
						pilihanHewan = inp.nextInt();
						break;
					case 3:
						System.out.print("Masukkan index yang ingin diupdate: ");
						elemen = inp.nextInt();
						String namaSebelum = mamalia.get(elemen);
						if(elemen < mamalia.size()) {
							System.out.print("Masukkan nama mamalia: ");
							nama = inp.next();
							mamalia.set(elemen, nama);
							if(hewan.contains(namaSebelum)) {
								idxHewan = hewan.indexOf(namaSebelum);
								hewan.set(idxHewan, nama);
							}
							System.out.println("Berhasil diupdate");
						} else {
							System.out.println("Index yang anda masukkan diluar batas");
						}
						System.out.print("[Mamalia] Masukkan pilihanmu: ");
						pilihanHewan = inp.nextInt();
						break;
					case 4:
						mamalia.clear();
						System.out.println("Daftar Mamalia telah dihapus");
						System.out.print("[Mamalia] Masukkan pilihanmu: ");
						pilihanHewan = inp.nextInt();
						break;
					case 5:
						System.out.print("Masukkan nama mamalia yang dihapus: ");
						nama = inp.next();
						if(mamalia.contains(nama)) {
							mamalia.remove(nama);
						} else {
							System.out.println("Tidak ada nama mamalia tersebut");
						}
						System.out.print("[Mamalia] Masukkan pilihanmu: ");
						pilihanHewan = inp.nextInt();
						break;
					default:
						System.out.print("[Mamalia] Masukkan pilihanmu: ");
						pilihanHewan = inp.nextInt();
						break;
					}
				}
				
				
				
				
			} else if(pilihan == 2) {
				System.out.println("1.Tambah Unggas");
				System.out.println("2.Tampilkan Unggas");
				System.out.println("3.Update Unggas");
				System.out.println("4.Hapus Semua Unggas");
				System.out.println("5.Hapus Spesifik Unggas");
				System.out.println("6.Keluar");
				
				System.out.print("[Unggas] Masukkan pilihanmu: ");
				pilihanHewan = inp.nextInt();
				
				while(pilihanHewan != 6) {
					switch(pilihanHewan) {
					case 1:
						System.out.print("Masukkan nama Unggas: ");
						nama = inp.next();
						unggas.add(nama);
						System.out.println("Berhasil ditambahkan ke unggas");
						System.out.print("[Unggas] Masukkan pilihanmu: ");
						pilihanHewan = inp.nextInt();
						break;
					case 2:
						System.out.println("Daftar Unggas: ");
						display(unggas);
						System.out.print("[Unggas] Masukkan pilihanmu: ");
						pilihanHewan = inp.nextInt();
						break;
					case 3:
						System.out.print("Masukkan index yang ingin diupdate: ");
						elemen = inp.nextInt();
						String namaSebelum = unggas.get(elemen);
						if(elemen < unggas.size()) {
							System.out.print("Masukkan nama unggas: ");
							nama = inp.next();
							unggas.set(elemen, nama);
							if(hewan.contains(namaSebelum)) {
								idxHewan = hewan.indexOf(namaSebelum);
								hewan.set(idxHewan, nama);
							}
							System.out.println("Berhasil di update");
						} else {
							System.out.println("Index yang anda masukkan diluar batas");
						}
						System.out.print("[Unggas] Masukkan pilihanmu: ");
						pilihanHewan = inp.nextInt();
						break;
					case 4:
						unggas.clear();
						System.out.println("Daftar Unggas telah dihapus");
						System.out.print("[Unggas] Masukkan pilihanmu: ");
						pilihanHewan = inp.nextInt();
						break;
					case 5:
						System.out.print("Masukkan nama unggas yang dihapus: ");
						nama = inp.next();
						if(unggas.contains(nama)) {
							unggas.remove(nama);
						} else {
							System.out.println("Tidak ada nama unggas tersebut");
						}
						System.out.print("[Unggas] Masukkan pilihanmu: ");
						pilihanHewan = inp.nextInt();
						break;
					default:
						System.out.print("[Unggas] Masukkan pilihanmu: ");
						pilihanHewan = inp.nextInt();
						break;
					}
				}
				
				
				
			} else if(pilihan == 3) {
				
				System.out.println("1.Tambah Hewan");
				System.out.println("2.Tampilkan Hewan");
				System.out.println("3.Update Hewan");
				System.out.println("4.Hapus Semua Hewan");
				System.out.println("5.Hapus Hewan Spesifik");
				System.out.println("6.Keluar");
				
				System.out.print("[Hewan] Masukkan pilihanmu: ");
				pilihanHewan = inp.nextInt();
				
				while(pilihanHewan != 6) {
					switch(pilihanHewan) {
					case 1:
						System.out.print("Masukkan nama Hewan: ");
						nama = inp.next();
						hewan.add(nama);
						System.out.println("Berhasil ditambahkan ke daftar");
						System.out.print("[Hewan] Masukkan pilihanmu: ");
						pilihanHewan = inp.nextInt();
						break;
					case 2:
						addToHewan();
						System.out.println("Daftar Hewan: ");
						display(hewan);
						System.out.print("[Hewan] Masukkan pilihanmu: ");
						pilihanHewan = inp.nextInt();
						break;
					case 3:
						System.out.print("Masukkan index yang ingin diupdate: ");
						elemen = inp.nextInt();
						String namaSebelum = hewan.get(elemen);
						boolean elemenInMamal = mamalia.contains(namaSebelum);
						boolean elemenInUnggas = unggas.contains(namaSebelum);
						if(elemen < hewan.size()) {
							System.out.print("Masukkan nama hewan: ");
							nama = inp.next();
							if(elemenInMamal == true) {
								int idxMamal = mamalia.indexOf(namaSebelum);
								mamalia.set(idxMamal, nama);
							} else if(elemenInUnggas == true) {
								int idxUnggas = unggas.indexOf(namaSebelum);
								unggas.set(idxUnggas, nama);
							}
							System.out.println("Data berhasil diupdate");
							hewan.set(elemen, nama);
						} else {
							System.out.println("Index yang anda masukkan diluar batas");
						}
						System.out.print("[Hewan] Masukkan pilihanmu: ");
						pilihanHewan = inp.nextInt();
						break;
						
					case 4:
						hewan.clear();
						System.out.println("Daftar Hewan telah dihapus");
						System.out.print("[Hewan] Masukkan pilihanmu: ");
						pilihanHewan = inp.nextInt();
						break;
					case 5:
						System.out.print("Masukkan nama hewan yang dihapus: ");
						nama = inp.next();
						removeHewan(nama);
						System.out.print("[Hewan] Masukkan pilihanmu: ");
						pilihanHewan = inp.nextInt();
						break;
					default:
						System.out.print("[Hewan] Masukkan pilihanmu: ");
						pilihanHewan = inp.nextInt();
						break;
					}
				}
				
				
				
			} else if(pilihan == 4) {
				System.out.println("1.Tambah Bilangan");
				System.out.println("2.Tampilkan Daftar Bilangan");
				System.out.println("3.Update Bilangan");
				System.out.println("4.Hapus Semua Bilangan");
				System.out.println("5.Hapus Spesifik Bilangan");
				System.out.println("6.Keluar");
				
				System.out.print("[Bilangan] Masukkan pilihanmu: ");
				pilihanAngka = inp.nextInt();
				
				while(pilihanAngka != 6) {
					switch(pilihanAngka) {
					case 1:
						System.out.print("Masukkan bilangan: ");
						bilangan = inp.nextInt();
						i.add(bilangan);
						System.out.println("Berhasil ditambahkan ke daftar bilangan");
						System.out.print("[Bilangan] Masukkan pilihanmu: ");
						pilihanAngka = inp.nextInt();
						break;
					case 2:
						System.out.println("Daftar Bilangan: ");
						if(i.size() > 0) {
							for(int j = 0; j < i.size(); j++) {
								int idx = j + 1;
								System.out.println("Data ke-" + idx + " " + i.get(j));
							}
						} else {
							System.out.println("Tidak ada data");
						}
						System.out.println();
						System.out.print("[Bilangan] Masukkan pilihanmu: ");
						pilihanAngka = inp.nextInt();
						break;
					case 3:
						System.out.print("Masukkan index yang ingin diupdate: ");
						elemen = inp.nextInt();
						if(elemen < i.size()) {
							System.out.print("Masukkan Bilangan: ");
							bilangan = inp.nextInt();
							i.set(elemen, bilangan);
						} else {
							System.out.println("Index yang anda masukkan diluar batas");
						}
						System.out.print("[Bilangan] Masukkan pilihanmu: ");
						pilihanAngka = inp.nextInt();
						break;
					case 4:
						i.clear();
						System.out.println("Daftar Bilangan telah dihapus");
						System.out.print("[Bilangan] Masukkan pilihanmu: ");
						pilihanAngka = inp.nextInt();
						break;
					case 5:
						System.out.print("Masukkan index bilangan yang ingin dihapus: ");
						int idxBil = inp.nextInt();
						if(idxBil < i.size()) {
							i.remove(idxBil);
						} else {
							System.out.println("Index yang anda masukkan di luar batas");
						}
						System.out.print("[Bilangan] Masukkan pilihanmu: ");
						pilihanAngka = inp.nextInt();
						break;
					default:
						System.out.print("[Bilangan] Masukkan pilihanmu: ");
						pilihanAngka = inp.nextInt();
						break;
					}
				}
				
				
			} else if(pilihan == 5) {
				
				System.out.println("1.Tambah Kendaraan");
				System.out.println("2.Tampilkan Daftar Kendaraan");
				System.out.println("3.Update Kendaraan");
				System.out.println("4.Hapus Semua Kendaraan");
				System.out.println("5.Hapus Spesifik Kendaraan");
				System.out.println("6.Keluar");
				
				System.out.print("[Kendaraan] Masukkan pilihanmu: ");
				pilihanAngka = inp.nextInt();
				
				while(pilihanAngka != 6) {
					switch(pilihanAngka) {
					case 1:
						System.out.print("Masukkan merk kendaraan: ");
						nama = inp.next();
						Kendaraan kndrn = new Kendaraan(nama);
						k.add(kndrn);
						System.out.println("Berhasil ditambahkan ke daftar kendaraan");
						System.out.print("[Kendaraan] Masukkan pilihanmu: ");
						pilihanAngka = inp.nextInt();
						break;
					case 2:
						System.out.println("Daftar Kendaraan: ");
						if(k.size() > 0) {
							for(int j = 0; j < k.size(); j++) {
								int idx = j + 1;
								System.out.println("Data ke-" + idx + " " + k.get(j).merk);
							}
						} else {
							System.out.println("Tidak ada data");
						}
						System.out.println();
						System.out.print("[Kendaraan] Masukkan pilihanmu: ");
						pilihanAngka = inp.nextInt();
						break;
					case 3:
						System.out.print("Masukkan index yang ingin diupdate: ");
						elemen = inp.nextInt();
						if(elemen < k.size()) {
							System.out.print("Masukkan merk: ");
							nama = inp.next();
							Kendaraan foo = new Kendaraan(nama);
							k.set(elemen, foo);
						} else {
							System.out.println("Index yang anda masukkan diluar batas");
						}
						System.out.print("[Bilangan] Masukkan pilihanmu: ");
						pilihanAngka = inp.nextInt();
						break;
					case 4:
						k.clear();
						System.out.println("Daftar Kendaraan telah dihapus");
						System.out.print("[Kendaraan] Masukkan pilihanmu: ");
						pilihanAngka = inp.nextInt();
						break;
					case 5:
						System.out.print("Masukkan index merk yang dihapus: ");
						int idx = inp.nextInt();
						if(idx < k.size()) {
							k.remove(idx);
						} else {
							System.out.println("Index yang anda masukkan diluar batas");
						}
						System.out.print("[Kendaraan] Masukkan pilihanmu: ");
						pilihanAngka = inp.nextInt();
						break;
					default:
						System.out.print("[Kendaraan] Masukkan pilihanmu: ");
						pilihanAngka = inp.nextInt();
						break;	
					}
	
				}
			}
			
		} while(pilihan != 6);
		
		inp.close();
		
	}
	
	public static void display(Vector<String> list) {
		if(list.size() > 0) {
			for(int i = 0; i < list.size(); i++) {
				int idx = i + 1;
				System.out.println("Data ke-" + idx + " " + list.get(i));
			}
		} else {
			System.out.println("Tidak ada data");
		}
		System.out.println();
	}
	
	public static void addToHewan() {
		hewan.addAll(mamalia);
		hewan.addAll(unggas);
		
		LinkedHashSet<String> tampungHewan = new LinkedHashSet<String>(hewan);
		hewan.clear();
		hewan.addAll(tampungHewan);

	}
	
	public static void removeHewan(String hewanYangDihapus) {
		if (mamalia.contains(hewanYangDihapus)) {
			mamalia.remove(hewanYangDihapus);
		}
		if (unggas.contains(hewanYangDihapus)) {
			unggas.remove(hewanYangDihapus);
		}
		if(hewan.contains(hewanYangDihapus)) {
			hewan.remove(hewanYangDihapus);
		} else {
			System.out.println("Tidak ada nama hewan tersebut");
		}
	}
}

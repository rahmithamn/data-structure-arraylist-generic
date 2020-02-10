package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        Generic<ATK> atkList = new Generic<>(2);
        Generic<Bag> bagList = new Generic<>(2);

        do {
            String kodeBarang, jenisBarang, namaBarang;
            int stokBarang;

            System.out.println("1. Input Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Delete Data");
            System.out.println("4. Edit Data");
            int pilihan = sn.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Kode Barang = ");
                    kodeBarang = sn.next();
                    System.out.print("Jenis Barang = ");
                    jenisBarang = sn.next();
                    System.out.print("Nama Barang = ");
                    namaBarang = sn.next();
                    System.out.print("Stok Barang = ");
                    stokBarang = sn.nextInt();

                    if (kodeBarang.contains("A") || kodeBarang.contains("B")) {
                        ATK atk = new ATK(kodeBarang, jenisBarang, namaBarang, stokBarang);
                        atkList.addData(atk);
                    } else if(kodeBarang.contains("C")) {
                        Bag bag = new Bag(kodeBarang, jenisBarang, namaBarang, stokBarang);
                        bagList.addData(bag);
                    } else {
                        System.out.println("kode barang harus dimulai dengan a, b, c");
                    }
                    break;
                case 2:
                    atkList.displayData();
                    bagList.displayData();
                    break;
                case 3:
                    System.out.print("Masukkan kode barang yang akan dihapus = ");
                    String hapusKodeBarang = sn.next();

                    if (hapusKodeBarang.contains("A") || hapusKodeBarang.contains("B")) {
                        for (int i = 0; i < atkList.getSize(); i++) {
                            if (hapusKodeBarang.equalsIgnoreCase(atkList.getData().get(i).getKodeBarang())) {
                                atkList.removeData(atkList.getData().get(i));
                                System.out.println("Data ATK berhasil dihapus");
                            }
                        }
                    } else if (hapusKodeBarang.contains("C")) {
                        for (int i = 0; i < bagList.getSize(); i++) {
                            if (hapusKodeBarang.equalsIgnoreCase(bagList.getData().get(i).getKodeBarang())) {
                                bagList.removeData(bagList.getData().get(i));
                                System.out.println("Data Bag berhasil dihapus");
                            }
                        }
                    } else {
                        System.out.println("kode barang harus dimulai dengan a. b, c");
                    }

                    break;
                case 4:
                    System.out.print("Masukkan kode barang yang akan diedit = ");
                    String editKodeBarang = sn.next();

                    if (editKodeBarang.contains("A") || editKodeBarang.contains("B")) {
                        for (int i = 0; i < atkList.getSize(); i++) {
                            kodeBarang = atkList.getData().get(i).getKodeBarang();

                            if (editKodeBarang.equalsIgnoreCase(kodeBarang)) {
                                System.out.print("Jenis Barang = ");
                                jenisBarang = sn.next();
                                System.out.print("Nama Barang = ");
                                namaBarang = sn.next();
                                System.out.print("Stok Barang = ");
                                stokBarang = sn.nextInt();

                                ATK atk1 = new ATK(kodeBarang, jenisBarang, namaBarang, stokBarang);

                                atkList.updateData(atkList.getData().get(i), atk1);
                                break;
                            }
                        }
                    } else if (editKodeBarang.contains("C")) {
                        for (int i = 0; i < bagList.getSize(); i++) {
                            if (editKodeBarang.equalsIgnoreCase(bagList.getData().get(i).getKodeBarang())) {
                                System.out.print("Jenis Barang = ");
                                jenisBarang = sn.next();
                                System.out.print("Nama Barang = ");
                                namaBarang = sn.next();
                                System.out.print("Stok Barang = ");
                                stokBarang = sn.nextInt();

                            }
                        }
                    } else {
                        System.out.println("kode barang harus dimulai dengan a. b, c");
                    }
                    break;

            }
        }while (true);
    }
}

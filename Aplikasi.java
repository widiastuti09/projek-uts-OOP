import java.util.LinkedList;
import java.util.Scanner;
import model.*;
import service.*;

public class Aplikasi {

    private static Scanner scanner;
    private static KaryawanService service;

    public static void main(String args[]) {
        int opsi = 0;
        scanner = new Scanner(System.in);
        service = new KaryawanService();

        do {
            cetakMenu();
            opsi = scanner.nextInt();
            switch(opsi) {
                case 1 :
                  modulAdd();
                  break;
                case 2 :
                  ubahData(); break;
                case 3 :
                  hapusData(); break;
                case 4 :
                  tampilData();
                  break;
            }
        } while(opsi != 0);

    }

    private static void cetakMenu() {
        System.out.println("\n\n");
        System.out.println("APLIKASI Data Karyawan");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Tampilkan data");
        System.out.println("-----------");
        System.out.println("0. KELUAR");
        System.out.println("\n");
        System.out.print("Pilihan > ");
    }

    private static void modulAdd() {
        String id, nama, email, no_hp, alamat;

        System.out.println("--- tambah data ---");
        System.out.print("Id : ");
        scanner = new Scanner(System.in);
        id = scanner.nextLine();
        System.out.print("Nama : ");
        nama = scanner.nextLine();
        System.out.print("Email : ");
        email = scanner.nextLine();
        System.out.print("No.Hp : ");
        no_hp = scanner.nextLine();
        System.out.print("Alamat : ");
        alamat = scanner.nextLine();
        service.addData(new Karyawan(id, nama, email, no_hp, alamat));
    }

    private static void tampilData() {
        LinkedList<Karyawan> result = (LinkedList<Karyawan>) service.getAllData();

        int i=1;
        for(Karyawan krw : result) {
            System.out.println("data ke-" + i++);
            System.out.println("  id: " + krw.getId());
            System.out.println("  nama: " + krw.getNama());
            System.out.println("  email: " + krw.getEmail());
            System.out.println("  no_hp: " + krw.getNo_hp());
            System.out.println("  alamat: " + krw.getAlamat());
        }
    }

    private static void ubahData() {
        String id, nama, kelas, email, no_hp, alamat;

        System.out.println("--- perubahan data ---");
        System.out.print("Id : ");
        scanner = new Scanner(System.in);
        id = scanner.nextLine();
        System.out.print("Nama : ");
        nama = scanner.nextLine();
        System.out.print("Email : ");
        email = scanner.nextLine();
        System.out.print("No.Hp : ");
        no_hp = scanner.nextLine();
        System.out.print("Alamat : ");
        alamat = scanner.nextLine();
        service.updateData(new Karyawan(id, nama, email, no_hp, alamat));
    }

    private static void hapusData() {
        String id;

        System.out.println("--- hapus data ---");
        System.out.print("Id : ");
        scanner = new Scanner(System.in);
        id = scanner.nextLine();
        service.deleteData(new Karyawan(id, null, null, null, null ));
    }

}
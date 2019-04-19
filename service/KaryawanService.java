package service;

import java.util.LinkedList;
import java.util.List;

import model.Karyawan;

public class KaryawanService {

    private static List<Karyawan> data = new LinkedList<>();

    public void addData(Karyawan krw) {
        data.add(krw);
        System.out.println("data telah tersimpan");
    }

    public void updateData(Karyawan krw) {
        int result = data.indexOf(krw);
        
        if(result >= 0) {
            data.set(result, krw);
            System.out.println("data telah diubah");
        } else {
            System.out.println("data yang ingin diubah tidak ditemukan");
        }
    }

    public void deleteData(Karyawan krw) {
        int result = data.indexOf(krw);

        if(result >= 0) {
            data.remove(result);
            System.out.println("data telah terhapus");
        } else {
            System.out.println("Data yang ingin dihapus tidak ada");
        }
    }

    public List<Karyawan> getAllData() {
        return data;
    }

}
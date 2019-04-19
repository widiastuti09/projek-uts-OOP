package model;

public class Karyawan {

    private String id;
    private String nama;
    private String email;
    private String no_hp;
    private String alamat;

    public Karyawan() {}

    public Karyawan(String id, String nama, String email, String no_hp, String alamat) {
        this.id = id;
        this.nama = nama;
        this.email = email;
        this.no_hp = no_hp;
        this.alamat = alamat;
    }

    @Override
    public boolean equals(Object obj) {
        Karyawan krw = (Karyawan) obj;
        if(this.id.equals(krw.getId())) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "[ " + id + ", " + nama + ", " + email + ", " + no_hp + ", " + alamat +" ];";
    }



    public void setId(String id) { this.id = id; }

    public String getId() { return id; }

    public void setNama(String nama) { this.nama = nama; }

    public String getNama() { return nama; }

    public void setEmail(String email) { this.email = email; }

    public String getEmail() { return email; }

    public void setNo_hp(String no_hp) { this.no_hp = no_hp; }

    public String getNo_hp() { return no_hp; }

    public void setAlamat(String alamat) { this.alamat = alamat; }

    public String getAlamat() { return alamat; }

}
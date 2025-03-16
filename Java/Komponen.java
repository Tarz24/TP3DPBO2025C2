public class Komponen {
    private String merk;
    private String nama;

    public Komponen() {
        this.merk = "";
        this.nama = "";
    }

    public Komponen(String merk, String nama) {
        this.merk = merk;
        this.nama = nama;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMerk() {
        return merk;
    }

    public String getNama() {
        return nama;
    }
}
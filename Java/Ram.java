public class Ram extends Komponen {

    private int kapasitasGB;
    private String ddr;

    public Ram() {
        super();
        this.kapasitasGB = 0;
        this.ddr = "";
    }

    public Ram(int kapasitasGB, String ddr, String merk, String nama) {
        super(merk, nama);
        this.kapasitasGB = kapasitasGB;
        this.ddr = ddr;
    }

    public void setKapasitasGB(int kapasitasGB) {
        this.kapasitasGB = kapasitasGB;
    }

    public void setDdr(String ddr) {
        this.ddr = ddr;
    }

    public int getKapasitasGB() {
        return kapasitasGB;
    }

    public String getDdr() {
        return ddr;
    }
}
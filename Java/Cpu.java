public class Cpu extends Komponen {
    
    private int jumlahCore;
    private float kecepatanGHz;
    private String tipeSocket;
    private ElektronikDevice elektronikDevice;

    public Cpu() {
        super();
        this.elektronikDevice = new ElektronikDevice();
        this.jumlahCore = 0;
        this.kecepatanGHz = 0.0f;
        this.tipeSocket = "";
    }

    public Cpu(int jumlahCore, float kecepatanGHz, String tipeSocket, String merk, String nama, int konsumsiDayaWatt) {
        super(merk, nama);
        this.elektronikDevice = new ElektronikDevice(konsumsiDayaWatt);
        this.jumlahCore = jumlahCore;
        this.kecepatanGHz = kecepatanGHz;
        this.tipeSocket = tipeSocket;
    }

    public void setJumlahCore(int jumlahCore) {
        this.jumlahCore = jumlahCore;
    }

    public void setKecepatanGHz(float kecepatanGHz) {
        this.kecepatanGHz = kecepatanGHz;
    }

    public void setTipeSocket(String tipeSocket) {
        this.tipeSocket = tipeSocket;
    }
    
    public void setKonsumsiDayaWatt(int konsumsiDayaWatt) {
        this.elektronikDevice.setKonsumsiDayaWatt(konsumsiDayaWatt);
    }

    public int getJumlahCore() {
        return jumlahCore;
    }

    public float getKecepatanGHz() {
        return kecepatanGHz;
    }

    public String getTipeSocket() {
        return tipeSocket;
    }
    
    public int getKonsumsiDayaWatt() {
        return this.elektronikDevice.getKonsumsiDayaWatt();
    }
}
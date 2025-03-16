public class Harddrive extends Komponen {

    private int kapasitasGB;
    private String tipeDrive;
    private int kecepatanMBps;
    private ElektronikDevice elektronikDevice;

    public Harddrive() {
        super();
        this.elektronikDevice = new ElektronikDevice();
        this.kapasitasGB = 0;
        this.tipeDrive = "";
        this.kecepatanMBps = 0;
    }

    public Harddrive(int kapasitasGB, String tipeDrive, int kecepatanMBps, String merk, String nama, int konsumsiDayaWatt) {
        super(merk, nama);
        this.elektronikDevice = new ElektronikDevice(konsumsiDayaWatt);
        this.kapasitasGB = kapasitasGB;
        this.tipeDrive = tipeDrive;
        this.kecepatanMBps = kecepatanMBps;
    }

    public void setKapasitasGB(int kapasitasGB) {
        this.kapasitasGB = kapasitasGB;
    }

    public void setTipeDrive(String tipeDrive) {
        this.tipeDrive = tipeDrive;
    }

    public void setKecepatanMBps(int kecepatanMBps) {
        this.kecepatanMBps = kecepatanMBps;
    }
    
    public void setKonsumsiDayaWatt(int konsumsiDayaWatt) {
        this.elektronikDevice.setKonsumsiDayaWatt(konsumsiDayaWatt);
    }

    public int getKapasitasGB() {
        return kapasitasGB;
    }

    public String getTipeDrive() {
        return tipeDrive;
    }

    public int getKecepatanMBps() {
        return kecepatanMBps;
    }
    
    public int getKonsumsiDayaWatt() {
        return this.elektronikDevice.getKonsumsiDayaWatt();
    }
}
public class GraphicsCard extends Komponen {

    private int vRamGB;
    private String gpuModel;
    private ElektronikDevice elektronikDevice;

    public GraphicsCard() {
        super();
        this.elektronikDevice = new ElektronikDevice();
        this.vRamGB = 0;
        this.gpuModel = "";
    }

    public GraphicsCard(int vRamGB, String gpuModel, String merk, String nama, int konsumsiDayaWatt) {
        super(merk, nama);
        this.elektronikDevice = new ElektronikDevice(konsumsiDayaWatt);
        this.vRamGB = vRamGB;
        this.gpuModel = gpuModel;
    }

    public void setVRamGB(int vRamGB) {
        this.vRamGB = vRamGB;
    }

    public void setGpuModel(String gpuModel) {
        this.gpuModel = gpuModel;
    }
    
    public void setKonsumsiDayaWatt(int konsumsiDayaWatt) {
        this.elektronikDevice.setKonsumsiDayaWatt(konsumsiDayaWatt);
    }

    public int getVRamGB() {
        return vRamGB;
    }

    public String getGpuModel() {
        return gpuModel;
    }
    
    public int getKonsumsiDayaWatt() {
        return this.elektronikDevice.getKonsumsiDayaWatt();
    }
}
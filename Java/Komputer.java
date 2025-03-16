import java.util.ArrayList;
import java.util.List;

public class Komputer {
    private String nama;
    private Cpu cpu;
    private List<Ram> ramList;
    private Harddrive hardDrive;
    private GraphicsCard gpu;
    
    public Komputer() {
        this.ramList = new ArrayList<>();
    }

    public Komputer(String nama, Cpu cpu, List<Ram> ramList, Harddrive hardDrive, GraphicsCard gpu) {
        this.nama = nama;
        this.cpu = cpu;
        this.ramList = ramList;
        this.hardDrive = hardDrive;
        this.gpu = gpu;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public void setRamList(List<Ram> ramList) {
        this.ramList = ramList;
    }

    public void setHardDrive(Harddrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public void setGpu(GraphicsCard gpu) {
        this.gpu = gpu;
    }

    public void addRam(Ram ram) {
        this.ramList.add(ram);
    }

    public String getNama() {
        return this.nama;
    }

    public Cpu getCpu() {
        return this.cpu;
    }

    public List<Ram> getRamList() {
        return this.ramList;
    }

    public Harddrive getHarddrive() {
        return this.hardDrive;
    }

    public GraphicsCard getGpu() {
        return this.gpu;
    }
}
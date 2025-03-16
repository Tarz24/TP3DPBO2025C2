import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Urutan parameter: jumlahCore, kecepatanGHz, tipeSocket, merk, nama, konsumsiDayaWatt
        Cpu cpu = new Cpu(8, 3.6f, "LGA1200", "Intel", "Core i7-11700K", 125);
        
        // Urutan parameter: kapasitasGB, ddr, merk, nama
        Ram ram1 = new Ram(16, "DDR4", "Corsair", "Vengeance RGB Pro");
        Ram ram2 = new Ram(16, "DDR4", "Corsair", "Vengeance RGB Pro");
        
        List<Ram> ramList = new ArrayList<>();
        ramList.add(ram1);
        ramList.add(ram2);
        
        // Urutan parameter: kapasitasGB, tipeDrive, kecepatanMBps, merk, nama, konsumsiDayaWatt
        Harddrive harddrive = new Harddrive(1000, "SSD", 550, "Samsung", "970 EVO Plus", 7);
        
        // Urutan parameter: vRamGB, gpuModel, merk, nama, konsumsiDayaWatt
        GraphicsCard gpu = new GraphicsCard(8, "RTX 3070", "NVIDIA", "GeForce RTX 3070", 220);
        
        Komputer komputer = new Komputer("Gaming PC", cpu, ramList, harddrive, gpu);
        
        Ram ram3 = new Ram(32, "DDR4", "Kingston", "FURY Beast");
        komputer.addRam(ram3);
        
        System.out.println("============================================");
        System.out.println("          INFORMASI KOMPUTER               ");
        System.out.println("============================================");
        System.out.println("Nama Komputer   : " + komputer.getNama());
        System.out.println("============================================");
        
        System.out.println("CPU             : " + komputer.getCpu().getMerk() + " " 
                + komputer.getCpu().getNama());
        System.out.println("Jumlah Core     : " + komputer.getCpu().getJumlahCore() + " Core");
        System.out.println("Kecepatan       : " + komputer.getCpu().getKecepatanGHz() + " GHz");
        System.out.println("Socket          : " + komputer.getCpu().getTipeSocket());
        System.out.println("Konsumsi Daya   : " + komputer.getCpu().getKonsumsiDayaWatt() + " Watt");
        System.out.println("============================================");
        
        System.out.println("RAM Terpasang   : " + komputer.getRamList().size() + " buah");
        int totalRam = 0;
        for (int i = 0; i < komputer.getRamList().size(); i++) {
            System.out.println("RAM #" + (i+1) + "          : " + komputer.getRamList().get(i).getMerk() 
                    + " " + komputer.getRamList().get(i).getNama());
            System.out.println("Kapasitas       : " + komputer.getRamList().get(i).getKapasitasGB() + " GB");
            System.out.println("Tipe            : " + komputer.getRamList().get(i).getDdr());
            totalRam += komputer.getRamList().get(i).getKapasitasGB();
        }
        System.out.println("Total RAM       : " + totalRam + " GB");
        System.out.println("============================================");
        
        System.out.println("Storage         : " + komputer.getHarddrive().getMerk() + " " 
                + komputer.getHarddrive().getNama());
        System.out.println("Kapasitas       : " + komputer.getHarddrive().getKapasitasGB() + " GB");
        System.out.println("Tipe            : " + komputer.getHarddrive().getTipeDrive());
        System.out.println("Kecepatan       : " + komputer.getHarddrive().getKecepatanMBps() + " MB/s");
        System.out.println("Konsumsi Daya   : " + komputer.getHarddrive().getKonsumsiDayaWatt() + " Watt");
        System.out.println("============================================");
        
        System.out.println("GPU             : " + komputer.getGpu().getMerk() + " " 
                + komputer.getGpu().getNama());
        System.out.println("Model           : " + komputer.getGpu().getGpuModel());
        System.out.println("VRAM            : " + komputer.getGpu().getVRamGB() + " GB");
        System.out.println("Konsumsi Daya   : " + komputer.getGpu().getKonsumsiDayaWatt() + " Watt");
        System.out.println("============================================");
        
        int totalDaya = komputer.getCpu().getKonsumsiDayaWatt() + 
                komputer.getHarddrive().getKonsumsiDayaWatt() + 
                komputer.getGpu().getKonsumsiDayaWatt();
                
        System.out.println("Total Konsumsi Daya: " + totalDaya + " Watt");
        System.out.println("============================================");
    }
}
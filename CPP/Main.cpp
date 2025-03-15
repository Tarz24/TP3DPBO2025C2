#include <iostream>
#include <vector>
#include "Cpu.cpp"
#include "Ram.cpp"
#include "Harddrive.cpp"
#include "GraphicsCard.cpp"
#include "Komputer.cpp"

using namespace std;

int main() {
    Cpu cpu(8, 3.6, "LGA1200", "Intel", "Core i7-11700K", 125);
    
    Ram ram1(16, "DDR4", "Corsair", "Vengeance RGB Pro");
    Ram ram2(16, "DDR4", "Corsair", "Vengeance RGB Pro");
    
    vector<Ram> ramList;
    ramList.push_back(ram1);
    ramList.push_back(ram2);
    
    Harddrive harddrive(1000, "SSD", 550, "Samsung", "970 EVO Plus", 7);
    
    GraphicsCard gpu(8, "RTX 3070", "NVIDIA", "GeForce RTX 3070", 220);
    
    Komputer komputer("Gaming PC", cpu, ramList, harddrive, gpu);
    
    Ram ram3(32, "DDR4", "Kingston", "FURY Beast");
    komputer.addRam(ram3);
    
    cout << "============================================" << endl;
    cout << "          INFORMASI KOMPUTER               " << endl;
    cout << "============================================" << endl;
    cout << "Nama Komputer   : " << komputer.getNama() << endl;
    cout << "============================================" << endl;
    
    cout << "CPU             : " << komputer.getCpu().getMerk() << " " 
         << komputer.getCpu().getNama() << endl;
    cout << "Jumlah Core     : " << komputer.getCpu().getJumlahCore() << " Core" << endl;
    cout << "Kecepatan       : " << komputer.getCpu().getKecepatanGHz() << " GHz" << endl;
    cout << "Socket          : " << komputer.getCpu().getTipeSocket() << endl;
    cout << "Konsumsi Daya   : " << komputer.getCpu().getKonsumsiDayaWatt() << " Watt" << endl;
    cout << "============================================" << endl;
    
    cout << "RAM Terpasang   : " << komputer.getRamList().size() << " buah" << endl;
    int totalRam = 0;
    for (int i = 0; i < komputer.getRamList().size(); i++) {
        cout << "RAM #" << (i+1) << "          : " << komputer.getRamList()[i].getMerk() 
             << " " << komputer.getRamList()[i].getNama() << endl;
        cout << "Kapasitas       : " << komputer.getRamList()[i].getKapasitasGB() << " GB" << endl;
        cout << "Tipe            : " << komputer.getRamList()[i].getDdr() << endl;
        totalRam += komputer.getRamList()[i].getKapasitasGB();
    }
    cout << "Total RAM       : " << totalRam << " GB" << endl;
    cout << "============================================" << endl;
    
    cout << "Storage         : " << komputer.getHarddrive().getMerk() << " " 
         << komputer.getHarddrive().getNama() << endl;
    cout << "Kapasitas       : " << komputer.getHarddrive().getKapasitasGB() << " GB" << endl;
    cout << "Tipe            : " << komputer.getHarddrive().getTipeDrive() << endl;
    cout << "Kecepatan       : " << komputer.getHarddrive().getKecepatanMBps() << " MB/s" << endl;
    cout << "Konsumsi Daya   : " << komputer.getHarddrive().getKonsumsiDayaWatt() << " Watt" << endl;
    cout << "============================================" << endl;
    
    cout << "GPU             : " << komputer.getGpu().getMerk() << " " 
         << komputer.getGpu().getNama() << endl;
    cout << "Model           : " << komputer.getGpu().getGpuModel() << endl;
    cout << "VRAM            : " << komputer.getGpu().getVRamGB() << " GB" << endl;
    cout << "Konsumsi Daya   : " << komputer.getGpu().getKonsumsiDayaWatt() << " Watt" << endl;
    cout << "============================================" << endl;
    
    int totalDaya = komputer.getCpu().getKonsumsiDayaWatt() + 
                   komputer.getHarddrive().getKonsumsiDayaWatt() + 
                   komputer.getGpu().getKonsumsiDayaWatt();
                   
    cout << "Total Konsumsi Daya: " << totalDaya << " Watt" << endl;
    cout << "============================================" << endl;
    
    return 0;
}
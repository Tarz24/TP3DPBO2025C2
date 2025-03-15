from Cpu import Cpu
from Ram import Ram
from Harddrive import Harddrive
from GraphicsCard import GraphicsCard
from Komputer import Komputer

cpu = Cpu(8, 3.6, "LGA1200", "Intel", "Core i7-11700K", 125)

ram1 = Ram(16, "DDR4", "Corsair", "Vengeance RGB Pro")
ram2 = Ram(16, "DDR4", "Corsair", "Vengeance RGB Pro")

ram_list = []
ram_list.append(ram1)
ram_list.append(ram2)

harddrive = Harddrive(1000, "SSD", 550, "Samsung", "970 EVO Plus", 7)

gpu = GraphicsCard(8, "RTX 3070", "NVIDIA", "GeForce RTX 3070", 220)

komputer = Komputer("Gaming PC", cpu, ram_list, harddrive, gpu)

ram3 = Ram(32, "DDR4", "Kingston", "FURY Beast")
komputer.add_ram(ram3)

print("============================================")
print("          INFORMASI KOMPUTER               ")
print("============================================")
print(f"Nama Komputer   : {komputer.get_nama()}")
print("============================================")

print(f"CPU             : {komputer.get_cpu().get_merk()} {komputer.get_cpu().get_nama()}")
print(f"Jumlah Core     : {komputer.get_cpu().get_jumlah_core()} Core")
print(f"Kecepatan       : {komputer.get_cpu().get_kecepatan_ghz()} GHz")
print(f"Socket          : {komputer.get_cpu().get_tipe_socket()}")
print(f"Konsumsi Daya   : {komputer.get_cpu().get_konsumsi_daya_watt()} Watt")
print("============================================")

print(f"RAM Terpasang   : {len(komputer.get_ram_list())} buah")
total_ram = 0
for i in range(len(komputer.get_ram_list())):
    print(f"RAM #{i+1}          : {komputer.get_ram_list()[i].get_merk()} {komputer.get_ram_list()[i].get_nama()}")
    print(f"Kapasitas       : {komputer.get_ram_list()[i].get_kapasitas_gb()} GB")
    print(f"Tipe            : {komputer.get_ram_list()[i].get_ddr()}")
    total_ram += komputer.get_ram_list()[i].get_kapasitas_gb()
print(f"Total RAM       : {total_ram} GB")
print("============================================")

print(f"Storage         : {komputer.get_harddrive().get_merk()} {komputer.get_harddrive().get_nama()}")
print(f"Kapasitas       : {komputer.get_harddrive().get_kapasitas_gb()} GB")
print(f"Tipe            : {komputer.get_harddrive().get_tipe_drive()}")
print(f"Kecepatan       : {komputer.get_harddrive().get_kecepatan_mbps()} MB/s")
print(f"Konsumsi Daya   : {komputer.get_harddrive().get_konsumsi_daya_watt()} Watt")
print("============================================")

print(f"GPU             : {komputer.get_gpu().get_merk()} {komputer.get_gpu().get_nama()}")
print(f"Model           : {komputer.get_gpu().get_gpu_model()}")
print(f"VRAM            : {komputer.get_gpu().get_vram_gb()} GB")
print(f"Konsumsi Daya   : {komputer.get_gpu().get_konsumsi_daya_watt()} Watt")
print("============================================")

total_daya = (komputer.get_cpu().get_konsumsi_daya_watt() + 
             komputer.get_harddrive().get_konsumsi_daya_watt() + 
             komputer.get_gpu().get_konsumsi_daya_watt())
             
print(f"Total Konsumsi Daya: {total_daya} Watt")
print("============================================")
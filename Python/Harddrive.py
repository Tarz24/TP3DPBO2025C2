from Komponen import Komponen
from ElektronikDevice import ElektronikDevice

class Harddrive(Komponen, ElektronikDevice):
    __kapasitas_gb = 0
    __tipe_drive = ""
    __kecepatan_mbps = 0

    def __init__(self, kapasitas_gb=0, tipe_drive="", kecepatan_mbps=0, merk="", nama="", konsumsi_daya_watt=0):
        Komponen.__init__(self, merk, nama)
        ElektronikDevice.__init__(self, konsumsi_daya_watt)  # Fixed bug here
        self.__kapasitas_gb = kapasitas_gb
        self.__tipe_drive = tipe_drive
        self.__kecepatan_mbps = kecepatan_mbps

    def set_kapasitas_gb(self, kapasitas_gb):
        self.__kapasitas_gb = kapasitas_gb

    def set_tipe_drive(self, tipe_drive):
        self.__tipe_drive = tipe_drive

    def set_kecepatan_mbps(self, kecepatan_mbps):
        self.__kecepatan_mbps = kecepatan_mbps

    def get_kapasitas_gb(self):
        return self.__kapasitas_gb
    
    def get_tipe_drive(self):
        return self.__tipe_drive
    
    def get_kecepatan_mbps(self):
        return self.__kecepatan_mbps
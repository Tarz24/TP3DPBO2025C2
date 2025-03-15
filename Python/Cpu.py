from Komponen import Komponen
from ElektronikDevice import ElektronikDevice

class Cpu(Komponen, ElektronikDevice):
    __jumlah_core = 0
    __kecepatan_ghz = 0.0
    __tipe_socket = ""

    def __init__(self, jumlah_core=0, kecepatan_ghz=0.0, tipe_socket="", merk="", nama="", konsumsi_daya_watt=0):
        Komponen.__init__(self, merk, nama)
        ElektronikDevice.__init__(self, konsumsi_daya_watt)
        self.__jumlah_core = jumlah_core
        self.__kecepatan_ghz = kecepatan_ghz
        self.__tipe_socket = tipe_socket

    def set_jumlah_core(self, jumlah_core):
        self.__jumlah_core = jumlah_core

    def set_kecepatan_ghz(self, kecepatan_ghz):
        self.__kecepatan_ghz = kecepatan_ghz

    def set_tipe_socket(self, tipe_socket):
        self.__tipe_socket = tipe_socket

    def get_jumlah_core(self):
        return self.__jumlah_core
    
    def get_kecepatan_ghz(self):
        return self.__kecepatan_ghz
    
    def get_tipe_socket(self):
        return self.__tipe_socket
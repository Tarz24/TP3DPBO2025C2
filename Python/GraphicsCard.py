from Komponen import Komponen
from ElektronikDevice import ElektronikDevice

class GraphicsCard(Komponen, ElektronikDevice):
    __vram_gb =  0
    __gpu_model = ""

    def __init__(self, vram_gb=0, gpu_model="", merk="", nama="", konsumsi_daya_watt=0):
        Komponen.__init__(self, merk, nama)
        ElektronikDevice.__init__(self, konsumsi_daya_watt)
        self.__vram_gb = vram_gb
        self.__gpu_model = gpu_model

    def set_vram_gb(self, vram_gb):
        self.__vram_gb = vram_gb

    def set_gpu_model(self, gpu_model):
        self.__gpu_model = gpu_model

    def get_vram_gb(self):
        return self.__vram_gb
    
    def get_gpu_model(self):
        return self.__gpu_model

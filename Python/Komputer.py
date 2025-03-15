from typing import List
from Cpu import Cpu
from Harddrive import Harddrive
from Ram import Ram
from GraphicsCard import GraphicsCard

class Komputer:
    def __init__(self, nama="", cpu=None, ram_list=None, hard_drive=None, gpu=None):
        self.__nama = nama
        self.__cpu = cpu if cpu is not None else None
        self.__ram_list = ram_list if ram_list is not None else []
        self.__hard_drive = hard_drive if hard_drive is not None else None
        self.__gpu = gpu if gpu is not None else None
    
    def set_nama(self, nama):
        self.__nama = nama
    
    def set_cpu(self, cpu):
        self.__cpu = cpu
    
    def set_ram(self, ram_list):
        self.__ram_list = ram_list
    
    def set_hard_drive(self, hard_drive):
        self.__hard_drive = hard_drive
    
    def set_gpu(self, gpu):
        self.__gpu = gpu
    
    def add_ram(self, ram):
        self.__ram_list.append(ram)
    
    def get_nama(self):
        return self.__nama
    
    def get_cpu(self):
        return self.__cpu
    
    def get_ram_list(self):
        return self.__ram_list
    
    def get_harddrive(self):
        return self.__hard_drive
    
    def get_gpu(self):
        return self.__gpu
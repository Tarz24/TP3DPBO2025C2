class ElektronikDevice:
    __konsumsi_daya_watt = 0

    def __init__(self, konsumsi_daya_watt=0):
        self.__konsumsi_daya_watt = konsumsi_daya_watt

    def set_konsumsi_daya_watt(self, konsumsi_daya_watt):
        self.__konsumsi_daya_watt = konsumsi_daya_watt
                
    def get_konsumsi_daya_watt(self):
        return self.__konsumsi_daya_watt
    
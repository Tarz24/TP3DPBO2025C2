#pragma once
#include <iostream>
#include <string>
#include "Komponen.cpp"
#include "ElektronikDevice.cpp"

using namespace std;

class Harddrive : public Komponen, public ElektronikDevice {
    private:
        int kapasitasGB;
        string tipeDrive;
        int kecepatanMBps;

    public:
        Harddrive(){

        }   
        
        Harddrive(int kapasitasGB, string tipeDrive, int kecepatanMBps, string merk, string nama, int konsumsiDayaWatt) : Komponen(merk, nama), ElektronikDevice(konsumsiDayaWatt) {
            this->kapasitasGB = kapasitasGB;
            this->tipeDrive = tipeDrive;
            this->kecepatanMBps = kecepatanMBps;
        }

        void setKapasitasGB(int kapasitasGB) {
            this->kapasitasGB = kapasitasGB;
        }

        void setTipeDrive(string tipeDrive) {
            this->tipeDrive = tipeDrive;
        }

        void setKecepatanMBps(int kecepatanMBps) {
            this->kecepatanMBps = kecepatanMBps;
        }

        int getKapasitasGB() {
            return this->kapasitasGB;
        }

        string getTipeDrive() {
            return this->tipeDrive;
        }

        int getKecepatanMBps() {
            return this->kecepatanMBps;
        }

        ~Harddrive(){

        }
};
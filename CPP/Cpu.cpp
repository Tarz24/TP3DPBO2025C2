#pragma once
#include <iostream>
#include <string>
#include "Komponen.cpp"
#include "ElektronikDevice.cpp"

using namespace std;

class Cpu : public Komponen, public ElektronikDevice {
    private:
        int jumlahCore;
        float kecepatanGHz;
        string tipeSocket;

    public:
        Cpu() {

        }

        Cpu(int jumlahCore, float kecepatanGHz, string tipeSocket, string merk, string nama, int konsumsiDayaWatt) : Komponen(merk, nama), ElektronikDevice(konsumsiDayaWatt) {
            this->jumlahCore = jumlahCore;
            this->kecepatanGHz = kecepatanGHz;
            this->tipeSocket = tipeSocket;
        }

        void setJumlahCore(int jumlahCore) {
            this->jumlahCore = jumlahCore;
        }

        void setKecepatanGHz(float kecepatanGHz) {
            this->kecepatanGHz = kecepatanGHz;
        }

        void setTipeSocket(string tipeSocket) {
            this->tipeSocket = tipeSocket;
        }

        int getJumlahCore() const {
            return this->jumlahCore;
        }

        float getKecepatanGHz() const {
            return this->kecepatanGHz;
        }

        string getTipeSocket() {
            return this->tipeSocket;
        }

        ~Cpu() {

        }
};
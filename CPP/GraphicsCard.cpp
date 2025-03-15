#pragma once
#include <iostream>
#include <string>
#include "Komponen.cpp"
#include "ElektronikDevice.cpp"

using namespace std;

class GraphicsCard : public Komponen, public ElektronikDevice {
    private:
        int vRamGB;
        string gpuModel;

    public:
        GraphicsCard() {

        }

        GraphicsCard(int vRamGB, string gpuModel, string merk, string nama, int konsumsiDayaWatt) : Komponen(merk, nama), ElektronikDevice(konsumsiDayaWatt) {
            this->vRamGB = vRamGB;
            this->gpuModel = gpuModel;
        }

        void setVRamGB(int vRamGB) {
            this->vRamGB = vRamGB;
        }

        void setGpuModel(string gpuModel) {
            this->gpuModel = gpuModel;
        }

        int getVRamGB() const {
            return vRamGB;
        }

        string getGpuModel() const {
            return gpuModel;
        }

        ~GraphicsCard() {
        }

};
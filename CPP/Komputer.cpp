#include <iostream>
#include <string>
#include <vector>
#include "Cpu.cpp"
#include "Harddrive.cpp"
#include "Ram.cpp"
#include "GraphicsCard.cpp"

using namespace std;

class Komputer {
    private:
        string nama;
        Cpu cpu;
        vector<Ram> ramList;
        Harddrive hardDrive;
        GraphicsCard gpu;
        
    public:
        Komputer(){
        }

        Komputer(string nama, Cpu cpu, vector<Ram> ramList, Harddrive hardDrive, GraphicsCard gpu) {
            this->nama = nama;
            this->cpu = cpu;
            this->ramList = ramList;
            this->hardDrive = hardDrive;
            this->gpu = gpu;
        }

        void setNama(string nama) {
            this->nama = nama;
        }

        void setCpu(Cpu cpu) {
            this->cpu = cpu;
        }

        void setRam(vector<Ram> ramList) {
            this->ramList = ramList;
        }

        void setHardDrive(Harddrive hardDrive) {
            this->hardDrive = hardDrive;
        }

        void setGpu(GraphicsCard gpu) {
            this->gpu = gpu;
        }

        void addRam(Ram ram) {
            this->ramList.push_back(ram);
        }

        string getNama() {
            return this->nama;
        }

        Cpu getCpu() {
            return this->cpu;
        }

        vector<Ram> getRamList() {
            return this->ramList;
        }

        Harddrive getHarddrive() {
            return this->hardDrive;
        }

        GraphicsCard getGpu() {
            return this->gpu;
        }

        ~Komputer() {

        }
};
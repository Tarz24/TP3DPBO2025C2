#pragma once
#include <iostream>

using namespace std;

class ElektronikDevice {
    private:
        int konsumsiDayaWatt;

    public:
        ElektronikDevice() {

        }

        ElektronikDevice(int konsumsiDayaWatt) {
            this->konsumsiDayaWatt = konsumsiDayaWatt;
        }

        void setKonsumsiDayaWatt(int konsumsiDataWatt) {
            this->konsumsiDayaWatt = konsumsiDataWatt;
        }

        int getKonsumsiDayaWatt() const {
            return konsumsiDayaWatt;
        }

        ~ElektronikDevice() {

        }
};

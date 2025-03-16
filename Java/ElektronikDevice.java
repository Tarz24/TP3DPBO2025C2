public class ElektronikDevice {
    private int konsumsiDayaWatt;

    public ElektronikDevice(){
        this.konsumsiDayaWatt = 0;
    }

    public ElektronikDevice(int konsumsiDayaWatt) {
        this.konsumsiDayaWatt = konsumsiDayaWatt;
    }

    public void setKonsumsiDayaWatt(int konsumsiDayaWatt) {
        this.konsumsiDayaWatt = konsumsiDayaWatt;
    }

    public int getKonsumsiDayaWatt() {
        return konsumsiDayaWatt;
    }
}
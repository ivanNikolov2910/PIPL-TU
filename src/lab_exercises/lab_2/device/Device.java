package lab_exercises.lab_2.device;

public class Device {
    private int vIn;
    private String cpu;
    private boolean powerState;

    public void turnOnOff(){
        this.powerState = !this.powerState;
    }

    public Device(int vIn, String cpu) {
        this.vIn = vIn;
        this.cpu = cpu;
    }

    public int getvIn() {
        return vIn;
    }

    public void setvIn(int vIn) {
        this.vIn = vIn;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
}

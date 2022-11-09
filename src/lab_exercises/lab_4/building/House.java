package lab_exercises.lab_4.building;

import lab_exercises.lab_3.hospital.Patient;

import java.util.regex.Pattern;

public class House extends Building{
    private int cntFloor;
    private String owner;


    public House(int height, double area, String address, int cntFloor, String owner) throws MetricException, NamePatternException {
        super(height, area, address);
        this.setCntFloor(cntFloor);
        this.setOwner(owner);
    }

    public int getCntFloor() {
        return cntFloor;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) throws NamePatternException {
        if (owner.matches("[A-Z][a-z][a-z]+\\s+[A-Z][a-z][a-z]+")){
            this.owner = owner;
        }else {
            throw new NamePatternException();
        }
    }

    private void setCntFloor(int cntFloor) throws MetricException {
        if (cntFloor < 1) {
            throw new MetricException("floors should be at least one");
        }else {
            this.cntFloor = cntFloor;
        }
    }

    @Override
    public String toString() {
        return "House: " +
                "floors=" + cntFloor +
                ", owner=" + owner + super.toString();
    }
    
    public static House takeLargestHouse(House[] houses)throws NullPointerException{
        House temp = null;
        double maxAvrHigh = 0;
        for (House house : houses) {
            if (house == null){
                throw new NullPointerException("the house is null");
            }
            double avrHigh = (double) house.getHeight()/house.getCntFloor();
            if (avrHigh > maxAvrHigh){
                maxAvrHigh = avrHigh;
                temp = house;
            }
        }
        return temp;
    }
}

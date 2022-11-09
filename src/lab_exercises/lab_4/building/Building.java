package lab_exercises.lab_4.building;

public abstract class Building {
    private int height;
    private double area;
    private String address;

    public Building(int height, double area, String address) throws MetricException {
        this.setArea(area);
        this.setHeight(height);
        this.address = address;
    }

    private void setHeight(int height) throws MetricException {
        if(height < 1){
            throw new MetricException("Height can not be less than 2");
        }else this.height = height;
    }

    private void setArea(double area) throws MetricException {
        if(area < 1){
            throw new MetricException("Height can not be less than 2");
        }else this.area = area;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    public int getHeight() {
        return height;
    }

    public double getArea() {
        return area;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return ", " +
                "height=" + height +
                ", area=" + area +
                ", address=" + address;
    }
}

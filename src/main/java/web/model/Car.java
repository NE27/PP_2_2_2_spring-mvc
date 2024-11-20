package web.model;

public class Car {

    private String color;
    private String make;
    private int year;

    public Car(String color, String make, int year) {
        this.color = color;
        this.make = make;
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

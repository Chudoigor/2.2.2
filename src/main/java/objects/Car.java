package objects;


public class Car {
    private String brand;
    private int series;
    private int number;

    public Car(String brand, int series, int number) {
        this.brand = brand;
        this.series = series;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{" +
               "brand='" + brand + '\'' +
               ", series=" + series +
               ", number=" + number +
               '}';
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public int getSeries() {
        return series;
    }

    public int getNumber() {
        return number;
    }

}


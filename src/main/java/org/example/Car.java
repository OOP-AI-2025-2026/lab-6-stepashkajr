package org.example;

class Car implements Comparable {

    private int price;
    private int year;        // рік виготовлення
    private int horsePower;  // кінські сили

    // Конструктор з трьома аргументами
    public Car(int price, int year, int horsePower) {
        this.price = price;
        this.year = year;
        this.horsePower = horsePower;
    }

    // Гетери
    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    // Сетери
    public void setPrice(int price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    // Реалізація compareTo
    @Override
    public int compareTo(Object obj) {
        Car other = (Car) obj;

        // 1) Менша ціна = "більше"
        if (this.price < other.price) return 1;
        if (this.price > other.price) return -1;

        // 2) Новіший автомобіль = "більше" (рік більший)
        if (this.year > other.year) return 1;
        if (this.year < other.year) return -1;

        // 3) Більше кінських сил = "більше"
        if (this.horsePower > other.horsePower) return 1;
        if (this.horsePower < other.horsePower) return -1;

        return 0;
    }

    @Override
    public String toString() {
        return "Машина{ціна=" + price + ", рік=" + year + ", кількість кінських сил=" + horsePower + "}";
    }
}

package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Перше завдання:");
        Dog dog = new Dog("Чапа");
        Cat cat = new Cat("Марлік");

        System.out.println(dog.getName() + " каже: " + dog.makeSound());
        System.out.println(cat.getName() + " каже: " + cat.makeSound());
        System.out.println();


        System.out.println("Друге завдання:");
        Point p = new Point(3.0, 5.0);
        System.out.println("Початкова позиція: (" + p.getX() + ", " + p.getY() + ")");

        p.moveTo(10.0, 12.5);
        System.out.println();


        System.out.println("Третє завдання:");
        Smartphone phone = new Smartphone("Samsung Galaxy A54", 50.4501, 30.5234);

        phone.makeCall();
        phone.receiveCall();

        double[] coords = phone.getCoordinates();
        System.out.println("Поточні координати: Широта " + coords[0] + ", Довгота " + coords[1]);
        System.out.println();


        System.out.println("Четверте завдання:");
        Car[] cars = {
                new Car(20000, 2019, 150),
                new Car(18000, 2020, 140),
                new Car(20000, 2019, 180),
                new Car(25000, 2021, 200)
        };

        System.out.println("Перед сортуванням:");
        for (Car c : cars) {
            System.out.println(c);
        }

        // Викликаємо власний метод сортування (він оголошений нижче в тому ж класі)
        sortCars(cars);

        System.out.println("\nПісля сортування:");
        for (Car c : cars) {
            System.out.println(c);
        }
    }
    private static void sortCars(Car[] cars) {
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                // Порівнюємо через наш compareTo
                // Якщо cars[i] "менше" за cars[j] за нашою логікою (тобто має йти після),
                // то ми міняємо їх місцями — умова (compareTo < 0) означає "i менше j"
                if (cars[i].compareTo(cars[j]) < 0) {
                    Car temp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = temp;
                }
            }
        }
    }
}

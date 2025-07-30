public class Car {
    String name; // Название автомобиля
    int speed; // Скорость автомобиля

    Car(String name, int speed) { // конструктор машин
        this.name = name;
        this.speed = speed;
    }

    public String getName() { // возвращаем название автомобиля
        return name;
    }
    public int getSpeed () { // возвращаем скорость автомобиля
        return speed;
    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Race race = new Race(); // создание объекта Гонка

        for (int i = 1; i <= 3; i++) { //цикл для трех машин
            String name;
            int speed;

            // Ввод названия машины
            while (true) { //создаем бесконечный цикл

                System.out.println("- Введите название машины №" + i);
                name = scanner.nextLine();
                if (name.isEmpty()) { // проверка на пустую строку
                    System.out.println("Название автомобиля не может быть пустым!");
                } else {
                    break;
                }
            }
            //Ввод скорости машины
            while (true) {
                System.out.println("- Введите скорость машины №" + i + ". Скорость составляет от 1 до 250 км/ч.");
                try {
                    String input = scanner.nextLine();
                if (input.isEmpty()) {  // проверка на пустую строку
                    System.out.println("Ввод не может быть пустым. Введите скорость автомобиля.");
                    continue;
                }
                    speed = Integer.parseInt(input);
                    if (speed >= 0 && speed <= 250) {
                        break;
                    } else {
                        System.out.println("Неправильная скорость.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Неккоректный ввод данных.Введите скорость автомобиля.");
                }

            }
        Car car = new Car(name, speed); // создание объекта Машина
        race.newLeader(car); // запускаем метод для определения лидера
        }
        System.out.println("Самая быстрая машина: " + race.getRaceLeader());
    }
}

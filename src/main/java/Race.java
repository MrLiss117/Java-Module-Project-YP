public class Race {
    String raceLeader = ""; // автомобиль-лидер
    int wayLeader = 0; // дистанция, которую прошел лидер

    public void newLeader(Car car) {  // выявление лидера гонки
        int time = 24; // время Ле-Мана
        int wayNewCar = time * car.getSpeed();
        if (wayNewCar > this.wayLeader) {
            this.raceLeader = car.getName();
            this.wayLeader = wayNewCar;
        }

    }

    public String getRaceLeader() {
        return raceLeader;
    }
}

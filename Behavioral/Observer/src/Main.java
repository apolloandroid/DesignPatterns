import observable.WeatherStation;
import observer.Man;
import observer.OldMan;

public class Main {

    public static void main(String[] args) {
        WeatherStation station = createStation();
        station.changeWeather(30);
        station.changeWeather(20);
        station.changeWeather(25);
        station.changeWeather(40);
        station.changeWeather(26);
    }

    private static WeatherStation createStation() {
        WeatherStation station = new WeatherStation();
        station.addObserver(new Man("Yury"));
        station.addObserver(new Man("Alexander"));
        station.addObserver(new OldMan("Ivan Ivanovich"));
        station.addObserver(new Man("Vova"));
        return station;
    }
}

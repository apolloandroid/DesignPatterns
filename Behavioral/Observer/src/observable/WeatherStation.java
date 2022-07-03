package observable;


import observer.Observer;

public class WeatherStation extends Observable<Integer> {

    private int degrees = 0;

    @Override
    public void notifyObservers() {
        observers.forEach((Observer<Integer> observer) -> {
            observer.onValueChanged(degrees);
        });
    }

    public void changeWeather(int degrees) {
        this.degrees = degrees;
        notifyObservers();
    }
}

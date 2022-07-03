package observable;

import observer.Observer;

import java.util.LinkedList;
import java.util.List;

abstract class Observable<T> {
    protected List<Observer<T>> observers = new LinkedList<Observer<T>>();

    public abstract void notifyObservers();

    public void addObserver(Observer<T> observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer<T> observer) {
        observers.remove(observer);
    }

    public void removeObserver() {
        observers.clear();
    }
}

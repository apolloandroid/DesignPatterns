package observer;

public interface Observer<T> {

    public void onValueChanged(T newValue);
}

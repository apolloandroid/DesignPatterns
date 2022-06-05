package application;

public class AndroidApplication implements Application {
    public static final String applicationType = "Android";

    @Override
    public void install() {
        System.out.println("Android приложение запущено!");
    }

    @Override
    public void run() {
        System.out.println("Поздравляем, Android приложение успешно установлено!");
    }
}

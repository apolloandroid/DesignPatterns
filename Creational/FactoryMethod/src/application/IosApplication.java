package application;

public class IosApplication implements Application {
    public static final String applicationType= "IOS";

    @Override
    public void install() {
        System.out.println("IOS приложение запущено!");
    }

    @Override
    public void run() {
        System.out.println("Поздравляем, IOS приложение успешно установлено!");
    }
}
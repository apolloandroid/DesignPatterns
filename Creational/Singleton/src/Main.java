import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static String value = "I am only one";
    private static String anotherValue = "There is another one";

    public static void main(String[] args) throws IOException {
        System.out.println("Non Thread Safe Singleton Implementation");
        nonSafeSingletonTest();

        System.out.println("Thread Safe Singleton Implementation");
        safeSingletonTest(new ThreadOne());
        safeSingletonTest(new ThreadTwo());
    }

    private static String getValueFromInput() throws IOException {
        String value;
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        value = bufferedReader.readLine();
        return value;
    }

    private static void nonSafeSingletonTest() throws IOException {
        NonThreadSafeSingleton instance1 = NonThreadSafeSingleton.getInstance(value);
        NonThreadSafeSingleton instance2 = NonThreadSafeSingleton.getInstance(anotherValue);
        System.out.println(instance1.getValue());
        System.out.println(instance2.getValue());
    }

    private static void safeSingletonTest(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.start();
    }

    static class ThreadOne implements Runnable {
        @Override
        public void run() {
            ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance(value);
            System.out.println(threadSafeSingleton.getValue());
        }
    }

    static class ThreadTwo implements Runnable {
        @Override
        public void run() {
            ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance(anotherValue);
            System.out.println(threadSafeSingleton.getValue());
        }
    }
}

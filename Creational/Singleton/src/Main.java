import java.io.IOException;

public class Main {
    private static String value = "I am only one";
    private static String anotherValue = "There is another one";

    public static void main(String[] args) throws IOException {
        System.out.println("Non Thread Safe Singleton Implementation");
        testNonThreadSafeSingleton();

        System.out.println("Thread Safe Singleton Implementation");
        testThreadSafeSingleton(new ThreadOne());
        testThreadSafeSingleton(new ThreadTwo());
    }

    private static void testNonThreadSafeSingleton() throws IOException {
        NonThreadSafeSingleton instanceOne = NonThreadSafeSingleton.getInstance(value);
        NonThreadSafeSingleton instanceTwo = NonThreadSafeSingleton.getInstance(anotherValue);
        System.out.println(instanceOne.getValue());
        System.out.println(instanceTwo.getValue());
    }

    private static void testThreadSafeSingleton(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.start();
    }

    private static class ThreadOne implements Runnable {
        @Override
        public void run() {
            ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance(value);
            System.out.println(threadSafeSingleton.getValue());
        }
    }

    private static class ThreadTwo implements Runnable {
        @Override
        public void run() {
            ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance(anotherValue);
            System.out.println(threadSafeSingleton.getValue());
        }
    }
}

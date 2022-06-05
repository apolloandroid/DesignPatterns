public final class ThreadSafeSingleton {
    private String value;
    private static volatile ThreadSafeSingleton instance;

    private ThreadSafeSingleton(String value) {
        this.value = value;
    }

    public static ThreadSafeSingleton getInstance(String value) {
        ThreadSafeSingleton result = instance;
        if (instance != null) return result;
        synchronized (ThreadSafeSingleton.class) {
            if (instance == null) instance = new ThreadSafeSingleton(value);
            return instance;
        }
    }

    public String getValue() {
        return value;
    }
}

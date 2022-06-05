public final class NonThreadSafeSingleton {
    private static NonThreadSafeSingleton instance;
    private String value;

    private NonThreadSafeSingleton(String value) {
        this.value = value;
    }

    public static NonThreadSafeSingleton getInstance(String value) {
        if (instance == null) instance = new NonThreadSafeSingleton(value);
        return instance;
    }

    public String getValue() {
        return value;
    }
}

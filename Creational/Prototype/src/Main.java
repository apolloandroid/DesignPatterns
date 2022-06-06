public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alex", 25, "Male", "Programmer");
        System.out.println("person: " + person);
        Person copy = person.copy();
        System.out.println("copy: " + copy);
    }
}

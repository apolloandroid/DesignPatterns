
public class Person implements Copyable<Person> {
    private String name;
    private int age;
    private String gender;
    private String job;


    public Person(String name, int age, String gender, String job) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.job = job;
    }

    @Override
    public Person copy() {
        return new Person(
                this.name,
                this.age,
                this.gender,
                this.job
        );
    }

    @Override
    public String toString() {
        return "name = " + name + "; " +
                "age = " + age + "; " +
                "gender = " + gender + "; " +
                "job = " + job;
    }
}

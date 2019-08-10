package pl.sdacademy.javapo19programowanie1.books.User;

public class User {
    private String name;
    private Gender gender;
    private int age;
    private Long balance;

    public User(String name, Gender gender, String balance, int age) {
    this.name = name;
    this.gender = gender;
    this.age = age;
    this.balance = Long.valueOf(balance
            .replace("$","")
            .replace(".","")
            .replace(",",""));

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", balance=" + balance +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}
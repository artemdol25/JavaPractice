package Task1;

public class TestDog {

    public static void main(String[] args) {

        Dog bob = new Dog("Bob", 6);
        Dog mike = new Dog("Mike");
        Dog sharik = new Dog(5);
        Dog booblik = new Dog();

        mike.setAge(8);

        sharik.setName("Sharik");

        booblik.setName("Booblik");
        booblik.setAge(3);

        System.out.println(bob);
        System.out.println(mike);
        System.out.println(sharik);
        System.out.println(booblik);

        bob.intoHumanAge();
        mike.intoHumanAge();
        sharik.intoHumanAge();
        booblik.intoHumanAge();
    }
}
import ex4.*;

public class Main {
    public static void main(String[] args){
        Animal animal = new Animal("オリジナル動物");
        animal.makeSound();

        //演習4.3
        Cat cat = new Cat("ポチ");
        cat.makeSound();

        //演習4.4
        Dog dog = new Dog("猫");
        dog.makeSound();
        dog.swim();
    }
}

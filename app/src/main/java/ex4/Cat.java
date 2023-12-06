package ex4;

public class Cat extends Animal {
    public Cat(String _name){
        super(_name);
    }

    @Override
    public void makeSound(){
        System.out.println("にゃー");
    }
}

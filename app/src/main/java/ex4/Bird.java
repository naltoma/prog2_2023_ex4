package ex4;

public class Bird extends Animal implements Flyable {
    public Bird(String _name){
        super(_name);
    }

    @Override
    public void makeSound(){
        System.out.println(getName() + "がチュンチュンと鳴いた");
    }

    @Override
    public void fly(){
        System.out.println(getName() + "がぱたぱたと飛んでいる");
    }
}

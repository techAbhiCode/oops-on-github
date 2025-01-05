
public class inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        Dog tomee = new Dog();
        tomee.walk();
        tomee.color = "White";
        System.out.println(tomee.color);

        Mammals a  = new Mammals();
        a.color = "Brown";
        System.out.println(a.color);
        a.walk();
        a.eat();

        birds b = new birds();
        b.color = "black";
        System.out.println(b.color);
        b.fly();
    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}
//derived class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims under Water");
    }
}
class Mammals extends Animal{
    void walk(){
        System.out.println("Walks");
    }
}
class birds extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}
class Dog extends Mammals{
    String Breed;
}
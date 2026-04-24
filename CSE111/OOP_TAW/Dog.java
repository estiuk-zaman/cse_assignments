public class Dog extends Animal
{
    public String color;
    public Dog(String nm, String clr){
        super(nm);
        color = clr;
    }
    public void eat(){
        //super.eat();
        System.out.println(name + " is eating meat");
        super.eat();
    }
    public void bark(){
        System.out.println(color + " " + name + " is barking");
    }
}
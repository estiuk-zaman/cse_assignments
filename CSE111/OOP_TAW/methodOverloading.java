public class methodOverloading {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name="Bob";
        d1.bark();
        d1.eat("Bread");
        d1.eat("Bread",3);
        d1.eat("Bread",3,"Biscuit");
    }
}

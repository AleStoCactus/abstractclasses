public class Cat extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Meow");
        Cat gatto = new Cat();
        gatto.makeNoise();
    }
}

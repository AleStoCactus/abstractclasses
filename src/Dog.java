public class Dog extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Wof");
        Dog dog= new Dog();
        dog.makeNoise();
    }
}

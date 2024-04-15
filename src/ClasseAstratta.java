public class ClasseAstratta {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to the example for abstract classes!");
        System.out.println("\nI versi degli animali:");
        Cat Gatto = new Cat();
        Gatto.makeNoise();
        Dog Cane = new Dog();
        Cane.makeNoise();
        GatoESPECIAL gatoesp = new GatoESPECIAL();
        gatoesp.makeNoise();
        PanzerSelbstfahrlafetteIfür Panzer = new PanzerSelbstfahrlafetteIfür();
        Panzer.makeNoise();

        System.out.println("\nI movimenti degli animali:");

        Gatto.Movement();
        Cane.Movement();
        gatoesp.Movement();
        Panzer.Movement();

        System.out.println("\nI colori degli animali:");

        Gatto.Color();
        Cane.Color();
        gatoesp.Color();
        Panzer.Color();

        Gatto.age = 8;
        Cane.age = 3;
        gatoesp.age = 17;
        Panzer.age = 234;

        Gatto.name = "Cecio";
        Cane.name = "Kira";
        gatoesp.name = "EL GATITO";
        Panzer.name = "PanzerSelbstfahrlafetteIfür";
    }
}
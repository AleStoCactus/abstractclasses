public class ClasseAstratta {
    public static void main(String[] args) {
        for (int i = 1; i<=4; i++) {
            if (i==1) {
                Dog cane = new Dog();
                cane.makeNoise();
            }
            if (i==2) {
                Cat gatto = new Cat();
                gatto.makeNoise();
            }
            if (i==3) {
                GatoESPECIAL gato = new GatoESPECIAL();
                gato.makeNoise();
            }
            if (i==4) {
                PanzerSelbstfahrlafetteIfür panzer = new PanzerSelbstfahrlafetteIfür();
                panzer.makeNoise();
            }
        }
    }
}
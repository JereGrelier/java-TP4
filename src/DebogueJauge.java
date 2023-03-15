public class DebogueJauge {

    DebogueJauge() {
    }

    private void testDansInterval() {
        Jauge jauge = new Jauge(200, 100);
        System.out.println("ATTENDU : jauge.estVert()");
        if (jauge.estRouge() && jauge.estVert()) {
            System.out.println("KO : jauge.estRouge() && jauge.estVert()");
            return;
        }
        if (jauge.estVert()) {
            System.out.println("OK : jauge.estVert()");
            return;
        }
        if (jauge.estRouge()) {
            System.out.println("KO : jauge.estRouge()");
            return;
        }
    }

    public void testHorsInterval() {
        Jauge jauge = new Jauge(100, 200);
        System.out.println("ATTENDU : jauge.estRouge()");
        if (jauge.estRouge() && jauge.estVert()) {
            System.out.println("KO : jauge.estRouge() && jauge.estVert()");
            return;
        }
        if (jauge.estVert()) {
            System.out.println("KO : jauge.estVert()");
            return;
        }
        if (jauge.estRouge()) {
            System.out.println("OK : jauge.estRouge()");
            return;
        }
    }

    public void testIncrement() {
        Jauge jauge = new Jauge(200, 199);
        System.out.println("ATTENDU : jauge.estRouge()");
        jauge.incrementer();
        if (jauge.estRouge() && jauge.estVert()) {
            System.out.println("KO : jauge.estRouge() && jauge.estVert()");
            return;
        }
        if (jauge.estVert()) {
            System.out.println("KO : jauge.estVert()");
            return;
        }
        if (jauge.estRouge()) {
            System.out.println("OK : jauge.estRouge()");
            return;
        }
        System.out.println("KO : Ni jauge.estRouge(), ni jauge.estVert()");
    }

    public void testDecrement() {
        Jauge jauge = new Jauge(200, 200);
        System.out.println("ATTENDU : jauge.estVert()");
        jauge.decrementer();
        if (jauge.estRouge() && jauge.estVert()) {
            System.out.println("KO : jauge.estRouge() && jauge.estVert()");
            return;
        }
        if (jauge.estVert()) {
            System.out.println("OK : jauge.estVert()");
            return;
        }
        if (jauge.estRouge()) {
            System.out.println("KO : jauge.estRouge()");
            return;
        }
        System.out.println("KO : Ni jauge.estRouge(), ni jauge.estVert()");
    }

    public static void main(String[] args) {
        DebogueJauge debogueJauge = new DebogueJauge();
        System.out.println("\nTest de la classe Jauge dans l'interval avec valeur dans l'interval");
        debogueJauge.testDansInterval();
        System.out.println("\nTest de la classe Jauge dans l'interval avec valeur hors interval");
        debogueJauge.testHorsInterval();
        System.out.println("\nTest de la classe Jauge avec incrementation");
        debogueJauge.testIncrement();
        System.out.println("\nTest de la classe Jauge avec decrementation");
        debogueJauge.testDecrement();
    }
}

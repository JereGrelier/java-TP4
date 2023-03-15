package tec;
public class DeboguePosition {
    private void testUltime() {
        System.out.println("*Test ultime*");
        Position p = new Position();
        int incoherence = 0;
        String message1 = "";
        String message2 = "";

        if(p.estDehors() == true && p.estInterieur() == true) {
            incoherence++;
            message1 += "Est dehors et à l'intérieur à l'état initial";
        } else if(p.estDehors() == false && p.estInterieur() == true) {
            incoherence++;
            message1 += "A l'interieur à l'état initial";
        } else if(p.estDehors() == false && p.estInterieur() == false) {
            incoherence++;
            message1 += "N'est ni à l'intéreur ni dehors à l'état initial";
        }

        if(p.estAssis() == true && p.estDebout() == true) {
            incoherence++;
            message2 += "Est debout et assis à l'état initial";
        } else if(p.estAssis() == false && p.estDebout() == false) {
            incoherence++;
            message2 += "Est ni debout ni assis à l'état initial";
        }

        if (incoherence == 0) {
            System.out.println("OK");
        } else {
            System.out.println(incoherence + " KO: " + message1 + message2);
        }
    }

    private void testDehorsInitial() {
        System.out.println("*Test dehors initial*");
        Position p = new Position();

        if(p.estDehors() == true && p.estInterieur() == true) {
            System.out.println("KO: Est dehors et à l'intérieur à l'état initial");
        } else if(p.estDehors() == false && p.estInterieur() == true) {
            System.out.println("KO: A l'interieur à l'état initial");
        } else if(p.estDehors() == false && p.estInterieur() == false) {
            System.out.println("KO: N'est ni à l'intéreur ni dehors à l'état initial");
        } else {
            System.out.println("OK");
        }
    }

    private void testDehorsA() {
        System.out.println("*Test dehors assis*");
        Position p = new Position();
        p.assis();

        if(p.estAssis() == true && p.estDehors() == true) {
            System.out.println("OK");
        } else if(p.estAssis() == true && p.estDehors() == false) {
            System.out.println("KO: Dehors passe à false");
        } else if(p.estAssis() == false && p.estDehors() == true) {
            System.out.println("KO: Aucun changement pour assis");
        } else if(p.estAssis() == false && p.estDehors() == false) {
            System.out.println("KO: Aucun changement pour assis et dehors passe à false");
        }
    }

    private void testDehorsD() {
        System.out.println("*Test dehors debout*");
        Position p = new Position();
        p.debout();

        if(p.estDebout() == true && p.estDehors() == true) {
            System.out.println("OK");
        } else if(p.estDebout() == true && p.estDehors() == false) {
            System.out.println("KO: Dehors passe à false");
        } else if(p.estDebout() == false && p.estDehors() == true) {
            System.out.println("KO: Aucun changement pour debout");
        } else if(p.estDebout() == false && p.estDehors() == false) {
            System.out.println("KO: Aucun changement pour debout et dehors passe à false");
        }
    }

    private void testDehorsAD() {
        System.out.println("*Test assis dehors*");
        Position p = new Position();
        p.assis();
        p.dehors();

        if(p.estAssis() == true && p.estDehors() == true) {
            System.out.println("OK");
        } else if(p.estAssis() == true && p.estDehors() == false) {
            System.out.println("KO: Dehors passe à false");
        } else if(p.estAssis() == false && p.estDehors() == true) {
            System.out.println("KO: Aucun changement pour assis");
        } else if(p.estAssis() == false && p.estDehors() == false) {
            System.out.println("KO: Aucun changement pour assis et dehors passe à false");
        }
    }

    public static void main(String[] args) {
        new DeboguePosition().testDehorsInitial();
        System.out.println("__________________");
        new DeboguePosition().testDehorsA();
        System.out.println("__________________");
        new DeboguePosition().testDehorsD();
        System.out.println("__________________");
        new DeboguePosition().testDehorsAD();
        System.out.println("__________________");
    }
}
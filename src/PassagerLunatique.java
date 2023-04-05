package tec;

public class PassagerLunatique extends PassagerStandard {

    public PassagerLunatique(String nom, int destination) {
        super(nom, destination); // call to super class constructor
    }
    // A la montée, même code que PassagerStandard

    public void nouvelArret(Autobus t, int numeroArret) {
        super.nouvelArret(t, numeroArret);
        if (this.estAssis()) {
            t.arretDemanderDebout(this);
        } else if (this.estDebout()) {
            t.arretDemanderAssis(this);
        }
    }

}
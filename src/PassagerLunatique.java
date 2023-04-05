package tec;

public class PassagerLunatique extends PassagerStandard {

    int destination;
    String name;
    Position position;

    public PassagerLunatique(String nom, int destination) {
        super(nom, destination); // call to super class constructor
    }
    // A la montée, même code que PassagerStandard

    public void nouvelArret(Autobus t, int numeroArret) {
        if (numeroArret >= this.destination) { // >= sinon on change de place alors qu'on est dehors
            t.arretDemanderSortie(this);
        } else if (this.estAssis()) {
            t.arretDemanderDebout(this);
        } else if (this.estDebout()) {
            t.arretDemanderAssis(this);
        }
    }

}
package tec;

class PassagerLunatique extends PassagerStandard {

    int destination;
    String name;

    PassagerLunatique(String nom, int destination) {
        super(nom, destination);
    }

    public void nouvelArret(Autobus t, int numeroArret) {
        if (numeroArret == this.destination) {
          t.arretDemanderSortie(this);
        }
        else if(this.estAssis()) {
            t.arretDemanderDebout(this);
        }
        else if(this.estDebout()) {
            t.arretDemanderAssis(this);
        }
    }

}
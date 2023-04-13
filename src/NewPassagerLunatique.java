package tec;

import tec.Autobus;
import tec.PassagerAbstrait;

public class NewPassagerLunatique extends PassagerAbstrait {

    public NewPassagerLunatique(String nom, int destination) {
        super(nom, destination); // call to super class constructor
    }

    public void monterDans(Autobus t) {
        if (t.aPlaceAssise()) {
            t.monteeDemanderAssis(this);
        } else if (t.aPlaceDebout()) {
            t.monteeDemanderDebout(this);
        }
    }

    protected void faireChoixArret(Autobus t, int arret) {
        if (aAvantDestination(0, arret)) {
            t.arretDemanderSortie(this);
        }
        if (this.estAssis()) {
            t.arretDemanderDebout(this);
        } else if (this.estDebout()) {
            t.arretDemanderAssis(this);
        }
    }
}
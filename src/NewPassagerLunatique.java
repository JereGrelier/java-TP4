package tec;

import tec.Autobus;
import tec.MonterDansStandard;
import tec.PassagerAbstrait;

public class NewPassagerLunatique extends MonterDansStandard {

    public NewPassagerLunatique(String nom, int destination) {
        super(nom, destination); // call to super class constructor
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
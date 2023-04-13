package tec;

//source without documentation for javadoc

public class NewPassagerAnxieux extends PassagerAbstrait {

  // constructor
  public NewPassagerAnxieux(String nom, int destination) {
    super(nom, destination);
  }

  // methods
  public void monterDans(Autobus t) {
    if (t.aPlaceDebout()) {
      t.monteeDemanderDebout(this);
    }
  }

  public void faireChoixArret(Autobus t, int arret) {
    if (aAvantDestination(1, arret)) {
      t.arretDemanderSortie(this);
    }
  }
}
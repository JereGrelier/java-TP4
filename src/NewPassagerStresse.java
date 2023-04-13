
package tec;

//source without documentation for javadoc
import tec.PassagerAbstrait;
import tec.Autobus;

public class NewPassagerStresse extends PassagerAbstrait {

  // constructor
  public NewPassagerStresse(String nom, int destination) {
    super(nom, destination);
  }

  public void monterDans(Autobus t) {
    if (t.aPlaceAssise()) {
      t.monteeDemanderAssis(this); // 'this' is a PassagerStandard
    }
  }

  public void faireChoixArret(Autobus t, int numeroArret) {
    if (aAvantDestination(3, numeroArret)) {
      t.arretDemanderDebout(this);
    } else if (aAvantDestination(0, numeroArret)) {
      t.arretDemanderSortie(this);
    }
  }
}
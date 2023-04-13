
package tec;

//source without documentation for javadoc
import tec.MonterDansStandard;
import tec.Autobus;

public class NewPassagerStandard extends MonterDansStandard {

  // constructor
  public NewPassagerStandard(String nom, int destination) {
    super(nom, destination);

  }

  // methods

  public void faireChoixArret(Autobus t, int numeroArret) {
    if (aAvantDestination(0, numeroArret)) {
      t.arretDemanderSortie(this);
    }
  }
}
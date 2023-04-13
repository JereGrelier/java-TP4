
package tec;

//source without documentation for javadoc

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
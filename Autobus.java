

import java.util.ArrayList;

//source without documentation for javadoc

class Autobus {

  //attributes
  private int numeroArret;
  private Jauge assis;
  private Jauge debout;
  private ArrayList<PassagerStandard> passagers;

  // constructor
  public Autobus(int nbPlaceAssise, int nbPlaceDebout) {
    assis = new Jauge(nbPlaceAssise, 0);
    debout = new Jauge(nbPlaceDebout, 0);
    numeroArret = 0;
    passagers = new ArrayList<PassagerStandard>();
  }

  //methods
  public boolean aPlaceAssise() {
    return assis.estVert();
  }

  public boolean aPlaceDebout() {
    return debout.estVert();
  }

  public void monteeDemanderAssis(PassagerStandard p) {
    if (aPlaceAssise()) {
      assis.incrementer();
      passagers.add(p);
      p.changerEnAssis();
    }
  }

  public void monteeDemanderDebout(PassagerStandard p) {
    if (aPlaceDebout()) {
      debout.incrementer();
      passagers.add(p);
      p.changerEnDebout();
    }
  }

  public void allerArretSuivant() {
    numeroArret++;
    ArrayList<PassagerStandard> passagersTmp = new ArrayList<PassagerStandard>(this.passagers);
    passagersTmp.iterator().forEachRemaining(p -> p.nouvelArret(this, numeroArret));
    passagers = new ArrayList<PassagerStandard>(passagersTmp);
    passagersTmp.clear();
  }

  public void arretDemanderAssis(PassagerStandard p) {
    debout.decrementer();
    p.changerEnAssis();
    assis.incrementer();
  }

  public void arretDemanderDebout(PassagerStandard p) {
    assis.decrementer();
    p.changerEnDebout();
    debout.incrementer();
  }

  public void arretDemanderSortie(PassagerStandard p) {
    debout.decrementer();
    p.changerEnDehors();
    passagers.remove(p);
  }

  @Override
  public String toString() {
    return "[arret:" + numeroArret + ", assis:" + assis.toString() + ", debout: " + debout.toString() + "]";
  }
}

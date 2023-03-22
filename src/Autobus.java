package tec;

import java.util.ArrayList;

//source without documentation for javadoc

public class Autobus {

  //attributes
  private int numeroArret;
  private Jauge assis;
  private Jauge debout;
  private ArrayList<PassagerStandard> passagers;
  private ArrayList<PassagerStandard> passagersDel;

  // constructor
  public Autobus(int nbPlaceAssise, int nbPlaceDebout) {
    assis = new Jauge(nbPlaceAssise, 0);
    debout = new Jauge(nbPlaceDebout, 0);
    numeroArret = 0;
    passagers = new ArrayList<PassagerStandard>();
    passagersDel = new ArrayList<PassagerStandard>();
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
    // Create a temporary list to avoid ConcurrentModificationException
    // It has a performance cost, but it's the only way to avoid it
    // ArrayList<PassagerStandard> passagersTmp = new ArrayList<PassagerStandard>(this.passagers); la list copié a les mêmes références (adresses <=> pointeurs) que passagers pointants vers les mêmes objets
    // passagersTmp.iterator().forEachRemaining(p -> p.nouvelArret(this, numeroArret)); // passagersTmp.iterator().forEachRemaining(p -> p.nouvelArret(this, numeroArret)); // (p -> p.nouvelArret(this, numeroArret) = lambda expression
    // passagersTmp.clear(); // clear the temporary list, garbage collector will do the rest
    passagers.iterator().forEachRemaining(p -> p.nouvelArret(this, numeroArret));
    passagers.removeAll(passagersDel);
    // passagersDel.clear();
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
    if(p.estAssis()) assis.decrementer();
    else debout.decrementer();
    p.changerEnDehors();
    // passagers.remove(p);
    passagersDel.add(p);
  }

  @Override
  public String toString() {
    return "[arret:" + numeroArret + ", assis:" + assis.toString() + ", debout: " + debout.toString() + "]";
  }
}

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
    return false;
  }

  public boolean aPlaceDebout() {
    return false;
  }

  public void monteeDemanderAssis(PassagerStandard p) {
  }

  public void monteeDemanderDebout(PassagerStandard p) {
  }

  public void allerArretSuivant() {
  }

  public void arretDemanderAssis(PassagerStandard p) {
  }

  public void arretDemanderDebout(PassagerStandard p) {
  }

  public void arretDemanderSortie(PassagerStandard p) {
  }
}

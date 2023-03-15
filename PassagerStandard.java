

//source without documentation for javadoc

class PassagerStandard {

  private String nom;
  private int destination;
  private Position position;

  // constructor
  public PassagerStandard(String nom, int destination) {
    this.nom = nom; // this.nom désigne zone mémoire du nom de l'instance
    this.destination = destination;
    this.position = new Position(); 
  }

  //methods
  public String nom() {
    return this.nom;
  }

  public boolean estDehors() { 
    return this.position.estDehors();
  }

  public boolean estAssis() {
    return this.position.estAssis();
  }

  public boolean estDebout() {
    return this.position.estDebout();
  }

  public void changerEnDehors() {
    this.position.dehors(); 
  }

  public void changerEnAssis() {
    this.position.assis();
  }

  public void changerEnDebout() {
    this.position.debout();
  }

  public void monterDans(Autobus t) {
    if (t.aPlaceAssise()){
      t.monteeDemanderAssis(this); // 'this' is a PassagerStandard
    } else if (t.aPlaceDebout()){
      t.monteeDemanderDebout(this);
    }
  }

  public void nouvelArret(Autobus t, int numeroArret) {
    if (numeroArret == this.destination) {
      t.arretDemanderSortie(this);
    }
  }

  @Override
  public String toString() {
    return this.nom() + " " + this.position;
  }
}
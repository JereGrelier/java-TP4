

package tec;
//source without documentation for javadoc

public class PassagerStandard {

  private String nom;
  private int destination;
  private Position position;
  private int type;

  private int ANXIEUX = 0;
  private int STANDARD = 1;

  // constructor
  public PassagerStandard(String nom, int destination) {
    this.nom = nom; // this.nom désigne zone mémoire du nom de l'instance
    this.destination = destination;
    this.position = Position.create();
    this.type = 1;

  }

  public PassagerStandard(String nom, int destination, int type) {
    this.nom = nom; // this.nom désigne zone mémoire du nom de l'instance
    this.destination = destination;
    this.position = Position.create();
    this.type = type;

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
    this.position = this.position.dehors(); 
  }

  public void changerEnAssis() {
    this.position = this.position.assis();
  }

  public void changerEnDebout() {
    this.position = this.position.debout();
  }

  public void monterDans(Autobus t) {
    if (this.type == ANXIEUX) {
      monterCaractereAnxieux(t);
    } else {
      monterCaractereStandard(t);
    }
  }

  private void monterCaractereStandard(Autobus t) {
    if (t.aPlaceAssise()){
      t.monteeDemanderAssis(this); // 'this' is a PassagerStandard
    } else if (t.aPlaceDebout()){
      t.monteeDemanderDebout(this);
    }
  }
  private void monterCaractereAnxieux (Autobus t) {
    if (t.aPlaceDebout()){
      t.monteeDemanderDebout(this);
    }
  }

  public void nouvelArret(Autobus t, int numeroArret) {
    if (this.type == ANXIEUX) {
      if (numeroArret+1 == this.destination) {
        t.arretDemanderSortie(this);
      }
    } else {
      if (numeroArret == this.destination) {
        t.arretDemanderSortie(this);
      }
    }
  }

  @Override // surcharge de la méthode toString() de la classe Object
  public String toString() {
    return this.nom() + " " + this.position; // this.position appelle la méthode toString() de la classe Position
  }
}
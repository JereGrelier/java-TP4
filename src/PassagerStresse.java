

package tec;
//source without documentation for javadoc

public class PassagerStresse implements Passager, Usager{

  private String nom;
  private int destination;
  private Position position;

  // constructor
  public PassagerStresse(String nom, int destination) {
    this.nom = nom; // this.nom désigne zone mémoire du nom de l'instance
    this.destination = destination;
    this.position = Position.create();

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
    
  }

  public void nouvelArret(Autobus t, int numeroArret) {
      
  }

  @Override // surcharge de la méthode toString() de la classe Object
  public String toString() {
    return this.nom() + " " + this.position; // this.position appelle la méthode toString() de la classe Position
  }
}
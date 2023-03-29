/**
 * Cette interface fixe/d'efinit/sp'ecifie les services d'un passager
 * qui va ^etre pris en charge par une instance d'Autobus.
 *
 * <p>
 * Un passager poss'ede un nom et une destination (un mumero d'arret). 
 * Il poss`ede un comportement 'a la mont'ee et un comportement 'a chaque arr^et. 
 * Quand un passager arrive a son arr^et de destination, il sort.
 *
 * <p>
 * Dans un autobus, un passager est forc'ement soit assis, soit debout. 
 * S'il n'est ni assis, ni debout, il est forc'ement dehors. 
 * Quand un passager est cr'ee, il est dans la position dehors.
 * 
 * <p>
 * Les m'ethodes changerEnAssis(), changerEnDebout(), accepterSortie() 
 * modifie la position d'un passager. 
 *
 * <p>
 * Le client d'eclenche la mont'ee du passager dans un autobus par la m'ethode
 * monterDans(). 
 * Si l'instance d'Autobus accepte la demande, il d'eclenche un des 
 * m'ethodes qui modifient la position du passager.
 *
 * <p>
 * A chaque arr^et, la m'ethode nouvelArret() est appel'ee par une 
 * instance d'Autobus.
 *
 * Le passager peut choisir de changer de place ou de sortir.
 * Si l'instance d'Autobus accepte la demande, il d'eclenche une des 
 * m'ethodes qui modifient la position du passager.
 */
public interface Passager {
    /**
     * fournit le nom de du passager.
     */
    public String nom();
    /**
     * Le passager est-il en dehors d'un Autobus ?
     * @return vrai si la position du passager est dehors.
     */
    public boolean estDehors();
    
    /**
     * Le passager est-il assis dans un Autobus ?
     * @return vrai si la position du passager est assis.
     */
    public boolean estAssis();
    
    /**
     * Le passager est-il debout dans un Autobus ?
     * @return vrai si la position du passager est debout.
     */
    public boolean estDebout();
    
    /**
     * Change la position du passager en dehors.
     * Cette m'ethode est appel'ee par une instance d'Autobus.
     */
    public void changerEnDehors();
    
    /**
     * Change la position du passager en assis. 
     * Cette m'ethode est appel'ee par une instance d'Autobus.
     */
    public void changerEnAssis();
    
    /**
     * Change la position du passager en debout.
     * Cette m'ethode est appel'ee par une instance d'Autobus.
     */
    public void changerEnDebout();
  
    /**
     * Cette m'ethode est appel'ee par le programme principal (le <<client>>).
     * Elle r'ealise le caract`ere 'a la mont'ee du passager.
     *
     * @param v l'instance d'Autobus dans lequel va monter le passager.
     */
    public void monterDans(Autobus v);
    
    /**
     * Cette m'ethode r'ealise le caract`ere 'a un arr^et du passager. 
     * Elle est appel'ee par l'instance d'Autobus dans lequel est mont'e le passager. 
     *
     * @param v l'instance d'Autobus dans lequel se trouve le passager.
     * @param numeroArret num'ero de l'arr^et courant.
     */
    public void nouvelArret(Autobus v, int numeroArret);
  }
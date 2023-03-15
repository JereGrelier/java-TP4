

/**
 * R'ealisation d'une jauge sur un intervalle d'entiers.
 * <p>
 * Une instance de Jauge d'efinit une position par rapport 'a un intervalle 
 * de r'ef'erence [0, max[. 
 *
 * La position d'une jauge n'est pas limit'e aux valeurs dans l'intervalle.
 * <p>
 * L''etat d'une jauge correspond 'a sa position par rapport 'a l'intervalle
 * de r'ef'erence [0, max[.
 * Une jauge d'efinit deux 'etats : 
 * <ul>
 * <li>rouge position de la jauge sup'erieure 'a l'intervalle,
 * <li>vert position de la jauge dans l'intervalle, 
 * </ul>
 * 
 * @author georgy
 * @since 2006-2019
 */
class Jauge { 
  private int valeur;
  private final int MAX;

  /**
   * Initialise une instance en pr'ecisant la valeur max de l'intervalle 
   * [0, max[ et la position de d'epart de la Jauge. 
   *
   * La position de d'epart n'est pas forc'ement dans l'intervalle 
   * [0, max[.
   *
   * @param max valeur maximale > 0 de l'intervalle.
   * @param depart   position de d'epart de la Jauge.
   */
  public Jauge(int max, int depart) {
    if (max <= 0)
      throw new IllegalArgumentException("max n'est pas positif");

    valeur = depart;
    MAX = max;
  }

  /**
   * La position de la jauge est-elle au-dessus de l'intervalle ?
   *
   * @return vrai si niveau >=  max.
   *
   */
  public boolean estRouge() {
    return valeur >= MAX;
  }

  /**
   * La position de la jauge est-elle dans l'intervalle ?
   *
   * @return vrai si niveau appartient 'a [0, max[.
   *
   */
  public boolean estVert() {
    return valeur >= 0 && !estRouge();
  }

  /**
   * Incr'emente la position de la jauge.
   * La position peut devenir sup'erieur 'a max.
   */
  public void incrementer() {
    valeur++;
  }

  /**
   * D'ecr'emente la position de la jauge.
   */
  public void decrementer() {
      valeur--;
  }

  /**
   * Cette m'ethode est h'erit'ee de la classe {@link java.lang.Object}.
   * Tr`es utile pour le d'ebogage, elle permet de fournir une 
   * cha^ine de caract`eres correspondant a l''etat d'un objet.
   * Mais, il faut adapter son code 'a chaque classe.
   */
  @Override
  public String toString() {
    return "<" + valeur + " [0," + MAX + "[>"; 
  }
}

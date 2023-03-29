package tec;

public interface Usager {
    /**
     * Cette m'ethode est appel'ee par le programme principal (le <<client>>).
     * Elle r'ealise le caract`ere 'a la mont'ee du passager.
     *
     * @param v l'instance d'Autobus dans lequel va monter le passager.
     */
    public void monterDans(Autobus v);

    /**
     * fournit le nom de du passager.
     */
    public String nom();
}

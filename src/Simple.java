import tec.*;

class Simple {

  /*
   * Affiche les 'etats d'un usager et d'un transport.
   * Sur un param`etre de type Object, la m'ethode println()
   * utilise la methode toString().
   * La m'ethodes toString() doit ^etre redéfinie dans les
   * deux classes tec.PassagerStandard et tec.Autobus.
   */
  static private void deboguerEtat (tec.Autobus t, tec.Usager u) {
    System.out.println(u);
    System.out.println(t);
  }

  static public void main (String[] args) {
    tec.Autobus serenity = new tec.Autobus(1, 2);

    tec.Usager kaylee = new tec.PassagerStandard("Kaylee", 4);
    tec.Usager jayne = new tec.PassagerStandard("Jayne", 4);
    tec.Usager inara = new tec.PassagerStandard("Inara", 5);

    tec.PassagerStandard newt = (tec.PassagerStandard) kaylee;
    System.out.println(newt.estAssis());

    System.out.println(serenity);

    serenity.allerArretSuivant();
    //1
    kaylee.monterDans(serenity);

    System.out.println(serenity);
    System.out.println(kaylee);

    serenity.allerArretSuivant();
    //2
    jayne.monterDans(serenity);

    System.out.println(serenity);
    System.out.println(kaylee);
    System.out.println(jayne);

    serenity.allerArretSuivant();
    //3
    inara.monterDans(serenity);

    System.out.println(serenity);
    System.out.println(kaylee);
    System.out.println(jayne);
    System.out.println(inara);

    serenity.allerArretSuivant();
    //4
    System.out.println(serenity);
    System.out.println(kaylee);
    System.out.println(jayne);
    System.out.println(inara);

    serenity.allerArretSuivant();
    //5
    System.out.println(serenity);
    System.out.println(kaylee);
    System.out.println(jayne);
    System.out.println(inara);
  }
}

/* R'esultat de l'ex'ecution.
[arret:0, assis:<0 [0,1[>, debout: <0 [0,2[>]
[arret:1, assis:<1 [0,1[>, debout: <0 [0,2[>]
Kaylee <assis>
[arret:2, assis:<1 [0,1[>, debout: <1 [0,2[>]
Kaylee <assis>
Jayne <debout>
[arret:3, assis:<1 [0,1[>, debout: <2 [0,2[>]
Kaylee <assis>
Jayne <debout>
Inara <debout>
[arret:4, assis:<0 [0,1[>, debout: <1 [0,2[>]
Kaylee <endehors>
Jayne <endehors>
Inara <debout>
[arret:5, assis:<0 [0,1[>, debout: <0 [0,2[>]
Kaylee <endehors>
Jayne <endehors>
Inara <endehors>
*/

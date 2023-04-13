// import tec.*; // si on importe, pas besoin de metter les ".tec" partout ci dessous

class NewSimple {

  /*
   * Affiche les 'etats d'un usager et d'un transport.
   * Sur un param`etre de type Object, la m'ethode println()
   * utilise la methode toString().
   * La m'ethodes toString() doit ^etre redéfinie dans les
   * deux classes PassagerStandard et Autobus.
   */
  static private void deboguerEtat (Autobus t, Usager u) {
    System.out.println(u);
    System.out.println(t);
  }

  static public void main (String[] args) {
    Autobus serenity = new Autobus(1, 2);

    Usager kaylee = new NewPassagerStandard("Kaylee(standard)", 2);
    Usager jayne = new NewPassagerAnxieux("Jayne(anxieux)", 3);
    Usager inara = new NewPassagerStresse("Inara(stresse)", 5);
    Usager zoe = new NewPassagerLunatique("Zoe(lunatique)", 4);

    System.out.println(serenity);

    serenity.allerArretSuivant();
    //1
    kaylee.monterDans(serenity);
    zoe.monterDans(serenity);

    System.out.println(serenity);
    System.out.println(kaylee);
    System.out.println(zoe);

    serenity.allerArretSuivant();
    //2
    jayne.monterDans(serenity);

    System.out.println(serenity);
    System.out.println(kaylee);
    System.out.println(jayne);
    System.out.println(zoe);

    serenity.allerArretSuivant();
    //3
    inara.monterDans(serenity);

    System.out.println(serenity);
    System.out.println(kaylee);
    System.out.println(jayne);
    System.out.println(inara);
    System.out.println(zoe);

    serenity.allerArretSuivant();
    //4
    System.out.println(serenity);
    System.out.println(kaylee);
    System.out.println(jayne);
    System.out.println(inara);
    System.out.println(zoe);

    serenity.allerArretSuivant();
    //5
    System.out.println(serenity);
    System.out.println(kaylee);
    System.out.println(jayne);
    System.out.println(inara);
    System.out.println(zoe);
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

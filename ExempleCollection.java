
/* Exemple d'utilisation de la classe java.util.Vector
 * Elle repr'esente un tableau dont la taille peut augmenter.
 * Sa r'ealisation assure de fonctionner correctement avec 
 * plusieurs <<threads>>.
 */

class ExempleCollection {

  static public void main (String[] args) {
    String s1 = "Une petite";
    String s2 = "un";
    String s3 = "Trois plus grandes";
    String s4 = "deux fois";

    // D'eclaration d'une variable de type Vector
    // en pr'ecisant le type des 'el'ements contenus
    // dans la structure de donn'ees. 
    java.util.Vector<String> mesChaines;

    //Instanciation en donnant la taille de d'epart.
    mesChaines = new java.util.Vector<>(5);

    //Ajout d'el'ements dans la structure de donn'ees.
    mesChaines.add(s1);
    mesChaines.add(s2);
    mesChaines.add(s3);
    mesChaines.add(s4);
    //chaines.add(new StringBuilder(s3)); //erreur de compilation


    //Parcours de la structure de donn'ees avec un it'erateur.
    java.util.Iterator<String> it = mesChaines.iterator();
    while (it.hasNext()) {
      String s = it.next();
      System.out.println(s.charAt(1));
    }

    //Parcours avec la boucle for simplifi'ee ``for-each''
    //Le code g'en'er'e utilise un it'erateur.
    for (String s : mesChaines) {
      System.out.println(s.length());    
    }

    //Copie de la structure de donn'ees
    java.util.Vector<String> maCopie = new java.util.Vector<>(mesChaines);

    //Suppression d'un 'el'ement dans la copie.
    maCopie.remove(s3);
  }
}


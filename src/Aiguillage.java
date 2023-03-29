class Aiguillage {
    void execute(int choix) {
      if (choix == 1) {
        A a = new A();
        a.jeter();
        a.rattrapper();
      }
      if (choix == 2) {
        new B().lancer();
      }
    }
  }
  
  class A {
    public void jeter() {
      System.out.print("<Hop Hop>");
    }
  
    public void rattrapper() {
      System.out.println("<Poh Poh>");
    }
  }
  
  
  class B {
    public void lancer() {
      System.out.println("shazammm");
    }
  }
  
  
  class TestAiguillage {
    static public void main(String[] args) {
      Aiguillage g = new Aiguillage();
      g.execute(2);
      g.execute(1);
    }
  }
  
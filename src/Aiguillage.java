class Aiguillage {
  void execute(Action a) {
    a.action();
  }
}

interface Action {
  public void action();
}

class A implements Action {
  public void action() {
    jeter();
    rattrapper();
  }

  public void jeter() {
    System.out.print("<Hop Hop>");
  }

  public void rattrapper() {
    System.out.println("<Poh Poh>");
  }
}

class B implements Action {
  public void action() {
    lancer();
  }

  public void lancer() {
    System.out.println("shazammm");
  }
}

class TestAiguillage {
  static public void main(String[] args) {
    Aiguillage g = new Aiguillage();
    g.execute(new B());
    g.execute(new A());
  }
}
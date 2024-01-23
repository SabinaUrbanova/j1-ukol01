package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();
    nakresli_prasatko(100);
  }

  public void nakresli_ctverec(int delka_strany) {
    for (int i = 0; i < 4; i++) {
      zofka.move(delka_strany);
      zofka.turnRight(90);
    }
  }



  public void nakresli_domecek(int delka_strany) {
    nakresli_ctverec(delka_strany);
    zofka.move(delka_strany);
    zofka.turnRight(30);
    zofka.move(delka_strany);
    zofka.turnRight(120);
    zofka.move(delka_strany);
    zofka.turnRight(30);
    zofka.move(delka_strany);
  }


  public void nakresli_nozicky(int delka_strany, int delka_nozicek) {
    zofka.turnLeft(45);
    zofka.move(delka_nozicek);
    zofka.turnLeft(180);
    zofka.move(delka_nozicek);
    zofka.turnLeft(90);
    zofka.move(delka_nozicek);
    zofka.turnLeft(180);
    zofka.move(delka_nozicek);
    zofka.turnLeft(135);
    zofka.move(delka_strany);
    zofka.turnLeft(45);
    zofka.move(delka_nozicek);
    zofka.turnLeft(180);
    zofka.move(delka_nozicek);
    zofka.turnRight(90);
    zofka.move(delka_nozicek);
    zofka.turnLeft(180);
    zofka.move(delka_nozicek);
  }

  public void nakresli_prasatko (int delka_strany) {
    zofka.turnLeft(90);
    nakresli_domecek(100);
    zofka.turnRight(90);
    zofka.move(delka_strany);
    nakresli_nozicky(100, 25);

  }

}


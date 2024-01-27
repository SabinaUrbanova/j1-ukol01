package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();
    posun_na_zacatek();
    nakresli_prasatko(100);
     posun(250);
    nakresli_n_uhelnik(8,30);
    posun(150);
    nakresli_n_uhelnik(20,20);
    posun(100);
    nakresli_slunicko(30, 50);


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
    zofka.turnRight(45);

  }

  public void posun_na_zacatek() {
    zofka.penUp();
    zofka.move(150);
    zofka.turnLeft(90);
    zofka.move(300);
    zofka.turnRight(90);
    zofka.penDown();
  }

  public void posun(int delka_posunu) {
    zofka.penUp();
    zofka.turnRight(90);
    zofka.move(delka_posunu);
    zofka.turnLeft(90);
    zofka.penDown();
  }



  public void nakresli_n_uhelnik(int pocet_uhlu, int delka_strany) {
    for (int i = 0; i < pocet_uhlu; i++) {
      zofka.move(delka_strany);
      zofka.turnLeft(360/pocet_uhlu);
    }

  }

  public void nakresli_slunicko(int delka_strany, int delka_luce) {
    for (int i = 0; i < 15; i++) {  //počet opakování (i) x uhel = 180
      zofka.move(delka_strany);
      zofka.turnRight(360/30);
      zofka.turnLeft(90);
      zofka.move(delka_luce);
      zofka.turnLeft(180);
      zofka.move(delka_luce);
      zofka.turnLeft(90);
      zofka.turnRight(360/30);
  }
}

}


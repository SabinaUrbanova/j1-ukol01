package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();
    /* posun_na_zacatek();
    nakresli_prasatko(100);
     posun(250);
    nakresli_n_uhelnik(8,30);
    posun(150);
    nakresli_n_uhelnik(20,20);
    posun(100);
    nakresli_slunicko(30, 50);
    */
    posun_na_zacatek();
    nakresli_slunicko(10, 20);
    posun(200,'S');
    posun(200,'L');
    for (int i=0; i<5; i++) {
      nakresli_domecek(80);
      posun(100, 'R');
    }
    nakresli_domecek(80);
    posun(200, 'S');
    posun(80, 'L');
    nakresli_domecek(80);
    posun(980, 'L');
    nakresli_domecek(80);
    posun(500, 'R');
    nakresli_prasatko(100);
    posun(200, 'S');
    posun(300, 'L');

    nakresliS();
    posun(100, 'S');
    posun(50, 'R');
    nakresliA();
    posun(50, 'R');
    nakresliB();
    posun(75, 'R');
    nakresliI();
    posun(50, 'R');
    nakresliN();
    posun(50, 'R');
    nakresliA();


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
    zofka.turnRight(180);
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
    zofka.turnLeft(90);
    zofka.move(delka_strany);
    nakresli_nozicky(100, 25);
    zofka.turnRight(45);

  }

  public void posun_na_zacatek() {
    zofka.penUp();
    zofka.move(220);
    zofka.turnLeft(90);
    zofka.move(300);
    zofka.turnRight(90);
    zofka.penDown();
  }

  public void posun(int delka_posunu, char smer) {
    zofka.penUp();
    if (smer == 'L') {
      zofka.turnLeft(90);
      zofka.move(delka_posunu);
      zofka.turnRight(90);
    } else if (smer == 'R') {
      zofka.turnRight(90);
      zofka.move(delka_posunu);
      zofka.turnLeft(90);
    } else if (smer == 'N') {
      zofka.move(delka_posunu);
    } else if (smer == 'S') {
      zofka.turnRight(180);
      zofka.move(delka_posunu);
      zofka.turnLeft(180);
    }
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

  public void nakresliA () {
    zofka.turnRight(15);
    zofka.move(100);
    zofka.turnRight(150);
    zofka.move(100);
    zofka.turnLeft(180);
    zofka.move(50);
    zofka.turnLeft(75); //c = 51.76 pix
    zofka.move(27);   // c/2
    zofka.penUp();
    zofka.turnLeft(180);
    zofka.move(27);
    zofka.turnRight(75);
    zofka.move(50);
    zofka.turnLeft(165);
  }

  public void nakresliS () {
    int uhel = 360/20;
    zofka.turnRight(110);
    for (int i = 0; i <10 ; i++) {
      zofka.move(8);
      zofka.turnLeft(uhel);
    }
    zofka.move(10);
    for (int i = 0; i < 10; i++) {
      zofka.move(8);
      zofka.turnRight(uhel);
    }
    zofka.turnLeft(110);
  }

  public void nakresliB () {
    int uhel = 360/20;
    zofka.move(100);
    zofka.turnRight(90);
    for (int i = 0; i < 10; i++) {
      zofka.move(8);
      zofka.turnRight(uhel);
      }
    zofka.turnRight(180 + uhel);
    for (int j = 0; j < 10; j++) {
      zofka.move(8);
      zofka.turnRight(uhel);
    }
    zofka.turnRight(90 - uhel);
    }

  public void nakresliI () {
    zofka.move(100);
    zofka.turnRight(180);
    zofka.penUp();
    zofka.move(100);
    zofka.turnRight(180);
  }

  public void nakresliN () {
    zofka.move(100);
    zofka.turnRight(160);
    zofka.move(105);
    zofka.turnLeft(160);
    zofka.move(100);
    zofka.penUp();
    zofka.turnRight(180);
    zofka.move(100);
    zofka.turnRight(180);
  }


}


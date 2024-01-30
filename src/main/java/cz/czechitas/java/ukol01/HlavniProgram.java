package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();
    /*nakresliPrasatko(100);
    posun(250, 'R');
    nakresliNUhelnik(8,30);
    posun(150, 'R');
    nakresliNUhelnik(20,20);
    posun(150, 'R');
    nakresliNUhelnik(30, 10);
    */
    posunNaZacatek();
    nakresliSlunicko(10, 20);
    posun(200,'S');
    posun(200,'L');
    for (int i=0; i<5; i++) {
      nakresliDomecek(80);
      posun(100, 'R');
    }
    nakresliDomecek(80);
    posun(200, 'S');
    posun(80, 'L');
    nakresliDomecek(80);
    posun(980, 'L');
    nakresliDomecek(80);
    posun(500, 'R');
    nakresliPrasatko(100);
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

  public void nakresliCtverec(int delkaStrany) {
    for (int i = 0; i < 4; i++) {
      zofka.move(delkaStrany);
      zofka.turnRight(90);
    }
  }

  public void nakresliDomecek(int delkaStrany) {
    nakresliCtverec(delkaStrany);
    zofka.move(delkaStrany);
    zofka.turnRight(30);
    zofka.move(delkaStrany);
    zofka.turnRight(120);
    zofka.move(delkaStrany);
    zofka.turnRight(30);
    zofka.move(delkaStrany);
    zofka.turnRight(180);
  }


  public void nakresliNozicky(int delkaStrany, int delkaNozicek) {
    zofka.turnLeft(45);
    zofka.move(delkaNozicek);
    zofka.turnLeft(180);
    zofka.move(delkaNozicek);
    zofka.turnLeft(90);
    zofka.move(delkaNozicek);
    zofka.turnLeft(180);
    zofka.move(delkaNozicek);
    zofka.turnLeft(135);
    zofka.move(delkaStrany);
    zofka.turnLeft(45);
    zofka.move(delkaNozicek);
    zofka.turnLeft(180);
    zofka.move(delkaNozicek);
    zofka.turnRight(90);
    zofka.move(delkaNozicek);
    zofka.turnLeft(180);
    zofka.move(delkaNozicek);
  }

  public void nakresliPrasatko (int delkaStrany) {
    zofka.turnLeft(90);
    nakresliDomecek(100);
    zofka.turnLeft(90);
    zofka.move(delkaStrany);
    nakresliNozicky(100, 25);
    zofka.turnRight(45);

  }

  public void posunNaZacatek() {
    zofka.penUp();
    zofka.move(220);
    zofka.turnLeft(90);
    zofka.move(300);
    zofka.turnRight(90);
    zofka.penDown();
  }

  public void posun(int delkaPosunu, char smer) {
    zofka.penUp();
    if (smer == 'L') {
      zofka.turnLeft(90);
      zofka.move(delkaPosunu);
      zofka.turnRight(90);
    } else if (smer == 'R') {
      zofka.turnRight(90);
      zofka.move(delkaPosunu);
      zofka.turnLeft(90);
    } else if (smer == 'N') {
      zofka.move(delkaPosunu);
    } else if (smer == 'S') {
      zofka.turnRight(180);
      zofka.move(delkaPosunu);
      zofka.turnLeft(180);
    }
    zofka.penDown();
  }



  public void nakresliNUhelnik(int pocetUhlu, int delkaStrany) {
    for (int i = 0; i < pocetUhlu; i++) {
      zofka.move(delkaStrany);
      zofka.turnLeft(360/pocetUhlu);
    }
  }

  public void nakresliSlunicko(int delkaStrany, int delkaLuce) {
    for (int i = 0; i < 15; i++) {  //počet opakování (i) x uhel = 180
      zofka.move(delkaStrany);
      zofka.turnRight(360/30);
      zofka.turnLeft(90);
      zofka.move(delkaLuce);
      zofka.turnLeft(180);
      zofka.move(delkaLuce);
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


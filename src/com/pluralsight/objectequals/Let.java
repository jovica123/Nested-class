package com.pluralsight.objectequals;

public class Let {
    private int brojLeta;
    private char brojKlase;

    public int getBrojLeta(){return brojLeta;}
    public void setBrojLeta(int brojLeta){this.brojLeta = brojLeta;}
    public char getBrojKlase(){return brojKlase;}
    public void setBrojKlase(char brojKlase){this.brojKlase = brojKlase;}

    public Let (int brojLeta, char brojKlase ){this.brojLeta = brojLeta;
        this.brojKlase=brojKlase;}


    @Override
    public boolean equals(Object o) {
         //if(super.equals(o))  vraca se u base class, proverava da li f1  i  f2 pokazuju na isti objekt. ako ne pokazuju onda nastavlja sa izvrsenjem koda na dole
           //  return true;
        if (!(o instanceof Let))
            return false;

        Let drugi = (Let) o;
        return
                brojLeta == drugi.brojLeta && brojKlase == drugi.brojKlase;
    }


}

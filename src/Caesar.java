import java.util.Scanner;

public class Caesar extends Kryptomat
{

private int s;
private int ASCII;

public Caesar(){
  Kt = "";
  gt= "";
  s=0;

}

public void verschluessen()
    {
       // System.out.println("ich funktuniere");
        for (int i = 0; i< Kt.length(); i++ ) {
            int h =  getAscii(Kt.charAt(i));
            while (h+s>91)
            {h=h-26;}
            gt= gt + this.getChar(h+s);
           //System.out.println(gt);
        }//die for schleife geht die Länge des Strings durch. Mithilfe der Methode get Ascii wird
        // der Ascii code von den Buchstaben vom zu Verschlüsselnden Text. Dieser wird dann mit dem Schlüssel
        // adiert und wird zurück in einen Buchstaben umgeändert.
        // Sollte der Ascii wert vom Schlüssel + Verschlüsselnden Text außerhalb des Lateinischen Alphabetes
        // sein, wird durch die while schleife wieder am Anfang des alphabets angefangen.
        //

    }

    public  void entschluessln()
    {
        for(int i = 0; i< gt.length(); i++ )
        {

            int m =  this.getAscii(gt.charAt(i));
            while (m-s<65)
            {m=m+26;}
            Kt = Kt + this.getChar(m-s);
           // System.out.println(Kt);
            // Die schleife geht das zu entschlüsselnde wort durch. Von der Methode get Ascii
            // Wird der Ascii wert von den Buchstaben von dem zu entschlüsselnden Wort übermittelt.
            // s stelt den Schlüssel da. Anschließend wird der Ascii Wert von den zu entschlüsselnde wort
            //minus den schlüssel gerechnet. Wenn wird das Lateinische Alphabet verlassen, wird mithilfe der
            //while schleife hinten neu angefangen.
        }
    }


    public int getS() {
        return s;
    }
    public void setS(int pWert ){s = pWert;}


}
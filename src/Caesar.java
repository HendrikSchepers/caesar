import java.util.Scanner;
// Scanner scanner = new Scanner(System.in);
        System.out.println("Gib den ersten Liebespartner an");
        choosen1 = scanner.nextLine();
        System.out.println("Gib den zweiten Liebespartner an");
        choosen2 = scanner.nextLine();
        if(choosen1 == choosen2)
        {
            choosen1 = "";
            choosen2 = "";
            this.Feahikeit();
        }else{
         for(int i = 0; i<Array.length-1; i++)
         {
            if(Array[i] == choosen1)
            {
                choosen1.setLiebespatner(choosen2);
            }
            if(Array[i] == choosen2)
            {
                choosen2.setLiebespartner(choosen1);
            }
         }

        }
public class Caesar extends Kryptomat
{

private int s;
private int ASCII;

public Caesar(){
  kt = "";
  gt= "";
  s=0;

}

public void verschluesseln()
    {
       // System.out.println("ich funktuniere");
        for (int i = 0; i< kt.length(); i++ ) {
            int h =  getAscii(kt.charAt(i));
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
            kt = kt + this.getChar(m-s);
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

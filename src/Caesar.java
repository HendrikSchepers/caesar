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
        System.out.println("ich funktuniere");
        for (int i = 0; i< Kt.length(); i++ ) {
            int h =  getAscii(Kt.charAt(i));
            gt= gt + this.getChar(h+s);
           //System.out.println(gt);
        }//die for schleife geht

    }

    public  void entschluessln()
    {
        for(int i = 0; i< gt.length(); i++ )
        {

            int m =  this.getAscii(gt.charAt(i));
            Kt = Kt + this.getChar(m-s);
           // System.out.println(Kt);
        }
    }


    public int getS() {
        return s;
    }
    public void setS(int pWert ){s = pWert;}


}
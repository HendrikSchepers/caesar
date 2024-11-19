import java.util.Scanner;

public class Caesar
{
private String Kt;
private String gt;
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
         int h =  this.getAscii(Kt.charAt(i));
         gt= gt + this.getChar(h+s);
           System.out.println(gt);
        }

    }

    public  void entschluessln()
    {
        for(int i = 0; i< gt.length(); i++ )
        {

            int h =  this.getAscii(gt.charAt(i));
            Kt = Kt + this.getChar(h-s);
        }
    }
    private char getChar(int pWert) {
        return (char)pWert;
    }
    private int getAscii(char pWert) {
    return (int) pWert;
    }
    public String getgt() {
    return gt;
    }
    public void setgt(String pgt) {
    String gt = pgt;
    }
    public String getKt(){
   return Kt;
    }
        public void setKt(String pKt){
    Kt= pKt;
        }

    public int getS() {
        return s;
    }
    public void setS(int pWert ){s = pWert;}


}
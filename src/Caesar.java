import java.util.Scanner;

public class Caesar
{
private String Kt;
private String gt;
private int s;
private int ASCII;

public Caesar(){

}

public void verschluessen()
    {
        for(int i = 0; i< Kt.length(); i++ )
        {
          //gt.charAt(i) = (char)(Kt.charAt(i)+s);

            gt = gt+(char)(Kt.charAt(i)+s);
        }
        System.out.println(gt);
    }


    public  void entschluessln()
    {
        for(int i = 0; i< Kt.length(); i++ )
        {
            Kt = Kt+(char)(gt.charAt(i)-s);
        }
    }
    private char getChar(int pWert) {
        return (char)pWert;
    }
    private int getAscii(char pWert) {
    return (int) pWert;
    }
    public String getGt() {
    return gt;
    }
    public void setGt(String pgt) {
    String pGt = gt;
    }
    public String getKt(){
   return Kt;
    }
        public void setKt(String pkt){
    pkt= Kt;
        }

    public int getS() {
        return s;
    }


}
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
          gt.charAt(i) = (char)(Kt.charAt(i)+s);


        }
    }
    public  void entschluessln()
    {
        for(int i = 0; i< Kt.length(); i++ )
        {
            kt.charAt(i) = (char)(gt.charAt(i)-s);
        }
    }
    private char getChar() {}
    private int getAscii(char pWert) {
    return (int) pWert;
    }
    public String getGt() {}
    public void setGt(String pgt) {}
    public String getKt(){}
        public void setKt(String pgt){}

    public int getS() {
        return s;
    }

}
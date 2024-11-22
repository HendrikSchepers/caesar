public abstract class Kryptomat{
    public String Kt;
    public String gt;

    public abstract void verschluessen();
    public  abstract void entschluessln();

    public char getChar(int pWert) {
        return (char)pWert;
    }
    public int getAscii(char pWert) {
    return (int) pWert;
    }
    public String getgt() {
    return gt;
    }
    public void setgt(String pgt) {
     gt = pgt;
    }
    public String getKt(){
   return Kt;
    }
        public void setKt(String pKt){
    Kt= pKt;
        }
}
public abstract class Kryptomat{
    public String Kt;
    public String gt;
//
    public abstract void verschluessen();
    public  abstract void entschluessln();

    public char getChar(int pWert) {
        return (char)pWert;
    }// gibt den Buchstaben zum Ascii wert wieder aus
    public int getAscii(char pWert) {
    return (int) pWert;
    }
    // Gibt den Ascii wert zum angefragten Buchstaben aus
    public String getgt() {
    return gt;
    }// Gibt das verschlüsselte Wort zurück
    public void setgt(String pgt) {
     gt = pgt;
    }// kriegt den geheimtext den der Benutzter in der Konsole angibt
    public String getKt(){
   return Kt;
    }// Gibt das entschlüsselte Wort aus
        public void setKt(String pKt){
    Kt= pKt;
        }//kriegt das Verschlüsselte Wort welches der Benutzer angibt
}










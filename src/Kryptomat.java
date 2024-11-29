public abstract class Kryptomat{
    public String kt;
    public String gt;
//
    public abstract void verschluesseln();
    public  abstract void entschluessln();

    public char getChar(int pWert) {
        return (char)pWert;
    }// gibt den Buchstaben zum Ascii wert wieder aus
    public int getAscii(char pWert) {
    return (int) pWert;
    }
    // Gibt den Ascii wert zum angefragten Buchstaben aus

    /**
     * Gibt das verschlüsselte Wort zurück
     * @return gt
     */
    public String getGt() {
    return gt;
    }
    /*
    ** kriegt den geheimtext den der Benutzter in der Konsole angibt
     */
    public void setGt(String pgt) {
     gt = pgt;
    }

    /**
     *  Gibt das entschlüsselte Wort aus
     * @return den wert von kt
     */
    public String getKt(){
   return kt;
    }   /**
     kriegt das Verschlüsselte Wort welches der Benutzer angibt
    */
        public void setKt(String pKt){
    kt= pKt;
        }
}










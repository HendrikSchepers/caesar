public class Polybius extends Kryptomat{
    public char alphabetQuadrat[][] = new char[7][7];
    public String sv = "";


    public void Polybius(){
        kt = "";
        gt= "";
        alphabetQuadrat [0][0]= '0';
    }
    public void bfms(){
        int q = 1;
        int z = 65;
        int i =1;
        while (z<91)
        {
            if(z == 74)
            { z++;}
            alphabetQuadrat[q][i] =  this.getChar(z);
            //System.out.println(q + "q");
            System.out.println(alphabetQuadrat[q][i]);
                    if (i==6)
            {
                q++;
                i = 0;
            }
            z++;
            i++;
        }
    }
    public void verschluesseln(){
       for (int i = 0; i<sv.length(); i = i+2) {
          int s1 = Integer.parseInt(sv.substring(i,i));
           int  s2 = Integer.parseInt(sv.substring(i+1,i+1));
           gt = gt+ alphabetQuadrat[s1][s2];
       }

    };


    public   void entschluessln(){

    };


    public String getS() {
        return sv;
    }
    public void setS(String pWert ){sv = pWert;}


}

public class Polybius extends Kryptomat{
    public String alphabetQuadrat[][] = new String[7][7];



    public void Polybius(){
        kt = "";
        gt= "";
        alphabetQuadrat [0][0]= "0";
    }
    public void bfms(){
        int q = 1;
        int z = 65;
        int i =1;
        while (z<91)
        {
            if(z == 74)
            { z++;}
            alphabetQuadrat[q][i] =  ""+ this.getChar(z);
            System.out.println(q + "q");
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

    };


    public   void entschluessln(){};


        }
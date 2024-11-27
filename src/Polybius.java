public class Polybius extends Kryptomat{
    public int [][] alphabetQuadrat ;
    public void Polybius(){
        kt = "";
        gt= "";

    }
    private void bfms(){
        int q = 1;
        int z = 65;
        for(int i = 1; i<6; i++)
        {
            if(z == 74)
            { z++;}
            alphabetQuadrat[q][i] = z;
                    q++;
                    if (i==6);
            {
                q= 1;
            }
            z++;

        }
    }
    public void verschluesseln(){};


    public   void entschluessln(){};


        }
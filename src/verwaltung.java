import java.util.Scanner;
//
public class verwaltung  {
    private Scanner scanner;
    private Caesar caesar;
    private Viginere viginere;
    private String h;
    public static void main(String[] Args) {
        new verwaltung();
    }
    public verwaltung() {

        String Kt;
        int s;
        String gt;
        String sv;
        sv="";
        while(true) {
            int option;

            scanner = new Scanner(System.in);
            System.out.println("== HAUPTMENÜ ==");
            System.out.println("Drücken sie [1] um mithilfe des Caeser verfahrens ein Wort zu verschlüsseln ");
            System.out.println("Drücken sie [2] um mithilfe des Caeser verfahrens ein Wort zu entschlüsseln ");
            System.out.println("Drücken sie [3] um mithilfe des Viginere verfahrens ein Wort zu Verschlüsseln ");
            System.out.println("Drücken sie [4] um mithilfe des Viginere Verfahren ein Wort zu Entschlüsseln ");
            System.out.println("Drücken sie [5] um das Programm zu beenden");
            option=scanner.nextInt();
            scanner.nextLine();
            if (option == 1) {
                caesar = new Caesar();
                System.out.println("gib das zu verschlüsselnde Wort an");
                h = scanner.nextLine();
                Kt= h.toUpperCase();
                caesar.setKt(Kt);
                System.out.println("gib sie eine Zahl als Schlüssel an");

                s = scanner.nextInt();


                caesar.setS(s);
                this.caesar.verschluesseln();
                System.out.println("Das ist die geheimnachicht: "+this.caesar.getGt());
            }
            else if (option == 2)
            {
                caesar = new Caesar();
                System.out.println("gib das zu entschlüsselnde Wort an");
                h = scanner.nextLine();
                gt= h.toUpperCase();
                caesar.setGt(gt);
                System.out.println("geben sie den schlüssel als zahl an");
               s =scanner.nextInt();
               caesar.setS(s);
                 this.caesar.entschluessln();
                System.out.println("Das entschlüsselte Wort ist"+this.caesar.getKt());
            }
            else if(option ==3) {
                viginere = new Viginere();
                System.out.println("gib das zu verschlüsselnde Wort an");
                h = scanner.nextLine();
                Kt= h.toUpperCase();
                viginere.setKt(Kt);
                System.out.println("gib den schlüssel als wort an");
                h = scanner.nextLine();
                sv= h.toUpperCase();


                viginere.setS(sv);
                viginere.verschluesseln();
                System.out.println("Das ist die geheimnachicht: "+viginere.getGt());
            }
            else if(option == 4)
            {
              viginere = new Viginere();
                System.out.println("gib das zu entschlüsselnde Wort an");
                h = scanner.nextLine();
                gt= h.toUpperCase();
                viginere.setGt(gt);
                System.out.println("gib den schlüssel als Buchstaben an");
                h = scanner.nextLine();
                sv= h.toUpperCase();


                viginere.setS(sv);
                viginere.entschluessln();
                System.out.println("Das ist das entschlüsselte Wort: "+viginere.getKt());
            }
            else if(option == 5)
            {   gt="";
                Kt="";
                break;}
        }
    }
}

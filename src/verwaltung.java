import java.util.Scanner;

public class verwaltung  {
    private Scanner scanner;
    private Caesar caesar;
    private Viginere viginere;

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
            System.out.println("[1] verschlüsseln");
            System.out.println("[2] entschlüsseln");
            System.out.println("[3] Verschlüsseln Viginere");
            System.out.println("[4] Entschlüsseln Viginere");
            System.out.println("zum zurücksetzten von verschlüsseln und entschlüsseln 4 drücken");
            option=scanner.nextInt();
            scanner.nextLine();
            if (option == 1) {
                caesar = new Caesar();
                System.out.println("gib das zu verschlüsselnde Wort an");
                Kt = scanner.nextLine();
                caesar.setKt(Kt);
                System.out.println("gib den schlüssel an");
                s = scanner.nextInt();


                caesar.setS(s);
                this.caesar.verschluessen();
                System.out.println("Das ist die geheimnachicht: "+this.caesar.getgt());
            }
            else if (option == 2)
            {
                caesar = new Caesar();
                System.out.println("gib das zu entschlüsselnde Wort an");
                gt = scanner.nextLine();
                caesar.setgt(gt);
                System.out.println("gib den Schlüssel an");
               s =scanner.nextInt();
               caesar.setS(s);
                 this.caesar.entschluessln();
                System.out.println(this.caesar.getKt());
            }
            else if(option ==3) {
                viginere = new Viginere();
                System.out.println("gib das zu verschlüsselnde Wort an");
                Kt = scanner.nextLine();
                viginere.setKt(Kt);
                System.out.println("gib den schlüssel in Großbuchstaben an");
                sv = scanner.nextLine();


                viginere.setS(sv);
                viginere.verschluessen();
                System.out.println("Das ist die geheimnachicht: "+viginere.getgt());
            }
            else if(option == 4)
            {
              viginere = new Viginere();
                System.out.println("gib das zu entschlüsselnde Wort an");
                gt = scanner.nextLine();
                viginere.setgt(gt);
                System.out.println("gib den schlüssel in Großbuchstaben an");
                sv = scanner.nextLine();


                viginere.setS(sv);
                viginere.entschlusseln();
                System.out.println("Das ist das entschlüsselte Wort: "+viginere.getKt());
            }
            else if(option == 5)
            {   gt="";
                Kt="";
                break;}
        }
    }
}

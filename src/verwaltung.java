import java.util.Scanner;

public class verwaltung {
    private Scanner scanner;
    private Caesar caesar;

    public static void main(String[] Args) {
        new verwaltung();
    }
    public verwaltung() {

        String Kt;
        int s;
        String gt;
        while(true) {
            int option;

            scanner = new Scanner(System.in);
            System.out.println("== HAUPTMENÜ ==");
            System.out.println("[1] verschlüsseln");
            System.out.println("[2] entschlüsseln");
            System.out.println("[3] Beenden");
            System.out.println("zum zurücksetzten von verschlüsseln und entschlüsseln 3 drücken");
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
                System.out.println("gib das zu entschlüsselnde Wort an");
                gt = scanner.nextLine();
                System.out.println("gib den Schlüssel an");
               s =scanner.nextInt();
                 this.caesar.entschluessln();
                System.out.println(this.caesar.getKt());
            }
            else if(option == 3)
            {   gt="";
                Kt="";
                break;}
        }
    }
}

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
            System.out.println("[0] Beenden");
            System.out.println("zum zurücksetzten von verschlüsseln und entschlüsseln 3 drücken");
            option=scanner.nextInt();
            if (option == 1) {
                caesar = new Caesar();
                System.out.println("gib das zu verschlüsselnde Wort an");
                Kt = scanner.nextLine();
                caesar.setKt(Kt);
                System.out.println("gib den schlüssel an");
                String sh = scanner.nextLine();
                 s= Integer.parseInt(sh);

                caesar.setS(s);
                this.caesar.verschluessen();
            }
            else if (option == 2)
            {
                System.out.println("gib das zu entschlüsselnde Wort an");
                gt = scanner.nextLine();
                System.out.println("gib den Schlüssel an");
                String sh = scanner.nextLine();
                 s= Integer.parseInt(sh);
            }
            else if(option == 3)
            {   gt="";
                Kt="";
                break;}
        }
    }
}

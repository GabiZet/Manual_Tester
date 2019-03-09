import java.util.Scanner;

public class HelloWorld4 {
    public static void main(String[] args) {
        HelloWorld4 helloWorld1 = new HelloWorld4();
        helloWorld1.printHello();
    }

    private String getHelloMessageSwitch(String jezyk) {
        String powitanie;
        switch (jezyk) {
            case "pl":
                powitanie = "Witaj Świecie!";
                break;
            case "en":
                powitanie = "Hello World";
                break;
            case "cs":
                powitanie = "cos";
                break;
            default:
                powitanie = "Język nieznany!";
        }
        return powitanie;
    }

    private boolean powitanieDluzszeNiz3(String powitanie) {
        String komunikat = (powitanie.length() > 3) ? "Większe" : "Mniejsze";

        System.out.println(komunikat);
        return powitanie.length() > 3;
    }

    private void printHello() {
        System.out.println("Prosze podaj slowo");
        String wartoscUzytkownika = new Scanner(System.in).nextLine();
        if (powitanieDluzszeNiz3(wartoscUzytkownika)) {
            System.out.println("Twoje slowo jest dluzsze niz 3");
        } else {
            System.out.println("Twoje slowo jest krotsze niz 3");
        }
        powitanieDluzszeNiz3("wartoscUzytkownika");
//        System.out.println(getHelloMessageSwitch("pl"));
//        System.out.println(getHelloMessageSwitch("en"));
//        System.out.println(getHelloMessageSwitch("cs"));
    }
}
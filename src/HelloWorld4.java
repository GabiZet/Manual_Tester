public class HelloWorld4 {
    public static void main(String[] args) {
        HelloWorld4 helloWorld1 = new HelloWorld4();
        helloWorld1.printHello();
    }

    private String getHelloMessage(int jezyk) {
        if (jezyk == 0) {
            return "Witaj Świecie!";
        } else if (jezyk == 1) {
            return "Hello world!";
        }
        else {
            return "Język nieznany!";

        }
    }

    private String getHelloMessageSwitch(int jezyk) {
        String powitanie = "abc";
        switch (jezyk) {
            case 0:
                powitanie = "Witaj Świecie!";
                break;
            case 1:
                powitanie = "Hello world!";
                break;
            case 5:
                powitanie = "cos";
                break;
            default:
                powitanie = "Język nieznany!";
        }
        return powitanie;
    }

    private void printHello() {
        System.out.println(getHelloMessageSwitch(0));
//        System.out.println(getHelloMessageSwitch(1));
//        System.out.println(getHelloMessageSwitch(222));
    }
}
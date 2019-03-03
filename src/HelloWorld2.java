public class HelloWorld2 {
    public static void main(String[] args) {
        HelloWorld2 helloWorld1 = new HelloWorld2();
//        helloWorld1.printHello();
        helloWorld1.inkrementacjaTest();
    }

    private String getHelloMessage() {
        System.out.print("Hello World!");
        return "Hello world!";
    }

    private void printHello() {
        System.out.println(getHelloMessage());
    }

    private void inkrementacjaTest(){
        int i = 5;
        System.out.println(++i);//1 zwieksza i nastepnie drukuje
        System.out.println(i++);//1 drukuje, a dopiero potem zwieksza
        System.out.println(i);//2 poprostu drukuje


    }


}






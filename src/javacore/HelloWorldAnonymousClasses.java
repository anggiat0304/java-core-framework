package javacore;

public class HelloWorldAnonymousClasses {
    interface HelloWorld{
        public void greet();
        public void greetSomeone(String name);
    }
    public void sayHello(){
        class EnglishGreeting implements HelloWorld{
            String name = "world";
            public void greet(){
                greetSomeone(name);
            }
            public void greetSomeone(String someone){
                name = someone;
                System.out.println("Hello " + name + " !");
            }
        }
        HelloWorld englishGreeting = new EnglishGreeting();

        HelloWorld frechGreeting = new HelloWorld() {
            String name = "tout le monde";
            public void greet(){
                greetSomeone(name);
            }
            public void greetSomeone(String name){
                this.name = name ;
                System.out.println("Salut " + name + " !");
            }
        };
        HelloWorld spanishGreeting = new HelloWorld() {
            String name = "mundo";
            public void greet(){
                greetSomeone(name);
            }
            public void greetSomeone(String name){
                this.name = name ;
                System.out.println("Hola " + name + " !");
            }
        };
        englishGreeting.greet();
        frechGreeting.greetSomeone("Anggiat");
        spanishGreeting.greet();

    }

    public static void main(String[] args) {
        HelloWorldAnonymousClasses helloWorldAnonymousClasses = new HelloWorldAnonymousClasses();
        helloWorldAnonymousClasses.sayHello();
    }
}

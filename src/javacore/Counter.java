package javacore;

 class Counter {
     static int total = 0;
     int value = 0 ;
      Counter(){
        total++;
        value++;
    }

     public static void main(String[] args) {
         Counter a = new Counter();
         Counter b = new Counter();
         System.out.println(a.total);
         System.out.println(a.value);
         System.out.println(b.value);
         Counter c = new Counter();
         System.out.println(c.total);
     }
}

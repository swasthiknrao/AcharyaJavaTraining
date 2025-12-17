class dad {

    public void function1() {

        System.out.println("This is function 1 of dad class");
    }

    public void function2() {
        System.out.println("This is function 2 of dad class");
    }
}

class son extends dad {
  
   
    public void function1() {
//    super.function1();

        System.out.println("This is function 1 of son class");
    }
}

class Cons {
    public static void main(String args[]) {
        son s = new son();
        s.function1();


       
}}
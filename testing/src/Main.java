

 class Mammal {

    private int age;
    protected String name;

    public int getAge() {
         return age;
    }

    public void setAge(int theAge) {
        age = theAge;

    }


}


public class Main {

    public static void greet(int x) {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        greet(5);
        Mammal mammal = new Mammal();
        mammal.setAge(5);
        System.out.println(mammal.getAge());

        
    }
}

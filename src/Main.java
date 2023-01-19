import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        printStaticHello();
        Student student1 = new Student ("Andrii", "Krylov", 2003);
        System.out.println(student1.name);
        System.out.println(student1.surname);
        System.out.println(student1.birthYear);
        Student student2 = new Student ("Jakub","Gigachad",1337);
        System.out.println(student2.name);
        System.out.println(student2.surname);
        System.out.println(student2.birthYear);
        SecretStudent secret1 = new SecretStudent("default name", "default surname", 0000);
        SecretStudent secret2 = new SecretStudent("Seregga", "Pivo", 1989);
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Write a key:");
        String word = keyboard.nextLine();
        if (word == "reveal"){
            System.out.println(secret2.name);
            System.out.println(secret2.surname);
            System.out.println(secret2.birthYear);
        }
        else{
            System.out.println(secret1.name);
            System.out.println(secret1.surname);
            System.out.println(secret1.birthYear);
        }
    }
    public static void printStaticHello(){ // tę metodę można wywołać, ponieważ main i printStaticHello są static
        System.out.println("Hello");
    }
    public void printHello(){
        System.out.println("Hello"); // // tę metodę można wywołać, ponieważ main i printStaticHello nie są static
    }
}

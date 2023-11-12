
import java.util.Scanner;
public class Maestro {
    Scanner lec = new Scanner(System.in);
    String name;
    int age;
    String ciudad;
    Maestro(String name, int age, String ciudad){
        this.name = name;
        this.age = age;
        this.ciudad = ciudad;
    }
    void lookName(){
        System.out.println("El nombre es " + this.name);
    }
    void changeName(){
        this.name = lec.next();
    }
}

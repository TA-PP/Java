/*
 * 학번 : 2017024245 
 * 작성자 : 송승우
 * 작성일 : 2022.10.08
 */

class Person {}
class Student extends Person {}
class Researcher extends Person {}
class Professor extends Researcher {}

public class InstanceOfEx {
    static void print(Person p) {
        if(p instanceof Person) {
            System.out.print("Person ");
        }
        if(p instanceof Student) {
            System.out.print("Student ");
        }
        if(p instanceof Researcher) {
            System.out.print("Researcher ");
        }
        if(p instanceof Professor) {
            System.out.print("Professor ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        System.out.print("new Student() ->\t"); print(new Student());
        System.out.print("new Researcher() ->\t"); print(new Researcher());
        System.out.print("new Professor() ->\t"); print(new Professor());
    }
}

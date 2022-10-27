/*
 * 학번 : 2017024245   
 * 작성자: 송승우
 * 작성일 : 2022.10.05
 */

class Person {
    private int weight;
    int age;
    protected int height;
    public String name;

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
}
class Student extends Person {
    public void set() {
        age = 26;
        name = "송승우";
        height = 176;
        //weight = 75;
        setWeight(75);
    }
}

public class InheritanceEx { 
    public static void main(String[] args) throws Exception {
        Student s = new Student();
        s.set();
        
        System.out.println(s.age);
    }
}

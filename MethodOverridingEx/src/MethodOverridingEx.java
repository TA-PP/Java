/*
 * 학번 : 2017024245   
 * 작성자: 송승우
 * 작성일 : 2022.10.05
 */

class Shape {
    public Shape next;

    public Shape() {next = null;}

    public void draw() {
        System.out.println("Shape");
    }
}
class Line extends Shape {
    public void draw() {
        System.out.println("Line");
    }
}
class Rect extends Shape {
    public void draw() {
        System.out.println("Rect");
    }
}
class Circle extends Shape {
    public void draw() {
        System.out.println("Circle");
    }
}

public class MethodOverridingEx {
    static void paint(Shape p) {
        p.draw();
    }
    public static void main(String[] args) throws Exception {
        Line line = new Line();
        paint(line);
        paint(new Shape());
        paint(new Line());
        paint(new Rect());
        paint(new Circle());
    }
}

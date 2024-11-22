package edu.penzgtu;

public class App {
    public static void main(String[] args) {
        var queue = new ConcreteQueue<Double>();
        System.out.println(queue);
        queue.push(1.0);
        System.out.println(queue);
 
        var queue2 = new ConcreteQueue<String>();
        System.out.println(queue2);
        queue2.push("qweqweewq");
        System.out.println(queue2); 
    }
}

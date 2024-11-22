package edu.penzgtu;

import java.util.ArrayList;

interface Queue<T> {
    void push(T element);
}

public class ConcreteQueue<T> implements Queue<T> {
    private ArrayList<T> data = new ArrayList<T>();

    @Override
    public void push(T element) {
        data.add(element);
    }

    @Override
    public String toString() {
        return "ConcreteQueue [data=" + data + "]";
    }

}
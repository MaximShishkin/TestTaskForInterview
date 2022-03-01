package ru.shishkin.testTaskForInterview;

public final class Node {
    private int count;
    private String name;
    private Object child;

    public Node(int count) {
        this.count = count;
    }

    public boolean equals(int count1) {
        if (count == count1) return true;
        else return false;
    }

    public Node(String name) {
        this.name = name;
    }

    public boolean equals(String name1) {
        if (name.hashCode() == name1.hashCode()) return true;
        else return false;
    }

    public Node(Object child) {
        this.child = child;
    }

    public boolean equals(Object child1) {
        if (child.hashCode() == child1.hashCode()) return true;
        else return false;
    }
}

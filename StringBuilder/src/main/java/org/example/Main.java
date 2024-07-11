package org.example;


import java.util.Stack;

public class Main {
    private StringBuilder stringBuilder;
    private Stack<String> snapshots;

    public Main() {
        stringBuilder = new StringBuilder();
        snapshots = new Stack<>();
    }
}
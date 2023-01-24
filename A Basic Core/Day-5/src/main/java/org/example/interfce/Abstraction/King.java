package org.example.interfce.Abstraction;

public class King implements ChessPlayer{
    @Override
    public void moves() {
        System.out.println("KIng can move only one steps");
    }
}

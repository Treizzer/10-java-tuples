package com.treizer;

public class Main {

    public static void main(String[] args) {
        Task task = new Task();

        // Pair<String, Integer> params = task.returningPair();
        // var params = task.returningPair();
        // System.out.println("Param 1: " + params.getLeft());
        // System.out.println("Param 2: " + params.getRight());

        // var params = task.returningTriple();
        // System.out.println("Param 1: " + params.getLeft());
        // System.out.println("Param 2: " + params.getMiddle());
        // System.out.println("Param 3: " + params.getRight());

        // Tuple4 params = task.returningTuple4();
        var params = task.returningTuple4();
        System.out.println("Param 1: " + params._1());
        System.out.println("Param 2: " + params._2());
        System.out.println("Param 3: " + params._3());
        System.out.println("Param 4: " + params._4());
    }

}
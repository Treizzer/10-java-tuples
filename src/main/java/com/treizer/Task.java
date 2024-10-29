package com.treizer;

import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.tuple.Triple;

import io.vavr.Tuple;
import io.vavr.Tuple4;

public class Task {

    // String
    public String returningString() {
        return "Hello World";
    }

    // Number
    public Integer returningNumber() {
        return 10;
    }

    // Returning two params - Pair
    public Pair<String, Integer> returningPair() {
        return Pair.of("Hello World", 10);
    }

    // Returning three params - Triple
    public Triple<String, Integer, Boolean> returningTriple() {
        // .ofNonNull also works in the tuple "Pair"
        return Triple.ofNonNull("Hello World", 10, true);
    }

    // Returning four params - Tuple0 - 8
    public Tuple4<String, Integer, Boolean, Character> returningTuple4() {
        return Tuple.of("Hello World", 10, true, '@');
    }

}

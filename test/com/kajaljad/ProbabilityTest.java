package com.kajaljad;

import com.kajaljad.shapes.Probability;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ProbabilityTest {
    @Test
    public void forRepresentingProbability() {
        Probability probability = new Probability(0.5);
        assertEquals(0.5, probability.getValue());
    }

    @Test
    public void forRepresentingInverseProbability() {
        Probability probability = new Probability(0.4);
        Probability inverseProbability = new Probability(0.6);
        assertEquals(inverseProbability, probability.getInverseProbability());
    }

    @Test(expected = IllegalArgumentException.class)
    public void forThrowingExceptionInConstructor() {
        Probability probability = new Probability(23);
    }

    @Test
    public void forCalculatingProbability() {
        Probability probability = new Probability(2,4);
        assertEquals(0.5, probability.getValue());
    }

    @Test
    public void forCalculatingProbabilityOfMultipleEvents() {
        Probability p1 = new Probability(0.3);
        Probability p2 = new Probability(0.4);
        Probability expected = new Probability(0.12);
        Probability result = p1.and(p2);
        assertEquals(expected,result);
    }

    @Test
    public void forProbabilityOfAtleastOneOccurrence() {
        Probability p1 = new Probability(0.5);
        Probability p2 = new Probability(0.5);
        Probability expected = new Probability(0.75);
        Probability result = p1.or(p2);
        assertEquals(expected,result);
    }

    @Test
    public void forProbabilityOfXOr() {
        Probability p1 = new Probability(0.5);
        Probability p2 = new Probability(0.5);
        Probability expected = new Probability(0.5);
        Probability result = p1.xor(p2);
        assertEquals(expected,result);
    }
}

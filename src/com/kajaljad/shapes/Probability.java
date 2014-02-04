package com.kajaljad.shapes;

public class Probability {

    private double probability;

    public Probability(double probability) {
        if (!(probability <= 1 && probability >= 0)) throw new IllegalArgumentException();
        this.probability = probability;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Probability)) return false;

        Probability that = (Probability) o;

        if (Double.compare(that.probability, probability) != 0) return false;

        return true;
    }

    public Probability(double favourableOutcomes, double possibleOutComes) {
        this(favourableOutcomes / possibleOutComes);
    }

    public double getValue() {
        return probability;
    }

    public Probability getInverseProbability() {
        return new Probability(1 - probability);
    }

    public Probability and(Probability p2) {
        return new Probability(this.getValue() * p2.getValue());
    }

    public Probability or(Probability p2) {
        return new Probability((this.getValue() + p2.getValue()) - (this.and(p2).getValue()));
    }

    public Probability xor(Probability p2) {
        return new Probability(this.or(p2).getValue() - this.and(p2).getValue());
    }
}

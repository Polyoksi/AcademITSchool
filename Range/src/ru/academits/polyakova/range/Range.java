package ru.academits.polyakova.range;

public class Range {
    private double from;
    private double to;

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getLength() {
        return to - from;
    }

    public boolean isInside(double number) {
        return number >= from && number <= to;
    }

    public Range getCrossing(Range interval1) {
        double from = interval1.from;
        double to = interval1.to;
        if (this.from <= from) {
            if (this.to >= from) {
                return new Range(from, Math.min(this.to, to));
            } else {
                return null;
            }
        } else {
            if (to >= this.from) {
                return new Range(this.from, Math.min(this.to, to));
            } else {
                return null;
            }
        }
    }

    public Range[] getUnion(Range interval1) {
        double from = interval1.from;
        double to = interval1.to;
        if (this.from <= from) {
            if (this.to >= from) {
                return new Range[]{new Range(this.from, Math.max(this.to, to))};
            } else {
                return new Range[]{new Range(this.from, this.to), new Range(from, to)};
            }
        } else {
            if (to >= this.from) {
                return new Range[]{new Range(from, Math.max(this.to, to))};
            } else {
                return new Range[]{new Range(from, to), new Range(this.from, this.to)};
            }
        }
    }

    public Range[] getResidual(Range interval1) {
        double from = interval1.from;
        double to = interval1.to;
        if (this.from <= from) {
            if (this.to > from) {
                if (this.to != to) {
                    return new Range[]{new Range(this.from, from), new Range(Math.min(this.to, to), Math.max(this.to, to))};
                } else {
                    return new Range[]{new Range(this.from, from)};
                }
            } else {
                return new Range[]{new Range(this.from, this.to)};
            }
        } else {
            if (to > this.from) {
                if (to != this.to) {
                    return new Range[]{new Range(from, this.from), new Range(Math.min(this.to, to), Math.max(this.to, to))};
                } else {
                    return new Range[]{new Range(from, this.from)};
                }
            } else {
                return new Range[]{new Range(from, to)};
            }
        }
    }
}


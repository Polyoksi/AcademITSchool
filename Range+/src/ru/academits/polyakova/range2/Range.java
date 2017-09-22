package ru.academits.polyakova.range2;

public class Range {
    public static double getLength(double[] interval) {
        return interval[1] - interval[0];
    }

    public static double[] getCrossing(double[] interval1, double[] interval2) {
        double[] first;
        double[] second;
        if (interval1[0] <= interval2[0]) {
            first = interval1;
            second = interval2;
        } else {
            first = interval2;
            second = interval1;
        }

        double[] interval3 = new double[]{0, 0};
        interval3[0] = second[0];
        if (first[1] > second[0]) {
            interval3[1] = Math.max(first[1], second[1]);
        } else {
            return null;
        }
        return interval3;
    }


    public static double[] getUnion(double[] interval1, double[] interval2) {
        double[] first;
        double[] second;
        if (interval1[0] <= interval2[0]) {
            first = interval1;
            second = interval2;
        } else {
            first = interval2;
            second = interval1;
        }

        double[] interval3;
        if (first[1] >= second[0]) {
            interval3 = new double[]{first[0], Math.max(first[1], second[1])};
        } else {
            interval3 = new double[]{first[0], first[1], second[0], second[1]};
        }
        return interval3;
    }


    public static double[] getResidual(double[] interval1, double[] interval2) {
        double[] first;
        double[] second;
        if (interval1[0] <= interval2[0]) {
            first = interval1;
            second = interval2;
        } else {
            first = interval2;
            second = interval1;
        }

        double[] interval3;
        if (first[0] == second[0]) {
            if (first[1] > second[1]) {
                interval3 = new double[]{first[1] - second[1], first[1]};
            } else if (first[1] < second[1]) {
                interval3 = new double[]{second[1] - first[1], second[1]};
            } else {
                return null;
            }
        } else if (first[1] == second[1]) {
            interval3 = new double[]{first[0], first[1] - second[0]};
        } else {
            if (first[1] < second[1]) {
                interval3 = new double[]{first[0], second[0]};
            } else {
                interval3 = new double[]{first[0], second[0], second[1], first[1]};
            }
        }
        return interval3;
    }
}

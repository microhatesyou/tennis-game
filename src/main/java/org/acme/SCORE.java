package org.acme;

public enum SCORE {
    LOW, FIFTEEN, THIRTY, FORTY, DEDUCE, ADVANTAGE;

    public static SCORE fromPoints(int points) {
        switch (points) {
            case 0:
                return LOW;
            case 1:
                return FIFTEEN;
            case 2:
                return THIRTY;
            case 3:
                return FORTY;
            default:
                throw new IllegalStateException("cant calculate point directly for value " + points);
        }
    }
}

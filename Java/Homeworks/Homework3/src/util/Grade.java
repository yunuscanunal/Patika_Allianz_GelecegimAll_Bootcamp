package util;

public enum Grade {
    A("A", 4), B("B", 3), C("C", 2), D("D", 1), F("F", 0);

    int numericValue;
    String stringValue;
    private Grade(String stringValue, int numericValue) {
        this.stringValue = stringValue;
        this.numericValue = numericValue;
    }

    public int getNumericValue() {
        return numericValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "numericValue=" + numericValue +
                ", stringValue='" + stringValue + '\'' +
                '}';
    }
}

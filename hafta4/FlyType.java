public enum FlyType {
    DOMESTIC_LINE("Yurtiçi Seyahat"),
    INTERNATIONAL_LINE("Yurtdışı Seyahat");

    String line;

    FlyType(String line) {
        this.line = line;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }
}

package de.telekom.sea4;

public class Middle {
    private Bottom bottom;

    public Middle(Bottom bottom) {
        this.bottom = bottom;
    }

    public String getMessage() {


        return bottom.getMessage();
    }
}

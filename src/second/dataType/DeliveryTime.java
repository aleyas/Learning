package second.dataType;

public enum DeliveryTime {
    FIRSTQUARTER ("01 March"),
    SECONDQUARTER ("01 Juli"),
    THIRDQUARTER ("01 Oktober"),
    QUARTERQUARTER ("01 January");

    private String date;

    DeliveryTime(String date) { this.date =  date;
    }

    @Override
    public String toString() {
        return date;
    }
}

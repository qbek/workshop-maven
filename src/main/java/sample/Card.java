package sample;

public class Card {

    private String pan;

    public String getPan() {
        return pan;
    }

    public String getHolder() {
        return holder;
    }

    public String getExpDate() {
        return expDate;
    }

    public String getCvv() {
        return cvv;
    }

    private String holder;
    private String expDate;
    private String cvv;


    Card (String pan, String holder, String expDate, String cvv) {
        this.pan = pan;
        this.holder = holder;
        this.expDate = expDate;
        this.cvv = cvv;
    }



}

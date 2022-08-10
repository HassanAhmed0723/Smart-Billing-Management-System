package application;

public class PayBill {
    private int pbillId;

    public int getPbillId() {
        return pbillId;
    }

    public void setPbillId(int pbillId) {
        this.pbillId = pbillId;
    }

    @Override
    public String toString() {
        return "PayBill{" +
                "pbillId=" + pbillId +
                '}';
    }

    public PayBill(int pbillId) {
        this.pbillId = pbillId;
    }
    

}

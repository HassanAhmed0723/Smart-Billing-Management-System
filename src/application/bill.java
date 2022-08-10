package application;

public class bill {
private int billid;
private int amount;
public int getBillid() {
	return billid;
}
public void setBillid(int billid) {
	this.billid = billid;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}

@Override

public String toString() {
    return "bill [billid=" + billid + ", amount=" + amount + "]";
 
}
public bill(int billid, int amount) {
    super();
    this.billid = billid;
    this.amount = amount;


}
}

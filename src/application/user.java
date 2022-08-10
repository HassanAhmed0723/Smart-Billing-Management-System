package application;


import java.util.Properties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;


@Entity
@Table(name="Userdb")
public class user {
	
@Id
@Column(name="A_bill")
private  int abill;

@Column(name="B_bill")
private  int bbill;

@Column(name="C_bill")
private  int cbill;

@Column(name="other_bill")
private  int otbill;

@Column(name="other_id")

private  int otid;

@Column(name="a_id")

private  int a_id;

@Column(name="b_id")

private int b_id;

@Column(name="c_id")

private static int c_id;

@Column(name="Credit_Card")
private  int c_num;
@Column(name="total_paid")
private  int npaid;
@Column(name="total_bill")
private  int n_bill;
public user() {
	this.abill = 0;
	this.bbill = 0;
	this.cbill = 0;
	this.otbill = 0;
	this.otid = 0;
	this.a_id = 0;
	this.b_id = 0;
	this.c_num = 0;
	this.npaid = 0;
	this.n_bill = 0;

}
public user(int abill, int bbill, int cbill, int otbill, int otid, int a_id, int b_id, int c_num, int npaid,
		int n_bill, String sign_FName) {

	this.abill = abill;
	this.bbill = bbill;
	this.cbill = cbill;
	this.otbill = otbill;
	this.otid = otid;
	this.a_id = a_id;
	this.b_id = b_id;
	this.c_num = c_num;
	this.npaid = npaid;
	this.n_bill = n_bill;
}
@Override
public String toString() {
	return "user [abill=" + abill + ", bbill=" + bbill + ", cbill=" + cbill + ", otbill=" + otbill + ", otid=" + otid
			+ ", a_id=" + a_id + ", b_id=" + b_id + ", c_num=" + c_num + ", npaid=" + npaid + ", n_bill=" + n_bill
			+ "]";
}
public int getAbill() {
	return abill;
}
public void setAbill(int abill) {
	this.abill = abill;
}
public int getBbill() {
	return bbill;
}
public void setBbill(int bbill) {
	this.bbill = bbill;
}
public int getCbill() {
	return cbill;
}
public void setCbill(int cbill) {
	this.cbill = cbill;
}
public int getOtbill() {
	return otbill;
}
public void setOtbill(int otbill) {
	this.otbill = otbill;
}
public int getOtid() {
	return otid;
}
public void setOtid(int otid) {
	this.otid = otid;
}
public int getA_id() {
	return a_id;
}
public void setA_id(int a_id) {
	this.a_id = a_id;
}
public int getB_id() {
	return b_id;
}
public void setB_id(int b_id) {
	this.b_id = b_id;
}
public static int getC_id() {
	return c_id;
}
public static void setC_id(int c_id) {
	user.c_id = c_id;
}
public int getC_num() {
	return c_num;
}
public void setC_num(int c_num) {
	this.c_num = c_num;
}
public int getNpaid() {
	return npaid;
}
public void setNpaid(int npaid) {
	this.npaid = npaid;
}
public int getN_bill() {
	return n_bill;
}
public void setN_bill(int n_bill) {
	this.n_bill = n_bill;
}

}

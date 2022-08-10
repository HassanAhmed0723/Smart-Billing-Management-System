package application;


import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.robot.Robot;
import javafx.stage.Stage;


public class control {
	
	private Stage stage;
	private Scene scene;
	private Robot root;
	
	@FXML
	private TextField elecbill;
	@FXML
	private TextField gasbill;
	@FXML
	private TextField phonebill;
	@FXML
	private TextField otherbill;
	@FXML
	private TextField ebid;
	@FXML
	private TextField gbid;
	@FXML
	private TextField phbid;
	@FXML
	private TextField obid;
	@FXML
	private TextField S_fname;
	@FXML
	private TextField S_lname;
	@FXML
	private TextField S_addr;
	@FXML
	private TextField S_cnum;
	@FXML
	private TextField S_email;
	@FXML
	private TextField S_crednum;
	@FXML
	private TextField T_budget;
	
	@FXML
	private Button exbutton;
	@FXML
	private AnchorPane scenePane;
	@FXML
	private Label myLabel;
	
	@FXML
	TextField t1;
	@FXML
	TextField t2;
	@FXML
	TextField t3;
	
	@FXML
	TextField budgbid1;
	@FXML
	TextField budgbid2;
	@FXML
	TextField budgbid3;
	@FXML
	TextField budgbid4;
	
	
	@FXML
	TextField budg1;
	@FXML
	TextField budg2;
	@FXML
	TextField budg3;
	@FXML
	TextField budg4;
	@FXML
	Label budg_lab;
	@FXML
	Label loan_lab;
	@FXML
	Label signup_succ;
	
	@FXML
	TextField trans1;
	@FXML
	TextField trans2;
	@FXML
	TextField trans3;
	@FXML
	TextField trans4;
	
	user obj1=new user();
	
	static int ebill,gbill,phbill,other,eid,gid,pid,oid,t_bills,Sign_Connum,Sign_Crednum,Total_Budget;
	static int S_pass = 444;
	static String Sign_FName,Sign_LName,Sign_Addr,Sign_Email;
	static double service_charges,Total_Bill;
	static double servicecharges = 0.25;
	
	public void Atapp(ActionEvent event) throws IOException{
		
		Parent root = FXMLLoader.load(getClass().getResource("intro.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("app1.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
	}
	
	public void Aboutus(ActionEvent event) throws IOException{
		
		Parent root = FXMLLoader.load(getClass().getResource("aboutus.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("app1.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
	}

	public void login(ActionEvent event) throws IOException{
		
		Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("app1.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
	}
	
	public void userdashb(ActionEvent event) throws IOException{
		
		Parent root = FXMLLoader.load(getClass().getResource("userdash.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
	}
	
	public void generatebudgetpl(ActionEvent event) throws IOException{
		
		Parent root = FXMLLoader.load(getClass().getResource("budgetpl.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("app1.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
	}
	
	public void budgetplan(ActionEvent event) throws IOException{
		
		Total_Budget = Integer.parseInt(T_budget.getText());
		System.out.println("User Budget: " + Total_Budget);
		if(Total_Budget < 400)
		{
			budg_lab.setText("Budget Insufficient");
		}
		else if(Total_Budget > 500)
		{
			budg_lab.setText("Budget Sufficient");
			
			budgbid1.setText("1");
			budgbid2.setText("2");
			budgbid3.setText("3");
			budgbid4.setText("4");
			
			budg1.setText("200");
			budg2.setText("300");
			budg3.setText("300");
			budg4.setText("200");
		}
		
	}
	
	public void transactionhistory(ActionEvent event) throws IOException{
		
		Parent root = FXMLLoader.load(getClass().getResource("transacthist.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("app1.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
	}
	

	public void generatetransachist(ActionEvent event) throws IOException{
			
			trans1.setText("200");
			trans2.setText("300");
			trans3.setText("300");
			trans4.setText("200");		
	}
	
	public void setreminder(ActionEvent event) throws IOException{
		
		Parent root = FXMLLoader.load(getClass().getResource("reminders.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("app1.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
	}
	
	public void getloan(ActionEvent event) throws IOException{
		
		Parent root = FXMLLoader.load(getClass().getResource("loan.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("app1.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
	}
	
	public void setLoan(ActionEvent event) throws IOException{
		loan_lab.setText("Loan Granted: Rs 1000");
		
	}
	
	public void signup(ActionEvent event) throws IOException{
		
		Parent root = FXMLLoader.load(getClass().getResource("signup.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("app1.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
	}
	
	public void signupsub(ActionEvent event) throws IOException{
		Sign_FName = S_fname.getText();
		System.out.println("First Name: " + Sign_FName);
		Sign_LName = S_lname.getText();
		System.out.println("Last Name: " + Sign_LName);
		Sign_Addr = S_addr.getText();
		System.out.println("Address: " + Sign_Addr);
		Sign_Email = S_email.getText();
		System.out.println("Email: " + Sign_Email);
		System.out.println("Password: " + S_pass);
		Sign_Connum = Integer.parseInt(S_cnum.getText());
		System.out.println("Contact Number: " + Sign_Connum);
		Sign_Crednum = Integer.parseInt(S_crednum.getText());
		System.out.println("Credit Card Number: " + Sign_Crednum);
		
		signup_succ.setText("Successfull !!");
		
	}
	
	public void Mmenu(ActionEvent event) throws IOException{
		
		Parent root = FXMLLoader.load(getClass().getResource("front.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
	}
	
	public void switch1(ActionEvent event) throws IOException{
		
		Parent root = FXMLLoader.load(getClass().getResource("scene1.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("app1.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
	}
	
	public void switch2(ActionEvent event) throws IOException{
		
		eid = Integer.parseInt(ebid.getText());
		obj1.setB_id(eid);
		System.out.println("Electricity Bill ID: " + obj1.getB_id());
		
		ebill = Integer.parseInt(elecbill.getText());
		obj1.setBbill(ebill);
		System.out.println("Electricity Bill: " + obj1.getBbill());
		
		gid = Integer.parseInt(gbid.getText());
		obj1.setC_id(gid);
		System.out.println("Gas Bill ID: " + obj1.getC_id());
		
		gbill = Integer.parseInt(gasbill.getText());
		obj1.setC_id(gid);
		System.out.println("Gas Bill: " + obj1.getC_id());
		
		pid = Integer.parseInt(phbid.getText());
		obj1.setA_id(pid);
		System.out.println("Phone Bill ID: " + obj1.getA_id());
		
		phbill = Integer.parseInt(phonebill.getText());
		obj1.setAbill(phbill);
		System.out.println("Phone Bill: " + obj1.getAbill());
		
		oid = Integer.parseInt(obid.getText());
		obj1.setOtid(oid);
		System.out.println("Other Bill ID: " + obj1.getOtid());
		
		other = Integer.parseInt(otherbill.getText());
		obj1.setOtbill(other);
		System.out.println("Other Bills: " + obj1.getOtbill());
		
		t_bills = ebill+gbill+phbill+other;
		obj1.setN_bill(t_bills);
		System.out.println("Total Bills: " + obj1.getN_bill());
		
		Parent root = FXMLLoader.load(getClass().getResource("payment.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("app1.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
		
	}

	public void Infosetter(ActionEvent e)
	{ 	
		obj1.setB_id(eid); 
		obj1.setBbill(ebill);
		obj1.setC_id(gid);
		obj1.setA_id(pid);
		obj1.setAbill(phbill);
		obj1.setN_bill(t_bills);
		obj1.setOtbill(other);
		obj1.setOtid(oid);

		service_charges = (0.25 * obj1.getN_bill());
		System.out.println("Total Bill: " + obj1.getN_bill());
		t1.setText(String.valueOf(obj1.getN_bill()));
		System.out.println("Service Charges: " + service_charges);
		t2.setText(String.valueOf(service_charges));
		
		Total_Bill = service_charges + obj1.getN_bill();
		System.out.println("Total Bill: " + Total_Bill);
		t3.setText(String.valueOf(Total_Bill));
		
		//Hibernate Db
		Properties properties = new Properties();
		properties.setProperty(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
		properties.setProperty(Environment.HBM2DDL_AUTO,"update");
		properties.setProperty(Environment.DRIVER, "com.mysql.jdbc.Driver");
		properties.setProperty(Environment.USER, "root");
		properties.setProperty(Environment.PASS, "");
		properties.setProperty(Environment.URL, "jdbc:mysql://localhost:3306/userdb");
		Configuration cfg= new Configuration();
		cfg.setProperties(properties);
		cfg.addAnnotatedClass(user.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session= factory.openSession();
		try {
		Transaction tr=session.beginTransaction();

		//user s=new user(1,2,3,4,5,6,7,8,9,10);
		session.persist(obj1);
		System.out.println("saved");
				tr.commit();

		}catch(Exception e1){
		e1.printStackTrace();
		}finally {
		factory.close();
		session.close();
		}

	}
	
	public void switchpay(ActionEvent event) throws IOException{
		
		Parent root = FXMLLoader.load(getClass().getResource("pay.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("app1.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
	}
	
	public void exit(ActionEvent event) throws IOException{
		
		stage = (Stage) scenePane.getScene().getWindow();
		stage.close();
	}
	
}
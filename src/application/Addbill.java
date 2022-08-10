//addbill.java


package application;

public class Addbill {
    private int addbill_id;
    
   

	public int getAddbill_id() {
		return addbill_id;
	}

	public void setAddbill_id(int addbill_id) {
		this.addbill_id = addbill_id;
	}



public void addnewbill() {
 
        addbill_id = addbill_id + 1;
       setAddbill_id(addbill_id);
        
}
public void Userdetails( char name, int billid,int billamount) {
        
     
        System.out.println("Name: " + name);
        System.out.println("Bill ID: " + billid);
        System.out.println("Bill Amount: " + billamount);
        
    }

    


    
    


    
    
}



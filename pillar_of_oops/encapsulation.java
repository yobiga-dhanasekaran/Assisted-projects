package pillar_of_oops;
class account {
	private long account_no;
	private String name, email;
	private float amount;
	
	public long getAcc_no() {
		return account_no;
	}
	
	public void setAcc_no(long acc_no) {
		this.account_no = acc_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email= email;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
}
public class encapsulation {
	public static void main(String[] args) {
		
		account myAcc = new account();
		myAcc.setAcc_no(77549284L);
		myAcc.setName("Mr.Balaji");
		myAcc.setEmail("bk@gmail.com");
		myAcc.setAmount(10000f);
		System.out.println("Account No:" + myAcc.getAcc_no()+" \n"+"Account Name:"
                + myAcc.getName()+" \n"+"Account holder email:" + myAcc.getEmail()+"\n"
                + "Amount in Account:" + myAcc.getAmount());  
			
	}

}

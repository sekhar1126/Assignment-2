package Problem1;

class User{
	int id;
	String username;
	String email;
	double walletbalance;
	public User(int id, String username, String email, double walletbalance) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.walletbalance = walletbalance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getWalletbalance() {
		return walletbalance;
	}
	public void setWalletbalance(double walletbalance) {
		this.walletbalance = walletbalance;
	}
	boolean makepayment(double billamount) {
		if(billamount<=getWalletbalance()) {
			setWalletbalance( getWalletbalance()-billamount);
			return true;
			
		}else
			return false;
	}
}
class kycuser extends  User{
	int rewardpoints;
	public kycuser(int id,String username, String email, double walletbalance) {
		super(id,username,email,walletbalance);
	}
	public double getRewardpoints() {
		return rewardpoints;
	}
	public void setRewardpoints(double d) {
		 this.rewardpoints = this.rewardpoints+(int) d;
	}
	boolean makepayment(double billamount) {
		if(billamount<=getWalletbalance()) {
			setWalletbalance(getWalletbalance()-billamount);
			setRewardpoints(billamount*10/100);
			return true;
		}
		else return false;
	}
}
 class Epaywallet extends kycuser{

	public Epaywallet(int id, String username, String email, double walletbalance) {
		super(id, username, email, walletbalance);
		// TODO Auto-generated constructor stub
	}

	void processPaymentByser(User user,double billamount) {
		 if(makepayment(billamount)==true) {
			if(user.equals(user)) {
				
				System.out.println("Your wallet balance is: "+getWalletbalance());
			}
			else {
				System.out.println("Your wallet balance is: " +getWalletbalance());
				System.out.println("Your reawrd points is :"+getRewardpoints());
			}
			 
		 }
	 }
 }
	

public class EPay {

	public static void main(String[] args) {
		User k1=new User(101,"Jack","jack@dxc.com",1000);
		kycuser s1 = new kycuser(201,"jill","jil@dxc.com",3000);
		if(k1.makepayment(700)==true) {
		 System.out.println("Congratulations jack your paymrnt of rs.700 is successfull");
		 System.out.println("Your wallet balance is: "+k1.getWalletbalance());
		}
		if(s1.makepayment(1500)==true) {
			 System.out.println("Congratulations jill your paymrnt of rs.1500 is successfull");
			 System.out.println("Your wallet balance is: "+s1.getWalletbalance());
			 System.out.println("Your reward points is: "+s1.getRewardpoints());
		}
		if(s1.makepayment(800)==true) {
			 System.out.println("Congratulations jill your paymrnt of rs.800 is successfull");
			 System.out.println("Your wallet balance is: "+s1.getWalletbalance());
			 System.out.println("Your reward points is: "+s1.getRewardpoints());
		}
		if(s1.makepayment(1200)==true) {
			 System.out.println("Congratulations jill your paymrnt of rs.1200 is successfull");
			 System.out.println("Your wallet balance is: "+s1.getWalletbalance());
			 System.out.println("Your reward points is: "+s1.getRewardpoints());
			 
		}else
			 System.out.println("Sorry jill not enough balance to make payment");
		     System.out.println("Your wallet balance is: "+s1.getWalletbalance());
		     System.out.println("Your reward points is: "+s1.getRewardpoints());
		

	}

}

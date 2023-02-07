package Problem1;
 interface certification{
	 double regularcoursefee=2000;
	 double crashcoursefee=5000;
	 double claculatefee();
 }
class RRTechnicalCertification  {
	String studentname;
	String coursename;
	int registrationid;
	int admissiontestmarks;
	static int counter;
	static {
		counter =1000;
	}
	public RRTechnicalCertification(String studentname, String coursename, int admissiontestmarks) {
		super();
		this.studentname = studentname;
		this.coursename = coursename;
		
		this.admissiontestmarks = admissiontestmarks;
		
	}
	public String getStudentname() {
		return studentname;
	}
	
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public int getRegistrationid() {
		return registrationid;
	}
	public void setRegistrationid(int registrationid) {
		this.registrationid = registrationid;
	}
	public int getAdmissiontestmarks() {
		return admissiontestmarks;
	}
	public void setAdmissiontestmarks(int admissiontestmarks) {
		this.admissiontestmarks = admissiontestmarks;
	}
	 void generateregistrationid(){
		this.registrationid= + ++counter;
		System.out.println("Registration id      :"+this.registrationid);
	}
	double calculatefee(){
		return 0.0;
		
		
	}
	
	
}
class RegularCourseCertification extends RRTechnicalCertification implements certification{
	int courseduration;

	public RegularCourseCertification(String studentname, String coursename,int admissiontestmarks,int courseduration) {
		super(studentname, coursename,admissiontestmarks);
		this.courseduration=courseduration;
	}
	RRTechnicalCertification rrt;
	public int getCourseduration() {
		return courseduration;
	}

	public void setCourseduration(int courseduration) {
		this.courseduration = courseduration;
	}
	 void generateregistrationid(){
			this.registrationid= + ++counter;
			System.out.println("Registration id      :"+this.registrationid);
		}
	 double calculatefee() {
		 double fee=getCourseduration()* regularcoursefee;
		 if(admissiontestmarks>=90) {
				return fee- fee*0.1 ;
			}else if(admissiontestmarks>=75&&admissiontestmarks<=89) {
				return fee-fee*0.05;
		}
			return fee;
			
	 }
	
}
class CrashCourseCertification extends RRTechnicalCertification implements certification{
	public CrashCourseCertification(String studentname,String coursename, int admissiontestmarks) {
		super(studentname,coursename,admissiontestmarks);
		
	}
	 void generateregistrationid(){
			this.registrationid= + ++counter;
			System.out.println("Registration id      :"+this.registrationid);
		}
	 
	 double calculatefee() {
		 double fee=crashcoursefee;
		 if(admissiontestmarks>=90) {
				return fee-fee*0.1 ;
			}else if(admissiontestmarks>=75&&admissiontestmarks<=89) {
				return fee-fee*0.05;
		}
			return fee;
	 }
}

public class coursecertification {

	public static void main(String[] args) {
		RegularCourseCertification k = new RegularCourseCertification("Rakesh","J2EE",85,5);
		CrashCourseCertification s=new CrashCourseCertification("Roshan","Amgular",71);
		System.out.println("RegularCourseCertification Details");
		System.out.println("***********************************");
		System.out.println("Student name     : "+k.getStudentname());
		System.out.println("Course  name     : "+k.getCoursename());
		System.out.println("Course Duration  : "+k.getCourseduration()+"months");
		k.generateregistrationid();
		double fee=k.calculatefee();
		System.out.println("fee              : "+fee);
		System.out.println("crashCourseCertification Details");
		System.out.println("***********************************");
		System.out.println("Student name     : "+s.getStudentname());
		System.out.println("Course  name     : "+s.getCoursename());
		System.out.println("Course Duration  :  2 months");
		s.generateregistrationid();
		double tax=12.36;
		double crashfee=s.calculatefee()+(tax*s.calculatefee()/100);
		System.out.println("fee              : "+crashfee);
		
	}
}

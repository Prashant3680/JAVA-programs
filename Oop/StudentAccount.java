import java.util.Scanner;
class StudentAccount
{
 public static void main(String[] a)
 {

	Profile p1=new Profile();
	p1.userId="S1";
	p1.name="Sahil";
	p1.degree="BTECH";
	p1.stream="CS";
	p1.YOP=2025;
	p1.degreePerc=85.55;
	p1.contactNo=1234567890l;
	
	p1.displayProfile();


	Profile p2=new Profile();
	p1.userId="S2";
	p1.name="Jay";
	p1.degree="BTECH";
	p1.stream="CS";
	p1.YOP=2024;
	p1.degreePerc=83.23;
	p1.contactNo=1023456789l;


	Profile p3=new Profile();
	p1.userId="S3";
	p1.name="Ketan";
	p1.degree="BCA";
	p1.stream="BCA";
	p1.YOP=2025;
	p1.degreePerc=87.44;
	p1.contactNo=9012345678l;


	Profile p4=new Profile();
	p1.userId="S4";
	p1.name="Girish";
	p1.degree="BCA";
	p1.stream="BCA";
	p1.YOP=2024;
	p1.degreePerc=89.23;
	p1.contactNo=8901234567l;	
	

 }

}
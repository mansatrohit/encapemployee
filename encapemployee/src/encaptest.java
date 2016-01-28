import java.util.Scanner;
public class encaptest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    employee obj = new employee();
    Scanner in = new Scanner(System.in);
    int id1,age1;
    String Name;
    System.out.println("Enter The  Employee Name :");
   // System.out.println();
    Name = in.next();
    System.out.println("Enter The  Employee Age :");
    //System.out.println();
    age1 = in.nextInt();
    System.out.println("Enter The  Employee ID :");
    //System.out.println();
    id1 = in.nextInt();
    obj.setEmpName(Name);
    obj.setEmpAge(age1);
    obj.setId(id1);
    System.out.println("Employee Name :"+obj.getEmpName());
    System.out.println("Employee Age :"+obj.getEmpAge());
    System.out.println("Employee ID :"+obj.getId());
    }

}

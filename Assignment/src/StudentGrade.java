import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student ID");
		int sid=sc.nextInt();
		System.out.println("Enter student name");
		String name=sc.next();
		sc.nextLine();
		//char name=sc.next().charAt(0);
		//sc.nextLine();
		System.out.println("Enter student fees");
		int fees=sc.nextInt();
		System.out.println("Enter student marks");
		int marks=sc.nextInt();
		
		if(marks>80 && marks< 100){
			System.out.println("GRADE IS :A");
		}
	
		else	if(marks>60 && marks<81){
				System.out.println("GRADE IS :B");
			}
			
			else	if(marks>50 && marks< 59){
					System.out.println("GRADE IS : C");
				}
			
			else if(marks<50){
					System.out.println("GRADE IS : FAIL");
					}	
		
		//System.out.println(marks);
				
	}

}

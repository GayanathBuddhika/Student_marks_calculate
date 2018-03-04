import java.util.*;
class StudentMark{
  public static void main(String arg[]){
    Scanner input=new Scanner(System.in);
     int mark[]=new int[10];
     System.out.println("Input student Marks");
     for(int i=0;i<mark.length;i++){
		 System.out.print("Student "+(i+1)+" : ");
		 mark[i]=input.nextInt();

		 }
  }


}

import java.util.*;
class StudentMark{
  public static void main(String arg[]){
     int mark[]=new int[10];
     input_mark(mark);
     total(mark);
     avarage(mark);
  }
  
  public static void input_mark(int mark[]){
	  Scanner input=new Scanner(System.in);
	  System.out.println("Input student Marks");
	  for(int i=0;i<mark.length;i++){
			 System.out.print("Student "+(i+1)+"\t: ");
			 mark[i]=input.nextInt();

	  }
	  
	  
  }
 
  
  public static void total(int mark[]){
	  int sum=0;
	  for(int i=0;i<mark.length;i++){
		  sum+=mark[i];
		  
		  }
	  System.out.println("Totalt fo the Sudents Mark\t:"+sum);
	  }

 
  public static void avarage(int mark[]){
	  int sum=0;
	  int avg=0;
	  for(int i=0;i<mark.length;i++){
		  sum+=mark[i];
		  
		  }
		
	  avg=sum/mark.length;
	  System.out.println("Avarage fo the Sudents Mark\t:"+avg);
	  }

}

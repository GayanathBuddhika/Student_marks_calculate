package studentmark;
import java.util.*;

class StudentMark{
    public static void main(String arg[]){
        int mark[]=new int[10];
        input_mark(mark);
     
        System.out.println("");
        System.out.println("  Total , Avarage , max and Minimum value of the Student Marks");
        System.out.println("...............................................................");
        System.out.println("");
     
        total(mark);
        avarage(mark);
        find_max(mark);
        find_min(mark);
     
        System.out.println("");
        System.out.println("           Find the Student Index of a Student Mark");
        System.out.println("................................................................");
     
        find_index(mark);
    }
  
    public static void input_mark(int mark[]){
        Scanner input=new Scanner(System.in);
    
        System.out.println("Input Student Marks");
        System.out.println("");
    
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
        System.out.println("Total of the Students Marks\t\t: "+sum);
    }

 
    public static void avarage(int mark[]){
        int sum=0;
        double avg=0;
        for(int i=0;i<mark.length;i++){
            sum+=mark[i];
        }
		
        avg=sum/mark.length;
        System.out.println("Avarage of the Students Marks\t\t: "+avg);
    }
	  
	  
    public static void find_max(int mark[]){
        int max=0;
        for(int i=0;i<mark.length;i++){
            if(mark[i]>max){
                max=mark[i];
            }
        }
        System.out.println("Max Mark of the Students Marks\t\t: "+max);
    }

 
    public static void find_min(int mark[]){
        int min=mark[0];
        for(int i=0;i<mark.length;i++){
            if(mark[i]<min){
                min=mark[i];
            }
        }
        System.out.println("Minimum Mark of the Students Marks\t: "+min);
    }

    public static void find_index(int mark[]){
        int index=-1;
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter Mark\t: ");
        int st_mark=input.nextInt();
        System.out.println("");
        for(int i=0;i<mark.length;i++){
            if(mark[i]==st_mark){
                index=i+1;
                System.out.println("Student Index\t: "+index);
            }
        }
        System.out.println("All of these student are get "+st_mark+" mark");
        System.out.println("");
    }
}

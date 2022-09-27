import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    static ArrayList<Integer> nums = new ArrayList<>();
    static ArrayList<Integer> nums1 = new ArrayList<>();
    static ArrayList<Integer> nums2 = new ArrayList<>();
    static ArrayList<Integer> nums3 = new ArrayList<>();
    static ArrayList<Integer> nums4 = new ArrayList<>();
    static int total;
     public static void main(String[] args) {
        

        for (int i=1;i<=1;i++){
            System.out.println("Enter your Grade in Math: ");
            int b= new Scanner(System.in).nextInt();
            
            nums.add(b);

        }
        for (int i=1;i<=1;i++){
            System.out.println("Enter your Grade in English: ");
            int b = new Scanner(System.in).nextInt();
            
            nums1.add(b);

        }

        for (int i=1;i<=1;i++){
            System.out.println("Enter your Grade in Chemistry: ");
            int b = new Scanner(System.in).nextInt();
            
            nums2.add(b);

        }
        for (int i=1;i<=1;i++){
            System.out.println("Enter your Grade in Algebra: ");
            int b = new Scanner(System.in).nextInt();
            
            nums3.add(b);

        }
        for (int i=1;i<=1;i++){
            System.out.println("Enter your Grade in Geometry: ");
            int b = new Scanner(System.in).nextInt();
            
            nums4.add(b);

        }


        for (int j=0;j<nums.size();j++){
            total+=nums.get(j);

        }
        
        for (int j=0;j<nums1.size();j++){
            total+=nums1.get(j);

        }
        for (int j=0;j<nums2.size();j++){
            total+=nums2.get(j);

        }
        for (int j=0;j<nums3.size();j++){
            total+=nums3.get(j);

        }
        for (int j=0;j<nums4.size();j++){
            total+=nums4.get(j);

        }
        
     
        System.out.println(" Your Grades in Math: " + nums );
        System.out.println(" Your Grades in English: " + nums1 );
        System.out.println(" Your Grades in Chemistry: " + nums2 );
        System.out.println(" Your Grades in Algebra: " + nums3 );
        System.out.println(" Your Grades in Geometry: " + nums4 );
        System.out.println("");
        System.out.println("Your total grade is: "+ total);
        System.out.println("");
        System.out.println("The average of your grades:  "+ total/5);
        System.out.println("");
        
     {
        
    }

}
}
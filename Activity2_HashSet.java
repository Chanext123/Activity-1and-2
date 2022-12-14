import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Activity2_HashSet{

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        Character choice, clear;
    
        Set<Integer> hashset = new HashSet<Integer>();
        


        while(true){
           
            System.out.println("SELECT DOWN BELOW OF YOUR CHOICE ");
            System.out.println("");
            System.out.println("A. Add number");
            System.out.println("B. Remove number");
            System.out.println("C. Display numbers");
            System.out.println("D. Clear number");
            System.out.println("E. Exit");
            System.out.println("");
            System.out.print("YOUR CHOICE: ");
            choice = input.next().charAt(0);
            choice = Character.toLowerCase(choice);
            System.out.println("");
            System.out.println("");

            switch(choice){
                case 'a':
                    System.out.print("Add your number to add here: ");
                    int add = input.nextInt();
                    System.out.println("");
                

                    if(hashset.contains(add)){
                        System.out.println("The value " + add + " is already exists.");
                         System.out.println("");
                    }
                    else{
                        hashset.add(add);
                        System.out.println("Number " + add + " is successfully added to the HashSet!");
                        System.out.println("");
                    }

                    break;
                    
                case 'b':
                    System.out.print("What number do you want to remove?: ");
                    int remove = input.nextInt();
                    System.out.println("");

                    if(hashset.contains(remove)){
                        hashset.remove(Integer.valueOf(remove));
                        System.out.println("Number " + remove + " is removed! successfully");
                        System.out.println("");
                        break;
                    }

                    break;

                case 'c':
                    
                    

                    System.out.println("The ArrayList you added curently: ");

                    Iterator<Integer> it_set = hashset.iterator();
                    while(it_set.hasNext()){
                        System.out.println(it_set.next());
                        System.out.println("");
                    }

                    break;

                case 'd':

                    System.out.print("Are you sure you want to clear contents?(y/n): ");
                    clear = input.next().charAt(0);
                    clear = Character.toLowerCase(clear);
                    switch(clear){
                        case 'y':
                            hashset.clear();
                            System.out.println("HashSet Cleared Succesfully!");
                            break;
                        case 'n':
                            System.out.println("HashSet failed to clear its contents.");
                            break;
                    }
                    break;
                case 'e':
                    input.close();
                    System.exit(0);
                default:
                System.out.println("-----------------------------------------");
                System.out.println("Select properly from the choices (A)/(B): ");
                System.out.println("-----------------------------------------");
                System.out.println("");

            
            }

        }
    }
}
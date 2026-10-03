import java.util.*;
public class Hackathon1_3B 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter total waste collected(kg)=");
        int waste= sc.nextInt();    
        if(waste>=100)
        {
            System.out.println("Total waste collected is="+waste);
            System.out.println("Collected target of waste has been achieved");
        }
        else
        {
            System.out.println("More collection of waste is required to achieve the target");
        }
        sc.close();
    }
}

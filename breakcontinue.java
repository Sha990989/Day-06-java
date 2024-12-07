import java.util.*;
public class breakcontinue
{
public static void main(String args[])
{
    System.out.println("break example:");
    for(int i=0;i<5;i++)
    {
        if(i==2)
        {
            break;
        }   
        System.out.println(i);
    
    }
    System.out.println("continue exmaple:");
    for(int j=0;j<5;j++)
    {
        if(j==2)
        {
            continue;
        }
        System.out.println(j);
    }
}
}
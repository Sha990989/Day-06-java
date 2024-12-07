import java.util.*;
public class staticarray
{
public static void main(String args[])
{
    //intialization of array;
    int arr[]={22,34,45,17};
    System.out.println(Arrays.toString(arr));
    //Accessing of array:
    System.out.println(arr[2]);
    System.out.println(arr[1]);
    //Modification of array:
    arr[0]=78;
    arr[3]=29;
    System.out.println(Arrays.toString(arr));
}
}
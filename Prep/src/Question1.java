import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {


                Scanner sc=new Scanner(System.in);
                int arr[]= {11,23,-3,3,-5,-32,45,2,-2,14};
                int mid;
                int arr2[]=new int[0];
                for(int i=0;i<arr.length;i++)
                {
                    if(arr[i]>=0)
                    {
                        int temp[]=new int[arr2.length+1];
                        for(int j=0;j<arr2.length;j++)
                        {
                            temp[j]=arr2[j];
                        }
                        temp[temp.length-1]=arr[i];
                        arr2=temp;
                    }
                }
                if(arr2.length%2==0)
                {
                    System.out.print("The Middle element after reducing the array is: "+arr2[(arr2.length-1)/2]);
                }
                else
                {
                    System.out.print("The Middle element after reducing the array is: "+arr2[arr2.length/2]);
                }
            }


}

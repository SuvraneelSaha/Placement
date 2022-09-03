import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]= {100,256,421,867,308};
        int arr2[]=new int[0];
        for(int i=0;i<arr.length;i++)
        {
            double root=Math.pow(arr[i],0.5);
            if(root==(int)root)
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
        System.out.println("The array after removing non-perfect squares is: ");
        for(int k=0;k<arr2.length;k++)
        {
            System.out.print(arr2[k]+" ");
        }
    }
}

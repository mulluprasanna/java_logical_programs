import java.util.Scanner;
class Product
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Product name :");
        String pname=sc.next();
        System.out.println("Enter the Product number :");
        int pno=sc.nextInt();
        System.out.println("Enter the Product cost :");
        float pcost=sc.nextFloat();
        System.out.println("Enter the Product quantity :");
        float pqnt=sc.nextFloat();
        Float Bill=pcost*pqnt;
        System.out.println("Product Name:"+pname);
        System.out.println("Product Number:"+pno);
        System.out.println("Product Price:"+pcost);
        System.out.println("Product Quantity:"+pqnt);
        System.out.println("Total Bill :"+Bill);

     }
}
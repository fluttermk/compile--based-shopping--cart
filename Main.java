import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ProductManager p1=new ProductManager();
        while(true){
            System.out.println("_______________ Menu _______________");
            System.out.println("1)Add the product");
            System.out.println("2)update details");
            System.out.println("3)update quantity");
            System.out.println("4)delete Product");
            System.out.println("5)Add item in cart");
            System.out.println("6)Delete item in cart");
            System.out.println("7)view Cart");
            System.out.println("8)viewProducts");
            System.out.println("9)close");
            System.out.print("Enter the choice:");
            int choice=sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:{
                    System.out.print("Enter the productname:");
                    String pname=sc.nextLine();

                    System.out.print("Enter the productid:");
                    String pid=sc.nextLine();

                    System.out.print("Enter the price:");
                    int pprice=sc.nextInt();

                    System.out.print("Enter the quantity:");
                    int pquantity=sc.nextInt();

                    Product p=new Product(pid, pname, pprice, pquantity);
                    p1.addproduct(p);
                    break;
                }
                case 2:{
                    System.out.print("Enter Productid:");
                    String productid=sc.nextLine();

                    System.out.print("Enter new Productname:");
                    String productname=sc.nextLine();

                    System.out.print("Enter new Price:");
                    int pprice=sc.nextInt();

                    p1.updatedetails(productid, productname, pprice);
                    break;

                    
                }
                case 3:{
                    System.out.print("Enter Productid:");
                    String productid=sc.nextLine();

                    System.out.print("Enter new quantity:");
                    int pquantity=sc.nextInt();

                    p1.updatequantity(productid,pquantity);
                    break;
                }
                case 4:{
                    System.out.print("Enter Productid:");
                    String productid=sc.nextLine();

                    p1.deleteproduct(productid);
                    break;
                }
                case 5:{
                    System.out.print("Enter Productid:");
                    String productid=sc.nextLine();

                    p1.Addproduct_cart(productid);
                    break;
                }
                case 6:{
                    System.out.print("Enter Productid:");
                    String productid=sc.nextLine();

                    p1.deleteproduct_cart(productid);
                    break;
                    
                }
                case 7:{
                    p1.viewcart();
                    break;
                }
                case 8:{
                    p1.viewproduct();
                    break;
                }
                case 9:{
                    System.out.println("Thank you for visiting........");
                    sc.close();
                    System.exit(0);
                }
                default:{
                    System.out.println("Invalid option");
                    
                }
            }



        }
    }
}

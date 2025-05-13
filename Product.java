public class Product{
    private String Productid;
    private String productname;
    private int price;
    private int quantity;
    Product(String pid,String pname,int pprice,int pquantity){
        this.Productid=pid;
        this.productname=pname;
        this.price=pprice;
        this.quantity=pquantity;

    }
        public String getproductid(){
            return this.Productid;
        }
        public String getproductname(){
            return this.productname;
        }
        public int getprice(){
            return this.price;
        }
        public int getquantity(){
            return this.quantity;
        }
        
public void setproductname(String pname){
    this.productname=pname;

}
public void setprice(int pprice){
    this.price=pprice;

}

public void setquantity(int pquantity){
    this.quantity=pquantity;

}

public int total(){
  int sum=0;
  sum+=price*quantity;
  return sum;
}

public void Productdetail(){
    System.out.println("___________ Product Details ____________");
    System.out.println("Product Name  :"+this.productname);
    System.out.println("Product Id    :"+this.Productid);
    System.out.println("Product Price :"+this.price);
    System.out.println("Quantity      :"+this.quantity);
    System.out.println("Total         :"+total());
    System.out.println("_________________________________________");
}

}
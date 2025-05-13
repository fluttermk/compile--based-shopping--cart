import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> products=new ArrayList<>();
    private List<Product> cart=new ArrayList<>();
    public void addproduct(Product p){
        products.add(p);
        System.out.println("New product is Added");
    }
    public Product getproductid(String index){
        for(Product p:products){
            if(p.getproductid().equalsIgnoreCase(index)){
                return p;
            }
        }
        return null;
    }
    public void updatedetails(String index,String pname,int pprice){
           Product p=getproductid(index);
           if(p!=null){
            p.setproductname(pname);
            p.setprice(pprice);
            System.out.println("The product details are updated");
           }
           else{
            System.out.println("The Product details are not updated");
           }
    }
    public void updatequantity(String index,int price){
        Product p=getproductid(index);
        if(p!=null){
          p.setquantity(price);
          System.out.println("The quantity is updated");
        }else{
            System.out.println("The quantity is not updated");
        }

    }
      public void deleteproduct(String index){
        Product p=getproductid(index);
        if(p!=null){
            products.remove(p);
            cart.remove(p);
            System.out.println("product is removed successfully");

        }
        else{
            System.out.println("Product is not removed ");
        }
    }

    public void Addproduct_cart(String index){
        Product p=getproductid(index);
       if (cart.contains(p)) {
    System.out.println("Product already in cart.");
} else {
    cart.add(p);
    System.out.println("Product added to cart.");
}

 

    }
       public void deleteproduct_cart(String index){
        Product p=getproductid(index);
        if(p!=null){
            cart.remove(p);
            System.out.println("product is removed for the cart");

        }
        else{
            System.out.println("Product is not removed for the cart");
        }
        
    }

    public void viewcart(){
        if(cart.isEmpty()){
            System.out.println("The Cart is Empty");
        }
        else{
            for(Product p:cart){
                p.Productdetail();
            }
        }
    }
    public void viewproduct(){
        if(products.isEmpty()){
            System.out.println("No products are Availabe");
        }
        else{
            for(Product p:products){
                p.Productdetail();
            }
        }
    }
    
}

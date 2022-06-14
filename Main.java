import java.util.*;
import java.text.NumberFormat;

class Main {
  public static void main(String[] args) {

    int randomQuantity = (int)(Math.random()*4+3);
    /*
    Product product1 = new Product();
    Electronics electronic1 = new Electronics();
    Media media1 = new Media();
    Clothing clothing1 = new Clothing();
    Men men1= new Men();
    Women women1 = new Women();


    System.out.println(product1 + "\n");
    System.out.println(electronic1 + "\n");
    System.out.println(media1+ "\n");
    System.out.println(clothing1+ "\n");
    System.out.println(men1+ "\n");
    System.out.println(women1+ "\n");
    */


  
    Product product2 = new Product( 1.00, "Walmart   ", "Knife", (int)(Math.random()*4+3));
    Electronics electronic2 = new Electronics(4.50, "Apple     ", "EarBuds", (int)(Math.random()*4+3), false, 100);
    Media media2 = new Media(3.00, "Google     ", "Youtube", (int)(Math.random()*4+3), "Music");
    Clothing clothing2 = new Clothing(10.33, "Marshalls", "Shirt", (int)(Math.random()*4+3), "Polo", 3);
    Men men2= new Men(10.45, "Marshalls", "Jeans", (int)(Math.random()*4+3), "Levis", 4, false);
    Women women2 = new Women(12.75, "Marshalls", "Coat", (int)(Math.random()*4+3), "North Face", 4, "Red" );

    Product[] productsss = new Product[6];
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    productsss[0] = product2;
    productsss[1] = electronic2;
    productsss[2] = media2;
    productsss[3] = clothing2;
    productsss[4] = men2;
    productsss[5] = women2;

    for( Product i : productsss)
      {
        System.out.println(i + "\n________________________________");
      }

    System.out.println("\n***************************reciept***************************");

    System.out.println("Name\t\t\tComapany\t\tQuantity\tPrice\t\tTotal Cost");
    System.out.println("*************************************************************");
    for( Product i : productsss)
      {
        System.out.println(i.getName() + "\t\t\t" + i.getCompany() + "\t\t\t" + i.getQuantity() + "\t\t$" + i.getPrice() + "\t\t\t" + nf.format(productCost(i)));
      }
    System.out.println("*************************************************************\n");
    System.out.println("Grand Total " + nf.format(grandTotal(productsss)) + "\n");
    System.out.println("*************************************************************\n");
    

 
  }

  public static double productCost(Product p)
  {
    double quan = (double)(p.getQuantity());
    double cost = (double)(p.getPrice());

    double total = (double)(quan*cost);

    return total;  
  }

  public static double grandTotal(Product[] d)
  {
    double total = 0.0;
    for( Product i : d)
      {
        total += (double)(productCost(i));
      }

    return total;
  }

}
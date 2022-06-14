import java.util.*;

class Product{

  private double price;
  private String company;
  private String name;
  private int quantity;

  public Product (double p, String c, String n, int q)
  {
    price = p;
    company = c;
    name = n;
    quantity = q;
  }

  public Product()
  {
    price = 0.0;
    company = "null";
    name = "null";
    quantity = (int) ((Math.random()*4)+3);
    
  }

  public double getPrice()
  {
    return price;
  }

  public String getCompany()
  {
    return company;
  }

  public String getName()
  {
    return name;
  }

  public int getQuantity()
  {
    return quantity;
  }

  public void setPrice(double p)
  {
    price = p;
  }

  public void setCompany(String s)
  {
    company = s;
  }

  public void setName(String n)
  {
    name = n;
  }

  public void setQuantity(int x)
  {
    quantity = x;
  }


  public String toString()
  {
    String s = "";

    s+= "Product\n" + "$" + price + "\nCompany: "  + company + "\nName: " + name + "\nQuantity: " + quantity;

    return s;
  }
}
import java.util.*;

class Clothing extends Product{

  private String brand;
  private int size;
  
  public Clothing (double p, String c, String n, int q, String b, int s)
  {
    super(p, c, n, q);
    setBrand(b);
    setSize(s);
  }

  public Clothing()
  {
    super();
    setBrand("null");
    setSize(0);
  }

  public String getBrand()
  {
    return brand;
  }

  public int getSize()
  {
    return size;
  }

  public void setBrand(String s)
  {
    brand = s;
  }

  public void setSize(int i)
  {
    size = i;
  }

  public String toString()
  {
    String s = "";
    s += "Clothing\n" + super.toString() + "\nBrand: " + brand + "\nSize: " + size;
    return s;
  }


















  
}
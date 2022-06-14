import java.util.*;

class Women extends Clothing{

  private String color;

  public Women (double p, String c, String n, int q, String b, int s, String l)
  {
    super(p, c, n, q, b, s);
    setColor(l);
  }

  public Women()
  {
    super();
    setColor("null");
  }

  public String getColor()
  {
    return color;
  }

  public void setColor(String c)
  {
    color = c;
  }

  public String toString()
  {
    String s = "";
    s += "Women\n" + super.toString() + "\nColor:  " + color;
    return s;
  }


















  
}
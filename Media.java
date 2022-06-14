import java.util.*;

class Media extends Product{

  private String type;

  public Media(double p, String c, String n, int q, String t)
  {
    super(p, c, n, q);
    setType(t);
  }

  public Media()
  {
    super();
    setType("null");
  }
  public String getType()
  {
    return type;
  }

  public void setType(String s)
  {
    type = s;
  }

  public String toString()
  {
    String s = "";
    s += "Media\n" + super.toString() + "\nType: " + type;
    return s;
  }
  
}
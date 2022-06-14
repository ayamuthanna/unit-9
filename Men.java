import java.util.*;

class Men extends Clothing{

  
    private boolean hasPockets;


    public Men(double p, String c, String n, int q, String b, int s, boolean h)
    {
      super(p, c, n, q, b, s);
      setHasPockets(h);
    }

    public Men()
  {
    super();
    setHasPockets(false);
  }

    public boolean getPockets()
    {
      return hasPockets;
    }

    public void setHasPockets(boolean b)
    {
      hasPockets = b;
    }

      public String toString()
  {
    String s = "";
    s += "Men\n" + super.toString() + "\nDoes it have pockets?: " + hasPockets;
    return s;
  }
    
  }
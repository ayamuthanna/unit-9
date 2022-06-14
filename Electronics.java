import java.util.*;

class Electronics extends Product{

private boolean batteryIncluded;
private int batteryCharge;

  public Electronics(double p, String c, String n, int q, boolean inc, int bc)
  {
    super(p, c, n, q);
    setBattInc(inc);
    setBatteryCharge(bc);
  }

  public Electronics()
  {
    super();
    setBattInc(false);
    setBatteryCharge(0);
  }

  public void setBattInc(boolean p)
  {
    batteryIncluded= p;
  }

  public void setBatteryCharge(int o)
  {
    batteryCharge = o;
  }

  public boolean batteryIncluded()
  {
    return batteryIncluded;
  }

  public int getBatteryCharged()
  {
    return batteryCharge;
  }

  public String toString()
  {
    String s = "";
    s += "Electronics\n" + super.toString() + "\nBattery Included?" + batteryIncluded + "\nBattery Charged: " + batteryCharge + "%";
    return s;
  }








  
}
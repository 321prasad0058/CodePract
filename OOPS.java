
public class OOPS 
{
    public static void main(String[] args)
    {
        Pen s = new Pen();
        
        s.setColor("Black");
        System.out.println(s.color);

        s.setTip(1);
        System.out.println(s.tip);

    }
}

class Pen 
{
    String color ;
    int tip;

    void setColor(String newColor)
    {
        color = newColor;
    } 

    void setTip(int newTip)
    {
        tip = newTip;
    }
}
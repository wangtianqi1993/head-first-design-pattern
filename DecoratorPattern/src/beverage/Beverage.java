package beverage;

/**
 * Created by wtq on 3/2/16.
 */
public class Beverage {
    public static void main(String args[])
    {
        Other other = new Other();
        int result = other.getInt();
        System.out.print("test!" + result);
    }
}

class Other {
    public int getInt()
    {
        return 1;
    }
}
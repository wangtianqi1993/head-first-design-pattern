package AdapterPattern;

public interface Turkey {
    public void gobble();
    public void fly();
}

public class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("Gobble gobble");
    }
    public void fly(){
        System.out.println("i am flying a short distance");
    }
}
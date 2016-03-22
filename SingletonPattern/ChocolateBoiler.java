package SigletonPattern;

public class ChocolateBoiler{
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler singleChocolate;
    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }
    public static ChocolateBoiler getInstance(){
        if (singleChocolate == null)
            singleChocolate = new ChocolateBoiler();
        return singleChocolate;
    }
    public void fill(){
        if (isEmpty()){
            empty = false;
            boiled = false;
        }
    }
    public void drain(){
        if(!isEmpty() && isBoiled()){
            empty = true;
        }
    }
    public void boil(){
        if(!isEmpty() && !isBoiled()){
            boiled = true;
        }
    }
    public boolean isEmpty(){
        return empty;
    }
    public boolean isBoiled(){
        return boiled;
    }
}
package oop;

public class Kitty extends CatParent{

    @Override
    public String voice() {
        return "piiiiii";
    }
    @Override
    public int jumpHigh(){

        return 1;
    }

    public String some() {
        return "25 kitty";
    }
}

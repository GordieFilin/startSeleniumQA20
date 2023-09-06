package oop;

public class DogExtendsAbstract extends AbstractExample implements Animals{
    @Override
    public int legsQuantity() {
        return 4;
    }

    @Override
    public String voice() {
        return "gavgav";
    }
}

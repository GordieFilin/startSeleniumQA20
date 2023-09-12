package oop;

public interface Animals {

    public default int legsQuantity(){
        return 5;
    }

    public default String voice(){
        return "yuyuyu";
    }
}

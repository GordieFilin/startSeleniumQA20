package oop2;

public interface Fish {
    public default int tail(){

        return 0;
    };

    public int size();

}

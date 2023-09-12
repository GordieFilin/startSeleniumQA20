package oop2;

public class MainClass {
    public static void main(String[] args) {
        Fish fish = new Fish() {
            @Override
            public int size() {
                return 4;
            }
        };
        System.out.println(fish.tail());
        System.out.println(fish.size());
        BigFish bigFish = new BigFish();
        System.out.println(bigFish.tail());
        System.out.println(bigFish.size());
        System.out.println(bigFish.heads());

        LittleFish littleFish = new LittleFish();
        System.out.println(littleFish.size());
        System.out.println(littleFish.tail());

        SnakeExtendsAbstract snakeExtendsAbstract = new SnakeExtendsAbstract();
        System.out.println(snakeExtendsAbstract.legsQuantity());
        System.out.println(snakeExtendsAbstract.voice());

    }


}

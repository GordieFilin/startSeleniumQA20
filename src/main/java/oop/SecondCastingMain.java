package oop;

public class SecondCastingMain {

    public static void main(String[] args) {
        Kitty kitty = new Kitty();
        // System.out.println(kitty.jumpHigh());
        // System.out.println(kitty.voice());
        // System.out.println(kitty.legsQuantity());

        CatParent catFromKitty = kitty;
        System.out.println("str12" + catFromKitty.voice());
        System.out.println("str 13" + kitty.voice() + " some " + kitty.some());


        CatParent catParent = new CatParent();
        // System.out.println(catParent.jumpHigh());
        // System.out.println(catParent.voice());
        // System.out.println(catParent.legsQuantity());

        catParent = (Kitty)  kitty;
        System.out.println("str21" + catParent.voice());
        System.out.println("str 22" + kitty.voice() + " " + kitty.some());

      //  Kitty kittyCasting = (Kitty) catParent;
      //  System.out.println("str21" + catFromKitty.voice());
      //  System.out.println("str 22" + kitty.voice());


        Animals animals = new Animals() {
            @Override
            public int legsQuantity() {
                return 8;
            }
        };

        System.out.println(animals.legsQuantity());
        System.out.println(animals.voice());

        Animals animalsClass = new Animals() {
            int quantity;

            public int getQuantity() {
                return quantity;
            }

            public void setQuantity(int quantity) {
                this.quantity = quantity;
            }
            public int someNumber(){
                return 99;
            }

            @Override
            public int legsQuantity() {
                System.out.println(someNumber());
                return 8;
            }
        };

        System.out.println(animalsClass.getClass()); //  FirstMain$2
        // animalsClass.someNumber();

        System.out.println(animalsClass.legsQuantity());

        Animals animals1 = new Animals() {
        };



    }
}


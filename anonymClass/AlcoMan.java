package anonymClass;

public class AlcoMan implements DrinkAlco {
    public void drinkDyshkovka(){
        System.out.println("Хуярю так, что шуба заварачивается!");
    }

    @Override
    public void drinkBeer() {
        System.out.println("Синячу пивачу!");
    }
}

class Test{
    public static void main(String[] args) {
        AlcoMan dyshko = new AlcoMan();
        dyshko.drinkDyshkovka();
        dyshko.drinkBeer();



        DrinkAlco drinkAlco = new DrinkAlco() {
            @Override
            public void drinkBeer() {
                System.out.println("Пивко шарное тоже люблю!");
            }
        };

        drinkAlco.drinkBeer();
    }

}
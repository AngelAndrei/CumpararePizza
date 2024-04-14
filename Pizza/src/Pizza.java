public class Pizza {

    private int price;
    private boolean vegetariana;
    private int extraCheesePrice=5;
    private int extraSalami=10;
    private int extraPorumb=3;
    private int extraMozzarela=5;
    private int cutie =5;
    private int basePizza=30;




    public Pizza(boolean vegetarina) {
        this.vegetariana = vegetarina;
        if(this.vegetariana){
            this.price=40;
        }
        else{
            this.price=30;
        }
        basePizza=this.price;
    }
    public void addExtraCheese(){
        System.out.println("Extra cheese added!");
        this.price+=extraCheesePrice;
    }

    public void addExtraSalami(){
        System.out.println("Extra salami added!");
        this.price+=extraSalami;

    }
    public void addExtraMozzarella(){
        System.out.println("Extra mozzarella added!");
        this.price+=extraMozzarela;

    }
    public void addExtraCorn(){
        System.out.println("Extra corn added!");
        this.price+=extraPorumb;
    }
    public void takeAway(){
        System.out.println("Take away order");
        this.price+=cutie;
    }
    public void getBill() {

        System.out.println(this.price);
    }
}


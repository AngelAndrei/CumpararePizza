A mini-project that lets you customise your pizza.


It firstly chooses if the pizza is vegan or not by using:


public Pizza(boolean vegetarina) {
        this.vegetariana = vegetarina;
        if(this.vegetariana){
            this.price=40;
        }
        else{
            this.price=30;
        }
        basePizza=this.price;

Then you only pick what you want extra on your pizza,pick if it's a take away order and prints the bills price.


There is also a PremiumPizza that is extended and has everything already added,and the Override function so you can't add anymore to it.




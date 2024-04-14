public class PremiumPizza extends Pizza{
    public PremiumPizza(boolean vegetariana){
        super(vegetariana);
        super.addExtraCheese();
        super.addExtraCorn();
        super.addExtraSalami();
        super.addExtraMozzarella();
    }

    @Override
    public void addExtraSalami() {
    }

    @Override
    public void addExtraCheese() {
    }

    @Override
    public void addExtraMozzarella() {
    }

    @Override
    public void addExtraCorn() {
    }
}

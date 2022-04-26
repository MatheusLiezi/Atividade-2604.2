package principal.principal.atividade2604;

public class FabricaPepperoni extends Fabrica {
    
    @Override
    public Pizza fazerPizza() {
        return new PepperoniPizza;
    }
}

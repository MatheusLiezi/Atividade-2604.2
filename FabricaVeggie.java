package principal.principal.atividade2604;

public class FabricaVeggie extends Fabrica {
    
    @Override
    public Pizza fazerPizza() {
        return new ChesseVeggie;
    }
}
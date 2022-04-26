package principal.principal.atividade2604;

public class FabricaChesse extends Fabrica {
    
    @Override
    public Pizza fazerPizza() {
        return new ChessePizza;
    }
}

package Exception;


public class NumeroPersonagensInvalidoException extends Exception{
    
    public NumeroPersonagensInvalidoException(){
        super("A PARTIDA DEVE CONTER NO MINIMO 2 E NO MAXIMO 10 JOGADORES");
    }
    
}
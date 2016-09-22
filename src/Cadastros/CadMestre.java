
package Cadastros;

import Entidades.Mestre;
import java.util.ArrayList;
import java.util.List;

public class CadMestre {
    
    private List<Mestre> lista;
    private int quant;
    
    public CadMestre (){
        this.lista = new ArrayList<>();
    }
    
    public boolean adicionar (Mestre m){
        this.quant++;
        return lista.add(m);
    }

    public int getQuant() {
        return quant;
    }
    
    public boolean remover (Mestre m){
        this.quant--;
        return lista.remove(m);
    }
    
    public List<Mestre> listar (){
        return lista;
    }
    
    public boolean verificaUsuario (String nomeUsuario){
        for (int i = 0; i < lista.size(); i++){
            if (nomeUsuario.equals(lista.get(i).getNomeUsuario())){
                return true;
            }
        }
        return false;
    }
    
    public boolean verificaSenha (String senha){
        for (int i = 0; i < lista.size(); i++){
            if (senha.equals(lista.get(i).getSenha())){
                return true;
            }
        }
        return false;
    }
    
    
    
}

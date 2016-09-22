package Cadastros;

import Entidades.Ficha;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class CadastroArquivoPersonagem {
    
    private File arquivo;
    
    public CadastroArquivoPersonagem () throws IOException{
        this.arquivo = new File("Personagem.bin");
        if(!arquivo.exists()) arquivo.createNewFile();
    }
    
    public boolean adicionar (Ficha f) throws IOException, ClassNotFoundException{
        List<Ficha> lista = listar();
        
        if (lista.add(f)){
            salvar(lista);
            return true;
        } else {
            return false;
        }
    }
    
    public boolean atualizar (Ficha f) throws IOException, ClassNotFoundException{
        List<Ficha> lista = listar();
        
        for (int i = 0; i < lista.size(); i++){
            if (lista.get(i).getNomePersonagem().equals(f.getNomePersonagem())){
                lista.set(i, f);
                salvar(lista);
                return true;
            }
        }
        
        return false;
    }
    
    public boolean remover (Ficha f) throws IOException, ClassNotFoundException{
        List<Ficha> lista = listar();
        
        if (lista.remove(f)){
            salvar(lista);
            return true;
        } else {
            return false;
        }
        
    }
    
    public List<Ficha> listar () throws IOException, ClassNotFoundException{
        
        List<Ficha> lista = null;
        
        if (arquivo.length() > 0){
            ObjectInputStream in = new ObjectInputStream (new FileInputStream(arquivo));
            lista = (List<Ficha>) in.readObject();
            in.close();            
        } else {
            lista = new ArrayList<>();
        }
        return lista;
    }
    
    public boolean salvar (List<Ficha> lista) throws IOException{
        ObjectOutputStream out = new ObjectOutputStream (new FileOutputStream(arquivo));
        out.writeObject(lista);
        out.close();
        return true;
    }
    
}

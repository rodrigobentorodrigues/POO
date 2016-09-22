package Cadastros;

import Entidades.Mestre;
import Exception.NomeUsuarioDuplicadoException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class CadastroMestreArquivo {
   
    private File arquivo;
    
    public CadastroMestreArquivo () throws IOException{
        arquivo = new File ("CadastroMestre.bin");
        if(!arquivo.exists()) arquivo.createNewFile();
    }
    
    public boolean adicionar (Mestre m) throws IOException, ClassNotFoundException, NomeUsuarioDuplicadoException{
        
        List<Mestre> lista = listar();
        
        if (ler(m.getNomeUsuario()) != null){
            throw new NomeUsuarioDuplicadoException("Ja possui mestre cadastrado com esse nome");
        } 
        
        if (lista.add(m)){
            salvar(lista); 
            return true;
        } else {
            return false;
        }
        
    }
    
    public List<Mestre> listar () throws IOException, ClassNotFoundException{
        
        List<Mestre> lista = null;
        
        if (arquivo.length()>0){
            ObjectInputStream in = new ObjectInputStream (new FileInputStream(arquivo));
            lista = (List<Mestre>) in.readObject();
            in.close();
        } else {
            lista = new ArrayList<>();
        }
        return lista;
    }
    
    public boolean atualizar (Mestre m) throws IOException, ClassNotFoundException{
        
        List<Mestre> lista = listar();
        
        for (int i = 0; i < lista.size(); i++){
            if (m.getNomeUsuario().equals(lista.get(i).getNomeUsuario())){
                lista.set(i, m);
                salvar(lista);
                return true;
            }
        }
        
        return false;        
        
    }
    
    public boolean remover (Mestre m) throws IOException, ClassNotFoundException{
        
        List<Mestre> lista = listar();
        
        if (lista.remove(m)){
            salvar(lista);
            return true;
        } else {
            return false;
        }
        
    }
    
    public Mestre ler (String usuario) throws IOException, ClassNotFoundException{
        
        List<Mestre> lista = listar();
        
        for (int i = 0; i < lista.size(); i++){
            if (lista.get(i).getNomeUsuario().equals(usuario)){
                return lista.get(i);
            }
        }
        
        return null;
    }
    
    public boolean verificaUsuario (String usuario) throws IOException, ClassNotFoundException{
        
        List<Mestre> lista = listar();
        
        for (int i = 0; i < lista.size(); i++){
            if(lista.get(i).getNomeUsuario().equals(usuario)){
                return true;
            }
        }
        
        return false;
        
    }
    
    public boolean verificaSenha (String senha) throws IOException, ClassNotFoundException{
        
        List<Mestre> lista = listar();
        
        for (int i = 0; i < lista.size(); i++){
            if(lista.get(i).getSenha().equals(senha)){
                return true;
            }
        }
        
        return false;
        
    }
    
    public boolean administrar (){
        if (arquivo.length() > 0){
            return true;
        } else {
            return false;
        }
    }
    
    public void salvar (List<Mestre> lista) throws IOException{
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivo));
        out.writeObject(lista);
        out.close();
    }
    
}

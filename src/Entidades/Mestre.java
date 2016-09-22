
package Entidades;

import java.io.Serializable;
import java.util.Objects;

public class Mestre implements Serializable{
    
    private String nomeMestre;
    private String nomeUsuario;
    private String senha;
    
    public Mestre (String nomeUsuario, String senha){
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }
    
    public String getNomeMestre (){
        return nomeMestre;
    }
    
    public void setNomeMestre (String nomeMestre){
        this.nomeMestre = nomeMestre;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }
    
    public void setNomeUsuario (String nomeUsuario){
        this.nomeUsuario = nomeUsuario;
    }
    
    public String getSenha (){
        return senha;
    }
    
    public void setSenha (String senha){
        this.senha = senha;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.nomeMestre);
        hash = 67 * hash + Objects.hashCode(this.nomeUsuario);
        hash = 67 * hash + Objects.hashCode(this.senha);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mestre other = (Mestre) obj;
        if (!Objects.equals(this.nomeMestre, other.nomeMestre)) {
            return false;
        }
        if (!Objects.equals(this.nomeUsuario, other.nomeUsuario)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Mestre{" + "nomeMestre=" + nomeMestre + ", nomeUsuario=" + nomeUsuario + ", senha=" + senha + '}';
    }
    
    
    
    
    
}

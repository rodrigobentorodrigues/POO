
package Entidades;
//import Cadastro.CadastroDungeon;
import Exception.IdIvalidoException;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Partida {
    
    private String nomeJogador;
    private LocalDate data;
    private LocalTime horaInicio;
    private List <Ficha> fichas;
    private int quant;
    private int id;
//    CadastroDungeon partidas = new CadastroDungeon();
    
    public Partida (LocalDate data, LocalTime horaInicio, String nomeJogador){
        this.data = data;
        this.horaInicio = horaInicio;
        this.nomeJogador = nomeJogador;
        this.fichas = new ArrayList<>();
    }
    
    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomePersonagem(String nomePersonagem) {
        this.nomeJogador = nomePersonagem;
    }
    
    public int getQuant(){
        return quant;
    }
    
    public void setQuant (int quant){
        this.quant = quant;
    }

    public LocalDate getData() {
        return data;
    }

//    public void setData(LocalDateTime data) {
//        this.data = data;
//    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

//    public void setHoraInicio(Date horaInicio) {
//        this.horaInicio = horaInicio;
//    }
    
    public List<Ficha> getFicha(){
        return fichas;
    }
    
    public void setFicha(List<Ficha> fichas){
        this.fichas = fichas;
    }

//    CadastroDungeon c = new CadastroDungeon();
//    List<Partida> auxiliar = c.listar();
//    
    public int getId() {
        return id;
    }

    public void setId(int id) throws IdIvalidoException{
//        for(int i=0; i<auxiliar.size(); i++){
//            if(id == auxiliar.get(i).id){
//                throw new IdIvalidoException();
//            }
//        }
        this.id = id;
    }
    

 
    
    @Override
    public String toString(){
        DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatadorHora = DateTimeFormatter.ofPattern("HH:mm");
        
        DateFormat dat = DateFormat.getTimeInstance();
        return "\n Partida: " + quant + "\n"
                + " Data de inicio: " + data.format(formatadorData)
                + "\n Hora: " + horaInicio.format(formatadorHora) + "\n"
                + " Nome do jogador: " + nomeJogador + "\n"
                + getFicha();
    }
    
}

package Entidades;

import Exception.NumeroPersonagensInvalidoException;
import Exception.ValorAtributoIvalidoException;
import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Ficha {
    
    private String classe, antecedente, nomePersonagem, raca, tendencia,
           dadosVida, classeArmd;
    private double experiencia, forca, destreza, constituicao, inteligencia, sabedoria, 
           carisma, percepcao, pontosVidaAtuais, pontosVidaTemporario, inspiracao,
           bonus, iniciativa, deslocamento;  
    private String [][] ataqueMagia, testeMorte;
    private int quantFicha;

    
    public Ficha(String classe, String nomePersonagem, String raca,
            double experiencia, double forca, double inteligencia,
            double sabedoria, String [][] ataqueMagia, String [][] testeMorte){
        
        this.classe = classe;
        this.nomePersonagem = nomePersonagem;
        this.raca = raca;
        this.experiencia = experiencia;
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.sabedoria = sabedoria;
        this.ataqueMagia = ataqueMagia;
        this.testeMorte = testeMorte;
    }
    
    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getAntecedente() {
        return antecedente;
    }

    public void setAntecedente(String antecedente) {
        this.antecedente = antecedente;
    }

    public String getNomePersonagem() {
        return nomePersonagem;
    }

    public void setNomePersonagem(String nomePersonagem) {
        this.nomePersonagem = nomePersonagem;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getTendencia() {
        return tendencia;
    }

    public void setTendencia(String tendencia) {
        this.tendencia = tendencia;
    }

    public String getDadosVida() {
        return dadosVida;
    }

    public void setDadosVida(String dadosVida) {
        this.dadosVida = dadosVida;
    }
    
    public String getClasseArmd() {
        return classeArmd;
    }

    public void setClasseArmd(String classeArmd) {
        this.classeArmd = classeArmd;
    }

    public double getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(double experiencia) {
        this.experiencia = experiencia;
    }

    public double getForca() {
        return forca;
    }

    public void setForca(double forca) throws ValorAtributoIvalidoException {
        if(forca < 0)
           throw new ValorAtributoIvalidoException();
        this.forca = forca;
    }

    public double getDestreza() {
        return destreza;
    }

    public void setDestreza(double destreza) throws ValorAtributoIvalidoException {
        if(destreza < 0)
           throw new ValorAtributoIvalidoException();
        this.destreza = destreza;
    }

    public double getConstituicao() {
        return constituicao;
    }

    public void setConstituicao(double constituicao) throws ValorAtributoIvalidoException {
         if(constituicao < 0)
           throw new ValorAtributoIvalidoException();
        this.constituicao = constituicao;
    }

    public double getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(double inteligencia) throws ValorAtributoIvalidoException {
        if(inteligencia < 0)
           throw new ValorAtributoIvalidoException();
        this.inteligencia = inteligencia;
    }

    public double getSabedoria() {
        return sabedoria;
    }

    public void setSabedoria(double sabedoria) throws ValorAtributoIvalidoException {
        if(sabedoria < 0)
           throw new ValorAtributoIvalidoException();
        this.sabedoria = sabedoria;
    }

    public double getCarisma() {
        return carisma;
    }

    public void setCarisma(double carisma) throws ValorAtributoIvalidoException {
        if(carisma < 0)
           throw new ValorAtributoIvalidoException();
        this.carisma = carisma;
    }

    public double getPercepcao() {
        return percepcao;
    }

    public void setPercepcao(double percepcao) {
        this.percepcao = percepcao;
    }

    public double getPontosVidaAtuais() {
        return pontosVidaAtuais;
    }

    public void setPontosVidaAtuais(double pontosVidaAtuais) {
        this.pontosVidaAtuais = pontosVidaAtuais;
    }

    public double getPontosVidaTemporario() {
        return pontosVidaTemporario;
    }

    public void setPontosVidaTemporario(double pontosVidaTemporario) {
        this.pontosVidaTemporario = pontosVidaTemporario;
    }

    public double getInspiracao() {
        return inspiracao;
    }

    public void setInspiracao(double inspiracao) {
        this.inspiracao = inspiracao;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getIniciativa() {
        return iniciativa;
    }

    public void setIniciativa(double iniciativa) {
        this.iniciativa = iniciativa;
    }

    public double getDeslocamento() {
        return deslocamento;
    }

    public void setDeslocamento(double deslocamento) {
        this.deslocamento = deslocamento;
    }
    
    public String[][] getAtaqueMagia() {
        return ataqueMagia;
    }

    public void setAtaqueMagia(String[][] ataqueMagia) {
        this.ataqueMagia = ataqueMagia;
    }
    
    public String [][] getTesteMorte(){
        return testeMorte;
    }
    
    public void setTesteMorte (String [][] testeMorte){
        this.testeMorte = testeMorte;
    }
    
    public int getQuantFicha() {
        return quantFicha;
    }

    public void setQuantFicha(int quantFicha) {
        this.quantFicha = quantFicha;
    }
    
    @Override
    public String toString(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateFormat dat = DateFormat.getTimeInstance();
        return  "\n- Jogador " + quantFicha + "\nAtributos: \n"
                + "- nome do personagem: " + nomePersonagem + " \n"
                + "- classe " + classe + " \n"
                + "- raca: " + raca + " \n"
                + "- antecedente: " + antecedente + " \n"
                + "- tendencia: " + tendencia + " \n"
                + "- classe da armadura: " + classeArmd + " \n"
                + "- dados de vida: " + dadosVida + " \n"
                + "- ataques e magia: " + Arrays.toString(ataqueMagia[0]) + " \n"
                + "- testes de morte: " + Arrays.toString(testeMorte[0]) + " \n"
                + "- pontos de experiencia: " + experiencia + " \n"
                + "- forca: " + forca + " \n"
                + "- destreza: " + destreza + " \n"
                + "- constituicao: " + constituicao + " \n"
                + "- inteligencia: " + inteligencia + " \n"
                + "- sabedoria: " + sabedoria + " \n"
                + "- carisma: " + carisma + " \n"
                + "- percepcao: " + percepcao + " \n"
                + "- pontos atuais: " + pontosVidaAtuais + " \n"
                + "- pontos temporarios: " + pontosVidaTemporario + " \n"
                + "- inspiracao: " + inspiracao + " \n"
                + "- bonus: " + bonus + " \n"
                + "- iniciativa: " + iniciativa + " \n"
                + "- deslocamento: " + deslocamento + " \n";
    }
}

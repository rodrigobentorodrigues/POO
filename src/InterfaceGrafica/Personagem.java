/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafica;

import Cadastros.CadastroArquivoPersonagem;
import java.io.IOException;
import static java.lang.System.exit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author rodri
 */
public class Personagem extends javax.swing.JFrame {

    /**
     * Creates new form Personagem
     */
    
    private CadastroArquivoPersonagem cad;
    
    public Personagem(){
        try {
            this.cad = new CadastroArquivoPersonagem();
        } catch (IOException ex){
            JOptionPane.showMessageDialog(null, "Falha na conexão com o arquivo",
                    "Mensagem de Erro !", JOptionPane.ERROR_MESSAGE);
        }
        ImageIcon logo = new ImageIcon("logo.jpg");
        setIconImage(logo.getImage());
        initComponents();
        setSize(830, 649);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jColorChooser1 = new javax.swing.JColorChooser();
        jPanel1 = new javax.swing.JPanel();
        tendencia = new javax.swing.JTextField();
        classe = new javax.swing.JTextField();
        raca = new javax.swing.JTextField();
        nomePersonagem = new javax.swing.JTextField();
        antecedente = new javax.swing.JTextField();
        nomeJogador = new javax.swing.JTextField();
        carisma = new javax.swing.JTextField();
        forca = new javax.swing.JTextField();
        inteligencia = new javax.swing.JTextField();
        destreza = new javax.swing.JTextField();
        sabedoria = new javax.swing.JTextField();
        constituicao = new javax.swing.JTextField();
        aumentarCarisma = new javax.swing.JButton();
        diminuirCarisma = new javax.swing.JButton();
        aumentarSabedoria = new javax.swing.JButton();
        diminuirSabedoria = new javax.swing.JButton();
        aumentarForca = new javax.swing.JButton();
        diminuirForca = new javax.swing.JButton();
        aumentarInteligencia = new javax.swing.JButton();
        diminuirInteligencia = new javax.swing.JButton();
        aumentarDestreza = new javax.swing.JButton();
        diminuirDestreza = new javax.swing.JButton();
        aumentarInspiracao = new javax.swing.JButton();
        diminuirInspiracao = new javax.swing.JButton();
        pontosTemp = new javax.swing.JTextField();
        pontosAtuais = new javax.swing.JTextField();
        dadosVida = new javax.swing.JTextField();
        inspiracao = new javax.swing.JTextField();
        aumentarConstituicao = new javax.swing.JButton();
        diminuirConstituicao = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        fracasso3 = new javax.swing.JCheckBox();
        fracasso2 = new javax.swing.JCheckBox();
        fracasso1 = new javax.swing.JCheckBox();
        sucesso1 = new javax.swing.JCheckBox();
        sucesso2 = new javax.swing.JCheckBox();
        sucesso3 = new javax.swing.JCheckBox();
        classeArmadura = new javax.swing.JTextField();
        ataque2 = new javax.swing.JTextField();
        bonus1 = new javax.swing.JTextField();
        ataque1 = new javax.swing.JTextField();
        ataque3 = new javax.swing.JTextField();
        dano2 = new javax.swing.JTextField();
        bonus2 = new javax.swing.JTextField();
        bonus3 = new javax.swing.JTextField();
        dano3 = new javax.swing.JTextField();
        dano1 = new javax.swing.JTextField();
        salvar = new javax.swing.JButton();
        experiencia = new javax.swing.JSpinner();
        iniciativa = new javax.swing.JSpinner();
        deslocamento = new javax.swing.JSpinner();
        background = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);
        jPanel1.add(tendencia);
        tendencia.setBounds(550, 110, 60, 30);
        jPanel1.add(classe);
        classe.setBounds(410, 70, 70, 30);
        jPanel1.add(raca);
        raca.setBounds(410, 110, 70, 30);

        nomePersonagem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nomePersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomePersonagemActionPerformed(evt);
            }
        });
        jPanel1.add(nomePersonagem);
        nomePersonagem.setBounds(60, 90, 170, 30);
        jPanel1.add(antecedente);
        antecedente.setBounds(550, 70, 60, 30);
        jPanel1.add(nomeJogador);
        nomeJogador.setBounds(700, 70, 70, 30);

        carisma.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        carisma.setText("0");
        carisma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carismaActionPerformed(evt);
            }
        });
        jPanel1.add(carisma);
        carisma.setBounds(130, 390, 40, 30);

        forca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        forca.setText("0");
        forca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forcaActionPerformed(evt);
            }
        });
        jPanel1.add(forca);
        forca.setBounds(50, 210, 40, 30);

        inteligencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inteligencia.setText("0");
        inteligencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inteligenciaActionPerformed(evt);
            }
        });
        jPanel1.add(inteligencia);
        inteligencia.setBounds(130, 210, 40, 30);

        destreza.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        destreza.setText("0");
        destreza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destrezaActionPerformed(evt);
            }
        });
        jPanel1.add(destreza);
        destreza.setBounds(50, 300, 40, 30);

        sabedoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sabedoria.setText("0");
        sabedoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sabedoriaActionPerformed(evt);
            }
        });
        jPanel1.add(sabedoria);
        sabedoria.setBounds(130, 300, 40, 30);

        constituicao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        constituicao.setText("0");
        constituicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                constituicaoActionPerformed(evt);
            }
        });
        jPanel1.add(constituicao);
        constituicao.setBounds(50, 390, 40, 30);

        aumentarCarisma.setText("+");
        aumentarCarisma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aumentarCarismaActionPerformed(evt);
            }
        });
        jPanel1.add(aumentarCarisma);
        aumentarCarisma.setBounds(130, 420, 40, 23);

        diminuirCarisma.setText("-");
        diminuirCarisma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diminuirCarismaActionPerformed(evt);
            }
        });
        jPanel1.add(diminuirCarisma);
        diminuirCarisma.setBounds(130, 440, 40, 23);

        aumentarSabedoria.setText("+");
        aumentarSabedoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aumentarSabedoriaActionPerformed(evt);
            }
        });
        jPanel1.add(aumentarSabedoria);
        aumentarSabedoria.setBounds(130, 330, 40, 23);

        diminuirSabedoria.setText("-");
        diminuirSabedoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diminuirSabedoriaActionPerformed(evt);
            }
        });
        jPanel1.add(diminuirSabedoria);
        diminuirSabedoria.setBounds(130, 350, 40, 23);

        aumentarForca.setText("+");
        aumentarForca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aumentarForcaActionPerformed(evt);
            }
        });
        jPanel1.add(aumentarForca);
        aumentarForca.setBounds(50, 240, 40, 23);

        diminuirForca.setText("-");
        diminuirForca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diminuirForcaActionPerformed(evt);
            }
        });
        jPanel1.add(diminuirForca);
        diminuirForca.setBounds(50, 260, 40, 23);

        aumentarInteligencia.setText("+");
        aumentarInteligencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aumentarInteligenciaActionPerformed(evt);
            }
        });
        jPanel1.add(aumentarInteligencia);
        aumentarInteligencia.setBounds(130, 240, 40, 23);

        diminuirInteligencia.setText("-");
        diminuirInteligencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diminuirInteligenciaActionPerformed(evt);
            }
        });
        jPanel1.add(diminuirInteligencia);
        diminuirInteligencia.setBounds(130, 260, 40, 23);

        aumentarDestreza.setText("+");
        aumentarDestreza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aumentarDestrezaActionPerformed(evt);
            }
        });
        jPanel1.add(aumentarDestreza);
        aumentarDestreza.setBounds(50, 330, 40, 23);

        diminuirDestreza.setText("-");
        diminuirDestreza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diminuirDestrezaActionPerformed(evt);
            }
        });
        jPanel1.add(diminuirDestreza);
        diminuirDestreza.setBounds(50, 350, 40, 23);

        aumentarInspiracao.setText("+");
        aumentarInspiracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aumentarInspiracaoActionPerformed(evt);
            }
        });
        jPanel1.add(aumentarInspiracao);
        aumentarInspiracao.setBounds(210, 510, 40, 23);

        diminuirInspiracao.setText("-");
        diminuirInspiracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diminuirInspiracaoActionPerformed(evt);
            }
        });
        jPanel1.add(diminuirInspiracao);
        diminuirInspiracao.setBounds(210, 560, 40, 23);
        jPanel1.add(pontosTemp);
        pontosTemp.setBounds(270, 360, 180, 30);
        jPanel1.add(pontosAtuais);
        pontosAtuais.setBounds(270, 290, 180, 30);

        dadosVida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadosVidaActionPerformed(evt);
            }
        });
        jPanel1.add(dadosVida);
        dadosVida.setBounds(270, 430, 70, 30);

        inspiracao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inspiracao.setText("0");
        inspiracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inspiracaoActionPerformed(evt);
            }
        });
        jPanel1.add(inspiracao);
        inspiracao.setBounds(210, 530, 40, 30);

        aumentarConstituicao.setText("+");
        aumentarConstituicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aumentarConstituicaoActionPerformed(evt);
            }
        });
        jPanel1.add(aumentarConstituicao);
        aumentarConstituicao.setBounds(50, 420, 40, 23);

        diminuirConstituicao.setText("-");
        diminuirConstituicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diminuirConstituicaoActionPerformed(evt);
            }
        });
        jPanel1.add(diminuirConstituicao);
        diminuirConstituicao.setBounds(50, 440, 40, 23);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(360, 500, 160, 100);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        fracasso3.setText("jCheckBox1");
        fracasso3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fracasso3ActionPerformed(evt);
            }
        });

        fracasso2.setText("jCheckBox1");
        fracasso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fracasso2ActionPerformed(evt);
            }
        });

        fracasso1.setText("jCheckBox1");
        fracasso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fracasso1ActionPerformed(evt);
            }
        });

        sucesso1.setText("jCheckBox1");
        sucesso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sucesso1ActionPerformed(evt);
            }
        });

        sucesso2.setText("jCheckBox1");
        sucesso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sucesso2ActionPerformed(evt);
            }
        });

        sucesso3.setText("jCheckBox1");
        sucesso3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sucesso3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sucesso1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fracasso1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fracasso2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sucesso2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fracasso3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sucesso3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sucesso1)
                    .addComponent(sucesso2)
                    .addComponent(sucesso3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fracasso1)
                            .addComponent(fracasso2)
                            .addComponent(fracasso3))))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(410, 420, 60, 40);

        classeArmadura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classeArmaduraActionPerformed(evt);
            }
        });
        jPanel1.add(classeArmadura);
        classeArmadura.setBounds(270, 200, 30, 30);
        jPanel1.add(ataque2);
        ataque2.setBounds(530, 240, 80, 30);

        bonus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bonus1ActionPerformed(evt);
            }
        });
        jPanel1.add(bonus1);
        bonus1.setBounds(610, 210, 50, 30);
        jPanel1.add(ataque1);
        ataque1.setBounds(530, 210, 80, 30);

        ataque3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ataque3ActionPerformed(evt);
            }
        });
        jPanel1.add(ataque3);
        ataque3.setBounds(530, 270, 80, 30);

        dano2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dano2ActionPerformed(evt);
            }
        });
        jPanel1.add(dano2);
        dano2.setBounds(660, 240, 80, 30);

        bonus2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bonus2ActionPerformed(evt);
            }
        });
        jPanel1.add(bonus2);
        bonus2.setBounds(610, 240, 50, 30);

        bonus3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bonus3ActionPerformed(evt);
            }
        });
        jPanel1.add(bonus3);
        bonus3.setBounds(610, 270, 50, 30);

        dano3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dano3ActionPerformed(evt);
            }
        });
        jPanel1.add(dano3);
        dano3.setBounds(660, 270, 80, 30);

        dano1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dano1ActionPerformed(evt);
            }
        });
        jPanel1.add(dano1);
        dano1.setBounds(660, 210, 80, 30);

        salvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });
        jPanel1.add(salvar);
        salvar.setBounds(650, 530, 90, 30);
        jPanel1.add(experiencia);
        experiencia.setBounds(710, 110, 70, 30);
        jPanel1.add(iniciativa);
        iniciativa.setBounds(330, 200, 50, 30);
        jPanel1.add(deslocamento);
        deslocamento.setBounds(410, 200, 50, 30);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\rodri\\OneDrive\\Documentos\\NetBeansProjects\\ProjetoFinal\\fundo2 (Copy).jpg")); // NOI18N
        jPanel1.add(background);
        background.setBounds(0, 0, 790, 649);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomePersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomePersonagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomePersonagemActionPerformed

    private void carismaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carismaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carismaActionPerformed

    private void forcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forcaActionPerformed

    private void inteligenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inteligenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inteligenciaActionPerformed

    private void destrezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destrezaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destrezaActionPerformed

    private void sabedoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sabedoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sabedoriaActionPerformed

    private void constituicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_constituicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_constituicaoActionPerformed

    private void aumentarCarismaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aumentarCarismaActionPerformed
        int inteiro = Integer.parseInt(carisma.getText());
        inteiro++;
        String valor = Integer.toString(inteiro);
        carisma.setText(valor);
    }//GEN-LAST:event_aumentarCarismaActionPerformed

    private void aumentarSabedoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aumentarSabedoriaActionPerformed
        int inteiro = Integer.parseInt(sabedoria.getText());
        inteiro++;
        String valor = Integer.toString(inteiro);
        sabedoria.setText(valor);
    }//GEN-LAST:event_aumentarSabedoriaActionPerformed

    private void aumentarForcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aumentarForcaActionPerformed
        int inteiro = Integer.parseInt(forca.getText());
        inteiro++;
        String valor = Integer.toString(inteiro);
        forca.setText(valor);
    }//GEN-LAST:event_aumentarForcaActionPerformed

    private void aumentarInteligenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aumentarInteligenciaActionPerformed
        int inteiro = Integer.parseInt(inteligencia.getText());
        inteiro++;
        String valor = Integer.toString(inteiro);
        inteligencia.setText(valor);
    }//GEN-LAST:event_aumentarInteligenciaActionPerformed

    private void aumentarDestrezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aumentarDestrezaActionPerformed
        int inteiro = Integer.parseInt(destreza.getText());
        inteiro++;
        String valor = Integer.toString(inteiro);
        destreza.setText(valor);
    }//GEN-LAST:event_aumentarDestrezaActionPerformed

    private void aumentarInspiracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aumentarInspiracaoActionPerformed
        int inteiro = Integer.parseInt(inspiracao.getText());
        inteiro++;
        String valor = Integer.toString(inteiro);
        inspiracao.setText(valor);
    }//GEN-LAST:event_aumentarInspiracaoActionPerformed

    private void dadosVidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dadosVidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dadosVidaActionPerformed

    private void inspiracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inspiracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inspiracaoActionPerformed

    private void aumentarConstituicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aumentarConstituicaoActionPerformed
        int inteiro = Integer.parseInt(constituicao.getText());
        inteiro++;
        String valor = Integer.toString(inteiro);
        constituicao.setText(valor);
    }//GEN-LAST:event_aumentarConstituicaoActionPerformed

    private void classeArmaduraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classeArmaduraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classeArmaduraActionPerformed

    private void bonus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bonus1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bonus1ActionPerformed

    private void ataque3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ataque3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ataque3ActionPerformed

    private void dano2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dano2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dano2ActionPerformed

    private void bonus2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bonus2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bonus2ActionPerformed

    private void bonus3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bonus3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bonus3ActionPerformed

    private void dano3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dano3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dano3ActionPerformed

    private void dano1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dano1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dano1ActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        String nomePerson = nomePersonagem.getText();
        String clas = classe.getText();
        String rac = raca.getText();
        String antecedent = antecedente.getText();
        String tendenc = tendencia.getText();
        String nomeJog = nomeJogador.getText();
        int v = (int) experiencia.getValue();
        while (v < 0){
            JOptionPane.showMessageDialog(null, "A experiencia tem que ser maior que zero",
                    "Mensagem de Erro !", JOptionPane.ERROR_MESSAGE);
            experiencia.setValue(0); v = 0;
        }
        int inic = (int) iniciativa.getValue();
        int desloc = (int) deslocamento.getValue();
        String classeArmd = classeArmadura.getText();
        String pontosAt = pontosAtuais.getText();
        String pontosTemporarios = pontosTemp.getText();
        String dados = dadosVida.getText();
        String [][] ataquesMagia = new String [3][3];
        ataquesMagia[0][0] = ataque1.getText();
        ataquesMagia[0][1] = ataque2.getText();
        ataquesMagia[0][2] = ataque3.getText();
        ataquesMagia[1][0] = bonus1.getText();
        ataquesMagia[1][1] = bonus2.getText();
        ataquesMagia[1][2] = bonus3.getText();
        ataquesMagia[2][0] = dano1.getText();
        ataquesMagia[2][1] = dano2.getText();
        ataquesMagia[2][2] = dano3.getText();
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print("" + ataquesMagia[i][j]);
            }
        }
        String testeMorte [][] = new String [1][3];
        String teste;
        
        for (int i = 0; i < 1; i++){
            for (int j = 0; j < 3; j++){
                while (!sucesso1.isSelected() && !fracasso1.isSelected()){
                    JOptionPane.showMessageDialog(null, "Informe todos os campos de teste contra a morte",
                            "Mensagem de Erro !", JOptionPane.ERROR_MESSAGE);
                    sucesso1.setSelected(true);
                    break;
                }    
                while (!sucesso2.isSelected() && !fracasso2.isSelected()){
                    JOptionPane.showMessageDialog(null, "Informe todos os campos de teste contra a morte",
                            "Mensagem de Erro !", JOptionPane.ERROR_MESSAGE);
                    sucesso2.setSelected(true);
                    break;
                }
                while (!sucesso3.isSelected() && !fracasso3.isSelected()){
                    JOptionPane.showMessageDialog(null, "Informe todos os campos de teste contra a morte",
                            "Mensagem de Erro !", JOptionPane.ERROR_MESSAGE);
                    sucesso3.setSelected(true);
                    break;
                }
//                    sucesso1.setSelected(true);
//                    sucesso2.setSelected(true);
//                    sucesso3.setSelected(true);
                }
//                sucesso1.setSelected(false);
//                sucesso2.setSelected(false);
//                sucesso3.setSelected(false);
//                if(sucesso1.isSelected()){
//                    teste = "Sucesso - X";
//                    testeMorte[i][j] = teste;
//                } else if (fracasso1.isSelected()){
//                    teste = "Fracasso - X";
//                    testeMorte[i][j] = teste;
//                }
//                if (sucesso2.isSelected()){
//                    teste = "Sucesso - X";
//                    testeMorte[i][j] = teste;
//                } else if (fracasso2.isSelected()){
//                    teste = "Fracasso - X";
//                    testeMorte[i][j] = teste;
//                }
//                if (sucesso3.isSelected()){
//                    teste = "Sucesso - X";
//                    testeMorte[i][j] = teste;
//                } else if (fracasso3.isSelected()) {
//                    teste = "Fracasso - X";
//                    testeMorte[i][j] = teste;
//                }
//                if (testeMorte[i][j] == null){
//                    JOptionPane.showMessageDialog(null, "Informe todos os campos de teste contra a morte",
//                            "Mensagem de Erro !", JOptionPane.ERROR_MESSAGE);
//                    break;
//                }
            
        }
              
    }//GEN-LAST:event_salvarActionPerformed

    private void diminuirForcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diminuirForcaActionPerformed
        int inteiro = Integer.parseInt(forca.getText());
        if (inteiro > 0){
            inteiro--;
            String valor = Integer.toString(inteiro);
            forca.setText(valor);
        }
    }//GEN-LAST:event_diminuirForcaActionPerformed

    private void diminuirInteligenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diminuirInteligenciaActionPerformed
        int inteiro = Integer.parseInt(inteligencia.getText());
        if (inteiro > 0){
            inteiro--;
            String valor = Integer.toString(inteiro);
            inteligencia.setText(valor);
        }
    }//GEN-LAST:event_diminuirInteligenciaActionPerformed

    private void diminuirDestrezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diminuirDestrezaActionPerformed
        int inteiro = Integer.parseInt(destreza.getText());
        if (inteiro > 0){
            inteiro--;
            String valor = Integer.toString(inteiro);
            destreza.setText(valor);
        }
    }//GEN-LAST:event_diminuirDestrezaActionPerformed

    private void diminuirSabedoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diminuirSabedoriaActionPerformed
        int inteiro = Integer.parseInt(sabedoria.getText());
        if (inteiro > 0){
            inteiro--;
            String valor = Integer.toString(inteiro);
            sabedoria.setText(valor);
        }
    }//GEN-LAST:event_diminuirSabedoriaActionPerformed

    private void diminuirConstituicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diminuirConstituicaoActionPerformed
        int inteiro = Integer.parseInt(constituicao.getText());
        if (inteiro > 0){
            inteiro--;
            String valor = Integer.toString(inteiro);
            constituicao.setText(valor);
        }
    }//GEN-LAST:event_diminuirConstituicaoActionPerformed

    private void diminuirCarismaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diminuirCarismaActionPerformed
        int inteiro = Integer.parseInt(carisma.getText());
        if (inteiro > 0){
            inteiro--;
            String valor = Integer.toString(inteiro);
            carisma.setText(valor);
        }
    }//GEN-LAST:event_diminuirCarismaActionPerformed

    private void diminuirInspiracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diminuirInspiracaoActionPerformed
        int inteiro = Integer.parseInt(inspiracao.getText());
        if (inteiro > 0){
            inteiro--;
            String valor = Integer.toString(inteiro);
            inspiracao.setText(valor);
        }
    }//GEN-LAST:event_diminuirInspiracaoActionPerformed

    private void sucesso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sucesso1ActionPerformed
        boolean estado = sucesso1.isSelected();
        if (estado){
            fracasso1.setSelected(false);
        }
    }//GEN-LAST:event_sucesso1ActionPerformed

    private void fracasso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fracasso1ActionPerformed
        boolean estado = fracasso1.isSelected();
        if (estado){
            sucesso1.setSelected(false);
        }
    }//GEN-LAST:event_fracasso1ActionPerformed

    private void sucesso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sucesso2ActionPerformed
        boolean estado = sucesso2.isSelected();
        if (estado){
            fracasso2.setSelected(false);
        }
    }//GEN-LAST:event_sucesso2ActionPerformed

    private void fracasso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fracasso2ActionPerformed
        boolean estado = fracasso2.isSelected();
        if (estado){
            sucesso2.setSelected(false);
        }
    }//GEN-LAST:event_fracasso2ActionPerformed

    private void sucesso3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sucesso3ActionPerformed
        boolean estado = sucesso3.isSelected();
        if (estado){
            fracasso3.setSelected(false);
        }
    }//GEN-LAST:event_sucesso3ActionPerformed

    private void fracasso3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fracasso3ActionPerformed
        boolean estado = fracasso3.isSelected();
        if (estado){
            sucesso3.setSelected(false);
        }
    }//GEN-LAST:event_fracasso3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Personagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Personagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Personagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Personagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Personagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField antecedente;
    private javax.swing.JTextField ataque1;
    private javax.swing.JTextField ataque2;
    private javax.swing.JTextField ataque3;
    private javax.swing.JButton aumentarCarisma;
    private javax.swing.JButton aumentarConstituicao;
    private javax.swing.JButton aumentarDestreza;
    private javax.swing.JButton aumentarForca;
    private javax.swing.JButton aumentarInspiracao;
    private javax.swing.JButton aumentarInteligencia;
    private javax.swing.JButton aumentarSabedoria;
    private javax.swing.JLabel background;
    private javax.swing.JTextField bonus1;
    private javax.swing.JTextField bonus2;
    private javax.swing.JTextField bonus3;
    private javax.swing.JTextField carisma;
    private javax.swing.JTextField classe;
    private javax.swing.JTextField classeArmadura;
    private javax.swing.JTextField constituicao;
    private javax.swing.JTextField dadosVida;
    private javax.swing.JTextField dano1;
    private javax.swing.JTextField dano2;
    private javax.swing.JTextField dano3;
    private javax.swing.JSpinner deslocamento;
    private javax.swing.JTextField destreza;
    private javax.swing.JButton diminuirCarisma;
    private javax.swing.JButton diminuirConstituicao;
    private javax.swing.JButton diminuirDestreza;
    private javax.swing.JButton diminuirForca;
    private javax.swing.JButton diminuirInspiracao;
    private javax.swing.JButton diminuirInteligencia;
    private javax.swing.JButton diminuirSabedoria;
    private javax.swing.JSpinner experiencia;
    private javax.swing.JTextField forca;
    private javax.swing.JCheckBox fracasso1;
    private javax.swing.JCheckBox fracasso2;
    private javax.swing.JCheckBox fracasso3;
    private javax.swing.JSpinner iniciativa;
    private javax.swing.JTextField inspiracao;
    private javax.swing.JTextField inteligencia;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nomeJogador;
    private javax.swing.JTextField nomePersonagem;
    private javax.swing.JTextField pontosAtuais;
    private javax.swing.JTextField pontosTemp;
    private javax.swing.JTextField raca;
    private javax.swing.JTextField sabedoria;
    private javax.swing.JButton salvar;
    private javax.swing.JCheckBox sucesso1;
    private javax.swing.JCheckBox sucesso2;
    private javax.swing.JCheckBox sucesso3;
    private javax.swing.JTextField tendencia;
    // End of variables declaration//GEN-END:variables
}

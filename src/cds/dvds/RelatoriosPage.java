/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package cds.dvds;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class RelatoriosPage extends javax.swing.JDialog {

    private Database dataBase;
    private int tipo;
    
    public RelatoriosPage(java.awt.Frame parent, boolean modal, Database dataBase, int tipo) {
        super(parent,modal);
        this.dataBase = dataBase;
        this.tipo = tipo;
        initComponents();
    } 

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        relTabela = new javax.swing.JTable();
        titulo = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("Voltar");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        relTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Título", "Diretor", "Tempo de Duração", "Tenho", "Descrição"
            }
        ));
        jScrollPane2.setViewportView(relTabela);

        titulo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(325, 325, 325))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        DefaultTableModel tabela;
        String[][] informacoes;
        if(tipo == 0){
            ArrayList<CD> dados = dataBase.getCds();
            titulo.setText("Relatório de CDs");
            String[] nomearColunas = {"Titulo","Artista","Número de Faixas","Tenho","Descricao"};
            informacoes = new String[dados.size()][5];
            for(int i = 0; i < dados.size(); i++){
                informacoes[i][0] = dados.get(i).getTitulo();
                informacoes[i][1] = dados.get(i).getArtista();
                informacoes[i][2] = dados.get(i).getNumero();
                informacoes[i][3] = String.valueOf(dados.get(i).getPossui());
                informacoes[i][4] = dados.get(i).getDescricao();
            }
            tabela = new DefaultTableModel(informacoes, nomearColunas);
            this.relTabela.setModel(tabela);
        }else if (tipo == 1){
            ArrayList<DVD> dados = dataBase.getDvds();
            titulo.setText("Relatório de DVDs");
            String[] nomearColunas = {"Titulo","Diretor","Duração","Tenho","Descricao"};
            informacoes = new String[dados.size()][5];
            for(int i = 0; i < dados.size(); i++){
                informacoes[i][0] = dados.get(i).getTitulo();
                informacoes[i][1] = dados.get(i).getDiretor();
                informacoes[i][2] = dados.get(i).getDuracao();
                informacoes[i][3] = String.valueOf(dados.get(i).getPossui());
                informacoes[i][4] = dados.get(i).getDescricao();
            } 
            tabela = new DefaultTableModel(informacoes, nomearColunas);
            this.relTabela.setModel(tabela);
        }              
    }//GEN-LAST:event_formWindowActivated

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable relTabela;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}

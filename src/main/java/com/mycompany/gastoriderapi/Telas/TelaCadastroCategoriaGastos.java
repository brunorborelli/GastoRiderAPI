/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.gastoriderapi.Telas;

import com.mycompany.gastoriderapi.Controller.TipoGastosController;
import com.mycompany.gastoriderapi.Modelos.TipoGastos;
import com.mycompany.gastoriderapi.Servico.TipoGastosService;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class TelaCadastroCategoriaGastos extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroCategoriaGastos
     */
    public TelaCadastroCategoriaGastos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoCadastroDescricaoGasto = new javax.swing.JTextField();
        campoCadastroTipoGasto = new javax.swing.JTextField();
        BotaoSalvarCadastroCategoriaGastos = new javax.swing.JButton();
        BotaoVoltarCadastroCategoriaGastos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Toledo", 1, 18)); // NOI18N
        jLabel1.setText("CADASTRO CATEGORIA DE GASTOS");

        jLabel2.setFont(new java.awt.Font("Toledo", 1, 14)); // NOI18N
        jLabel2.setText("Tipo de gasto:");

        jLabel3.setFont(new java.awt.Font("Toledo", 1, 14)); // NOI18N
        jLabel3.setText("Descrição:");

        campoCadastroDescricaoGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCadastroDescricaoGastoActionPerformed(evt);
            }
        });

        campoCadastroTipoGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCadastroTipoGastoActionPerformed(evt);
            }
        });

        BotaoSalvarCadastroCategoriaGastos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BotaoSalvarCadastroCategoriaGastos.setText("Salvar");
        BotaoSalvarCadastroCategoriaGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarCadastroCategoriaGastosActionPerformed(evt);
            }
        });

        BotaoVoltarCadastroCategoriaGastos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BotaoVoltarCadastroCategoriaGastos.setText("Voltar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(27, 27, 27)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoCadastroDescricaoGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoCadastroTipoGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(BotaoVoltarCadastroCategoriaGastos)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotaoSalvarCadastroCategoriaGastos))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCadastroTipoGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCadastroDescricaoGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoVoltarCadastroCategoriaGastos)
                    .addComponent(BotaoSalvarCadastroCategoriaGastos))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoCadastroDescricaoGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCadastroDescricaoGastoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCadastroDescricaoGastoActionPerformed

    private void campoCadastroTipoGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCadastroTipoGastoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCadastroTipoGastoActionPerformed

    private void BotaoSalvarCadastroCategoriaGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarCadastroCategoriaGastosActionPerformed
        
// Obtém os valores dos campos
    String tipoGasto = campoCadastroTipoGasto.getText();
    String descricao = campoCadastroDescricaoGasto.getText();

    // Cria um objeto TipoGastos com os valores dos campos
    TipoGastos tipoGastos = new TipoGastos(tipoGasto, descricao);

    // Cria uma instância do TipoGastosService (você pode ajustar isso com sua implementação real)
    TipoGastosService tipoGastosService = new TipoGastosService();

    // Cria uma instância do TipoGastosController, passando o TipoGastosService
    TipoGastosController tipoGastosController = new TipoGastosController(tipoGastosService);

    // Chama o método para adicionar o tipo de gasto
    tipoGastosController.adicionarTipoGasto(tipoGastos);

    // Limpa os campos após salvar
    campoCadastroTipoGasto.setText("");
    campoCadastroDescricaoGasto.setText("");

    // Exibe uma mensagem de confirmação
    JOptionPane.showMessageDialog(null, "Tipo de gasto salvo com sucesso!");

    
    
    }//GEN-LAST:event_BotaoSalvarCadastroCategoriaGastosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroCategoriaGastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCategoriaGastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCategoriaGastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCategoriaGastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroCategoriaGastos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoSalvarCadastroCategoriaGastos;
    private javax.swing.JButton BotaoVoltarCadastroCategoriaGastos;
    private javax.swing.JTextField campoCadastroDescricaoGasto;
    private javax.swing.JTextField campoCadastroTipoGasto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
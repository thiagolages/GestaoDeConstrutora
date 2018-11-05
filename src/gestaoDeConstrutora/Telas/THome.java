/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestaoDeConstrutora.Telas;

import gestaoDeConstrutora.BancoDeDados.BD;
import gestaoDeConstrutora.BancoDeDados.InterfaceBD;
import gestaoDeConstrutora.SubsistemaClientes.SubsistemaClientes;
import gestaoDeConstrutora.SubsistemaFuncionarios.SubsistemaFuncionarios;

/**
 *
 * @author hugozanini
 */
public class THome extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
	
	InterfaceBD bancoDeDados;
	
    public THome(BD bancoDeDados) {
    	this.bancoDeDados = bancoDeDados;
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

        cabecalho = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        obras = new javax.swing.JButton();
        orcamento = new javax.swing.JButton();
        funcionarios = new javax.swing.JButton();
        clientes = new javax.swing.JButton();
        orcamento_icon = new javax.swing.JLabel();
        funcionarios_icon = new javax.swing.JLabel();
        obras_icon = new javax.swing.JLabel();
        clientes_icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(209, 95, 95));

        obras.setText("Obras");
        obras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obrasActionPerformed(evt);
            }
        });

        orcamento.setText("Orçamentos");
        orcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orcamentoActionPerformed(evt);
            }
        });

        funcionarios.setText("Funcionários");
        funcionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcionariosActionPerformed(evt);
            }
        });

        clientes.setText("Clientes");
        clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cabecalho)
                .addGap(110, 110, 110))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(funcionarios_icon))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(funcionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(138, 138, 138)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clientes_icon)
                    .addComponent(clientes))
                .addContainerGap(118, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(obras, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(orcamento)
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(obras_icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(orcamento_icon)
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cabecalho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(obras_icon)
                    .addComponent(orcamento_icon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(obras)
                    .addComponent(orcamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(funcionarios_icon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clientes)
                            .addComponent(funcionarios)))
                    .addComponent(clientes_icon))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void obrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obrasActionPerformed
        // TODO add your handling code here:
        
        TObras obra = new TObras();
        obra.setVisible(true);
        dispose();

        
        
    }//GEN-LAST:event_obrasActionPerformed

    private void orcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orcamentoActionPerformed
        // TODO add your handling code here:
        TOrcamentos orc = new TOrcamentos();
        orc.setVisible(true);
        dispose();
    }//GEN-LAST:event_orcamentoActionPerformed

    private void funcionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionariosActionPerformed
        // TODO add your handling code here:
    	SubsistemaFuncionarios subsistemaFuncionarios = new SubsistemaFuncionarios(new BD());
        TFuncionarios func = new TFuncionarios(subsistemaFuncionarios);
        func.setVisible(true);
        dispose();
    }//GEN-LAST:event_funcionariosActionPerformed

    private void clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesActionPerformed
        // TODO add your handling code here:
    	SubsistemaClientes subSistemaClientes = new SubsistemaClientes(this.bancoDeDados);
        TClientes cli = new TClientes(subSistemaClientes);
        cli.setVisible(true);
        dispose();
    }//GEN-LAST:event_clientesActionPerformed

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
            java.util.logging.Logger.getLogger(THome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(THome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(THome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(THome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new THome(new BD()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cabecalho;
    private javax.swing.JButton clientes;
    private javax.swing.JLabel clientes_icon;
    private javax.swing.JButton funcionarios;
    private javax.swing.JLabel funcionarios_icon;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton obras;
    private javax.swing.JLabel obras_icon;
    private javax.swing.JButton orcamento;
    private javax.swing.JLabel orcamento_icon;
    // End of variables declaration//GEN-END:variables
}

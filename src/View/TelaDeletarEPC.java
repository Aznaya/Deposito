/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.EPC;
import Model.EPCDAO;
import java.util.ArrayList;

/**
 *
 * @author antun
 */
public class TelaDeletarEPC extends javax.swing.JFrame {

    /**
     * Creates new form TelaDeletarEPC
     */
    public TelaDeletarEPC() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        NumeroSerieEPIParaDeletar = new javax.swing.JTextField();
        BotaoCompletarDados = new javax.swing.JButton();
        NomeEPIParaDeletar = new javax.swing.JLabel();
        BotaoVoltarCadastroFuncionario = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuCadastrar = new javax.swing.JMenu();
        MenuCadastrarFuncionario = new javax.swing.JMenuItem();
        MenuCadastrarFerramenta = new javax.swing.JMenuItem();
        MenuCadastrarEPI = new javax.swing.JMenuItem();
        MenuCadastrarEPC = new javax.swing.JMenuItem();
        MenuListar = new javax.swing.JMenu();
        MenuListarFuncionario = new javax.swing.JMenuItem();
        MenuListarFerramenta = new javax.swing.JMenuItem();
        MenuListarEPI = new javax.swing.JMenuItem();
        MenuListarEPC = new javax.swing.JMenuItem();
        MenuAtualizar = new javax.swing.JMenu();
        MenuAtualizarFuncionario = new javax.swing.JMenuItem();
        MenuAtualizarFerramenta = new javax.swing.JMenuItem();
        MenuAtualizarEPI = new javax.swing.JMenuItem();
        MenuAtualizarEPC = new javax.swing.JMenuItem();
        MenuDeletar = new javax.swing.JMenu();
        MenuDeletarFuncionario = new javax.swing.JMenuItem();
        MenuDeletarFerramenta = new javax.swing.JMenuItem();
        MenuDeletarEPI = new javax.swing.JMenuItem();
        MenuDeletarEPC = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NumeroSerieEPIParaDeletar.setBorder(javax.swing.BorderFactory.createTitledBorder("Numero de Serie Do EPC para Deletar"));

        BotaoCompletarDados.setText("Completar Dados");
        BotaoCompletarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCompletarDadosActionPerformed(evt);
            }
        });

        NomeEPIParaDeletar.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome do EPC"));

        BotaoVoltarCadastroFuncionario.setText("Voltar");
        BotaoVoltarCadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltarCadastroFuncionarioActionPerformed(evt);
            }
        });

        jButton2.setText("Deletar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NumeroSerieEPIParaDeletar)
                    .addComponent(NomeEPIParaDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 234, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotaoCompletarDados, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(BotaoVoltarCadastroFuncionario)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NumeroSerieEPIParaDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoCompletarDados)
                .addGap(18, 18, 18)
                .addComponent(NomeEPIParaDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 302, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoVoltarCadastroFuncionario)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        MenuCadastrar.setText("Cadastrar");

        MenuCadastrarFuncionario.setText("Funcionario");
        MenuCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastrarFuncionarioActionPerformed(evt);
            }
        });
        MenuCadastrar.add(MenuCadastrarFuncionario);

        MenuCadastrarFerramenta.setText("Ferramenta");
        MenuCadastrarFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastrarFerramentaActionPerformed(evt);
            }
        });
        MenuCadastrar.add(MenuCadastrarFerramenta);

        MenuCadastrarEPI.setText("EPI");
        MenuCadastrarEPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastrarEPIActionPerformed(evt);
            }
        });
        MenuCadastrar.add(MenuCadastrarEPI);

        MenuCadastrarEPC.setText("EPC");
        MenuCadastrarEPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastrarEPCActionPerformed(evt);
            }
        });
        MenuCadastrar.add(MenuCadastrarEPC);

        jMenuBar1.add(MenuCadastrar);

        MenuListar.setText("Listar");

        MenuListarFuncionario.setText("Funcionario");
        MenuListarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuListarFuncionarioActionPerformed(evt);
            }
        });
        MenuListar.add(MenuListarFuncionario);

        MenuListarFerramenta.setText("Ferramenta");
        MenuListarFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuListarFerramentaActionPerformed(evt);
            }
        });
        MenuListar.add(MenuListarFerramenta);

        MenuListarEPI.setText("EPI");
        MenuListarEPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuListarEPIActionPerformed(evt);
            }
        });
        MenuListar.add(MenuListarEPI);

        MenuListarEPC.setText("EPC");
        MenuListarEPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuListarEPCActionPerformed(evt);
            }
        });
        MenuListar.add(MenuListarEPC);

        jMenuBar1.add(MenuListar);

        MenuAtualizar.setText("Atualizar");

        MenuAtualizarFuncionario.setText("Funcionario");
        MenuAtualizarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAtualizarFuncionarioActionPerformed(evt);
            }
        });
        MenuAtualizar.add(MenuAtualizarFuncionario);

        MenuAtualizarFerramenta.setText("Ferramenta");
        MenuAtualizarFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAtualizarFerramentaActionPerformed(evt);
            }
        });
        MenuAtualizar.add(MenuAtualizarFerramenta);

        MenuAtualizarEPI.setText("EPI");
        MenuAtualizarEPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAtualizarEPIActionPerformed(evt);
            }
        });
        MenuAtualizar.add(MenuAtualizarEPI);

        MenuAtualizarEPC.setText("EPC");
        MenuAtualizarEPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAtualizarEPCActionPerformed(evt);
            }
        });
        MenuAtualizar.add(MenuAtualizarEPC);

        jMenuBar1.add(MenuAtualizar);

        MenuDeletar.setText("Deletar");

        MenuDeletarFuncionario.setText("Funcionario");
        MenuDeletarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuDeletarFuncionarioActionPerformed(evt);
            }
        });
        MenuDeletar.add(MenuDeletarFuncionario);

        MenuDeletarFerramenta.setText("Ferramenta");
        MenuDeletarFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuDeletarFerramentaActionPerformed(evt);
            }
        });
        MenuDeletar.add(MenuDeletarFerramenta);

        MenuDeletarEPI.setText("EPI");
        MenuDeletarEPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuDeletarEPIActionPerformed(evt);
            }
        });
        MenuDeletar.add(MenuDeletarEPI);

        MenuDeletarEPC.setText("EPC");
        MenuDeletarEPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuDeletarEPCActionPerformed(evt);
            }
        });
        MenuDeletar.add(MenuDeletarEPC);

        jMenuBar1.add(MenuDeletar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastrarFuncionarioActionPerformed
        TelaCadastroFuncionario t = new TelaCadastroFuncionario();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuCadastrarFuncionarioActionPerformed

    private void MenuCadastrarFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastrarFerramentaActionPerformed
        TelaCadastroFerramenta t = new TelaCadastroFerramenta();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuCadastrarFerramentaActionPerformed

    private void MenuCadastrarEPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastrarEPIActionPerformed
        TelaCadastroEPI t = new TelaCadastroEPI();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuCadastrarEPIActionPerformed

    private void MenuCadastrarEPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastrarEPCActionPerformed
        TelaCadastroEPC t = new TelaCadastroEPC();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuCadastrarEPCActionPerformed

    private void MenuListarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuListarFuncionarioActionPerformed
        TelaListarFuncionario t = new TelaListarFuncionario();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuListarFuncionarioActionPerformed

    private void MenuListarFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuListarFerramentaActionPerformed
        TelaListarFerramenta t = new TelaListarFerramenta();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuListarFerramentaActionPerformed

    private void MenuListarEPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuListarEPIActionPerformed
        TelaListarEPI t = new TelaListarEPI();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuListarEPIActionPerformed

    private void MenuListarEPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuListarEPCActionPerformed
        TelaListarEPC t = new TelaListarEPC();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuListarEPCActionPerformed

    private void MenuAtualizarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAtualizarFuncionarioActionPerformed
        TelaAtualizarFuncionario t = new TelaAtualizarFuncionario();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuAtualizarFuncionarioActionPerformed

    private void MenuAtualizarFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAtualizarFerramentaActionPerformed
        TelaAtualizarFerramenta t = new TelaAtualizarFerramenta();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuAtualizarFerramentaActionPerformed

    private void MenuAtualizarEPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAtualizarEPIActionPerformed
        TelaAtualizarEPI t = new TelaAtualizarEPI();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuAtualizarEPIActionPerformed

    private void MenuAtualizarEPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAtualizarEPCActionPerformed
        TelaAtualizarEPC t = new TelaAtualizarEPC();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuAtualizarEPCActionPerformed

    private void MenuDeletarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuDeletarFuncionarioActionPerformed
        TelaDeletarFuncionario t = new TelaDeletarFuncionario();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuDeletarFuncionarioActionPerformed

    private void MenuDeletarFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuDeletarFerramentaActionPerformed
        TelaDeletarFerramenta t = new TelaDeletarFerramenta();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuDeletarFerramentaActionPerformed

    private void MenuDeletarEPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuDeletarEPIActionPerformed
        TelaDeletarEPI t = new TelaDeletarEPI();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuDeletarEPIActionPerformed

    private void MenuDeletarEPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuDeletarEPCActionPerformed
        TelaDeletarEPC t = new TelaDeletarEPC();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuDeletarEPCActionPerformed

    private void BotaoCompletarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCompletarDadosActionPerformed
        EPCDAO epcdao = new EPCDAO();
        ArrayList<EPC> listaDeEPC = new ArrayList<>();
        listaDeEPC = epcdao.buscarEPCSemFiltro();
        for(int i=0; i<listaDeEPC.size(); i++) {
            if(listaDeEPC.get(i).getIdEPC()== (Integer.parseInt(NumeroSerieEPIParaDeletar.getText()))) {
                NomeEPIParaDeletar.setText(listaDeEPC.get(i).getNome());
            } else {
                System.out.println("EPI não encontrado");
            }
        }
    }//GEN-LAST:event_BotaoCompletarDadosActionPerformed

    private void BotaoVoltarCadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltarCadastroFuncionarioActionPerformed
        TelaInicial t = new TelaInicial();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotaoVoltarCadastroFuncionarioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        EPCDAO epcdao = new EPCDAO();
        epcdao.deletarEPC(Integer.parseInt(NumeroSerieEPIParaDeletar.getText()));
        System.out.println("Deletado");
        NumeroSerieEPIParaDeletar.setText("");
        NomeEPIParaDeletar.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaDeletarEPC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeletarEPC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeletarEPC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeletarEPC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeletarEPC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCompletarDados;
    private javax.swing.JButton BotaoVoltarCadastroFuncionario;
    private javax.swing.JMenu MenuAtualizar;
    private javax.swing.JMenuItem MenuAtualizarEPC;
    private javax.swing.JMenuItem MenuAtualizarEPI;
    private javax.swing.JMenuItem MenuAtualizarFerramenta;
    private javax.swing.JMenuItem MenuAtualizarFuncionario;
    private javax.swing.JMenu MenuCadastrar;
    private javax.swing.JMenuItem MenuCadastrarEPC;
    private javax.swing.JMenuItem MenuCadastrarEPI;
    private javax.swing.JMenuItem MenuCadastrarFerramenta;
    private javax.swing.JMenuItem MenuCadastrarFuncionario;
    private javax.swing.JMenu MenuDeletar;
    private javax.swing.JMenuItem MenuDeletarEPC;
    private javax.swing.JMenuItem MenuDeletarEPI;
    private javax.swing.JMenuItem MenuDeletarFerramenta;
    private javax.swing.JMenuItem MenuDeletarFuncionario;
    private javax.swing.JMenu MenuListar;
    private javax.swing.JMenuItem MenuListarEPC;
    private javax.swing.JMenuItem MenuListarEPI;
    private javax.swing.JMenuItem MenuListarFerramenta;
    private javax.swing.JMenuItem MenuListarFuncionario;
    private javax.swing.JLabel NomeEPIParaDeletar;
    private javax.swing.JTextField NumeroSerieEPIParaDeletar;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

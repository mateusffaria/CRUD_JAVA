/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafica.aluno;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sistema.academico.Aluno;
import sistema.academico.DAO_Aluno;

/**
 *
 * @author mateu
 */
public class ListarAlunos extends javax.swing.JFrame {
    private String ra;
    private final DAO_Aluno aluno = new DAO_Aluno();
    private final Aluno alunoBanco = new Aluno();
    
    public ListarAlunos() {
        initComponents();
        carregarAlunos();
    }
    
    public void carregarAlunos(){
        DefaultTableModel tbm_alunos = (DefaultTableModel) tb_alunos.getModel();
        ArrayList<Aluno> alunos = aluno.getAlunos();
        int j = 0;
        for(int i =0; i<alunos.size(); i++){
            tbm_alunos.addRow(new Object[]{
                j=i+1,
                alunos.get(i).getEndereco(),
                alunos.get(i).getNome(),
                alunos.get(i).getRA(),
                alunos.get(i).getCurso(),
                alunos.get(i).getSexo(),
                alunos.get(i).getTelefone()
            });
        };        
    }
    
    public void limpaAlunos(){
        DefaultTableModel tbm_alunos = (DefaultTableModel) tb_alunos.getModel();
        tbm_alunos.setRowCount(0);
    }

    private String recuperaValorTabela(int coluna){
        return (String) tb_alunos.getModel().getValueAt(tb_alunos.getSelectedRow(), coluna);
    }    
    
    private void close(){
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tb_alunos = new javax.swing.JTable();
        lbl_listaAlunos = new javax.swing.JLabel();
        btn_excluirAluno = new javax.swing.JButton();
        btn_alterarAluno = new javax.swing.JButton();
        btn_inserirAluno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tb_alunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Endereço", "Nome", "RA", "Curso", "Sexo", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tb_alunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_alunosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_alunos);

        lbl_listaAlunos.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lbl_listaAlunos.setText("Lista de alunos na Instituição");

        btn_excluirAluno.setText("Excluir Aluno");
        btn_excluirAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirAlunoActionPerformed(evt);
            }
        });

        btn_alterarAluno.setText("Alterar Aluno");
        btn_alterarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarAlunoActionPerformed(evt);
            }
        });

        btn_inserirAluno.setText("Inserir Aluno");
        btn_inserirAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inserirAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_listaAlunos)
                .addGap(220, 220, 220))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_inserirAluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_alterarAluno)
                        .addGap(199, 199, 199)
                        .addComponent(btn_excluirAluno)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lbl_listaAlunos)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_excluirAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_inserirAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_alterarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void tb_alunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_alunosMouseClicked
        ra = recuperaValorTabela(3);
        
        alunoBanco.setNome(recuperaValorTabela(2));
        alunoBanco.setEndereco(recuperaValorTabela(1));
        alunoBanco.setTelefone(recuperaValorTabela(6));
        alunoBanco.setSexo(recuperaValorTabela(5));
        alunoBanco.setRA(recuperaValorTabela(3));
        alunoBanco.setCurso(recuperaValorTabela(4));
    }//GEN-LAST:event_tb_alunosMouseClicked

    private void btn_excluirAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirAlunoActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        dialogButton = JOptionPane.showConfirmDialog (null, "Deseja exluir esse registro?","Atenção",dialogButton);
        if(dialogButton == JOptionPane.YES_OPTION){
            aluno.excluirAluno(ra);
            limpaAlunos();
            carregarAlunos();
            tb_alunos.requestFocus();
            tb_alunos.changeSelection(1,1,false, false);            
        }
    }//GEN-LAST:event_btn_excluirAlunoActionPerformed

    private void btn_inserirAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inserirAlunoActionPerformed
        close();
        new CadastroAluno().setVisible(true);
    }//GEN-LAST:event_btn_inserirAlunoActionPerformed

    private void btn_alterarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarAlunoActionPerformed
        close();
        new AlterarAluno(alunoBanco).setVisible(true);
    }//GEN-LAST:event_btn_alterarAlunoActionPerformed

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
            java.util.logging.Logger.getLogger(ListarAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarAlunos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterarAluno;
    private javax.swing.JButton btn_excluirAluno;
    private javax.swing.JButton btn_inserirAluno;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_listaAlunos;
    private javax.swing.JTable tb_alunos;
    // End of variables declaration//GEN-END:variables
}

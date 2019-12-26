package InterfaceGrafica.aluno;

import javax.swing.JOptionPane;
import sistema.academico.Aluno;
import sistema.academico.DAO_Aluno;

public class AlterarAluno extends javax.swing.JFrame {

    private Aluno alunoBanco = new Aluno();
    
    public AlterarAluno() {
        initComponents();
    }

    AlterarAluno(Aluno alunoBanco) {
        this.alunoBanco = alunoBanco;
        initComponents();
        setAluno();
        rb_ADS.setSelected(true);
        rb_masc.setSelected(true);
    }
    
    
    private void setAluno(){
        txt_nome.setText(alunoBanco.getNome());
        txt_endereco.setText(alunoBanco.getEndereco());
        txt_ra.setText(alunoBanco.getRA());
        txt_ra.setEditable(false);
        txt_telefone.setText(alunoBanco.getTelefone());
        if(alunoBanco.getCurso() != null){
            switch (alunoBanco.getCurso()){
                case "ADS":
                    rb_ADS.setSelected(true);
                break;
                
                case "RH":
                    rb_RH.setSelected(true);
                break;
                
                case "Agronegócio":
                    rb_agro.setSelected(true);
                break;
                
                case "Logística":
                    rb_log.setSelected(true);
                break;
                
                default:
                    rb_ADS.setSelected(true);
                break;
            }
        }
        
        if(alunoBanco.getSexo() != null){
            switch(alunoBanco.getSexo()){
                case "Masculino":
                    rb_masc.setSelected(true);
                break;
                
                case "Feminino":
                    rb_fem.setSelected(true);
                break;
            }
        }
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        lbl_endereco = new javax.swing.JLabel();
        txt_telefone = new javax.swing.JTextField();
        lbl_telefone = new javax.swing.JLabel();
        lbl_telefone1 = new javax.swing.JLabel();
        lbl_insiraInfoAluno = new javax.swing.JLabel();
        rb_masc = new javax.swing.JRadioButton();
        txt_nome = new javax.swing.JTextField();
        rb_fem = new javax.swing.JRadioButton();
        lbl_nome = new javax.swing.JLabel();
        btn_alterar = new javax.swing.JButton();
        txt_ra = new javax.swing.JTextField();
        rb_ADS = new javax.swing.JRadioButton();
        lbl_ra = new javax.swing.JLabel();
        rb_agro = new javax.swing.JRadioButton();
        lbl_curso = new javax.swing.JLabel();
        rb_RH = new javax.swing.JRadioButton();
        txt_endereco = new javax.swing.JTextField();
        rb_log = new javax.swing.JRadioButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lbl_endereco.setText("Endereço:");

        lbl_telefone.setText("Telefone:");

        lbl_telefone1.setText("Sexo:");

        lbl_insiraInfoAluno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_insiraInfoAluno.setText("Alterar as informações do aluno");

        buttonGroup2.add(rb_masc);
        rb_masc.setText("Masculino");

        buttonGroup2.add(rb_fem);
        rb_fem.setText("Feminino");

        lbl_nome.setText("Nome:");

        btn_alterar.setText("Alterar");
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_ADS);
        rb_ADS.setText("ADS");

        lbl_ra.setText("RA:");

        buttonGroup1.add(rb_agro);
        rb_agro.setText("Agronegócio");

        lbl_curso.setText("Curso:");

        buttonGroup1.add(rb_RH);
        rb_RH.setText("RH");

        buttonGroup1.add(rb_log);
        rb_log.setText("Logística");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179))
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_nome)
                        .addGap(18, 18, 18)
                        .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_ra)
                        .addGap(18, 18, 18)
                        .addComponent(txt_ra, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbl_curso)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rb_ADS)
                                .addComponent(rb_RH))
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rb_log)
                                .addComponent(rb_agro)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lbl_insiraInfoAluno)
                            .addGap(10, 10, 10)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_telefone)
                        .addGap(18, 18, 18)
                        .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_endereco)
                        .addGap(18, 18, 18)
                        .addComponent(txt_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_telefone1)
                        .addGap(18, 18, 18)
                        .addComponent(rb_masc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_fem)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lbl_insiraInfoAluno)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_ra))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_curso)
                    .addComponent(rb_ADS)
                    .addComponent(rb_agro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_log)
                    .addComponent(rb_RH))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_endereco))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_telefone))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_telefone1)
                    .addComponent(rb_masc)
                    .addComponent(rb_fem))
                .addGap(18, 18, 18)
                .addComponent(btn_alterar)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed

        DAO_Aluno alunoAlterar = new DAO_Aluno();
        
        if(rb_ADS.isSelected()){
            alunoBanco.setCurso(rb_ADS.getText());
        }else if(rb_RH.isSelected()){
            alunoBanco.setCurso(rb_RH.getText());
        }else if(rb_agro.isSelected()){
            alunoBanco.setCurso(rb_agro.getText());
        }else if(rb_log.isSelected()){
            alunoBanco.setCurso(rb_log.getText());
        }

        alunoBanco.setEndereco(txt_endereco.getText());
        alunoBanco.setNome(txt_nome.getText());
        alunoBanco.setRA(txt_ra.getText());

        if(rb_fem.isSelected()){
            alunoBanco.setSexo(rb_fem.getText());
        }else if(rb_masc.isSelected()){
            alunoBanco.setSexo(rb_masc.getText());
        }

        alunoBanco.setTelefone(txt_telefone.getText());
        
        alunoAlterar.alterarAluno(alunoBanco);
        
        JOptionPane.showMessageDialog(null, "Aluno alterado com sucesso");
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        new ListarAlunos().setVisible(true);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(AlterarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel lbl_curso;
    private javax.swing.JLabel lbl_endereco;
    private javax.swing.JLabel lbl_insiraInfoAluno;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_ra;
    private javax.swing.JLabel lbl_telefone;
    private javax.swing.JLabel lbl_telefone1;
    private javax.swing.JRadioButton rb_ADS;
    private javax.swing.JRadioButton rb_RH;
    private javax.swing.JRadioButton rb_agro;
    private javax.swing.JRadioButton rb_fem;
    private javax.swing.JRadioButton rb_log;
    private javax.swing.JRadioButton rb_masc;
    private javax.swing.JTextField txt_endereco;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_ra;
    private javax.swing.JTextField txt_telefone;
    // End of variables declaration//GEN-END:variables
}

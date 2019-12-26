
package InterfaceGrafica.aluno;

import sistema.academico.Aluno;
import sistema.academico.DAO_Aluno;

public class CadastroAluno extends javax.swing.JFrame {
    DAO_Aluno adicionarAluno = new DAO_Aluno();
    public CadastroAluno() {
        initComponents();
        rb_ADS.setSelected(true);
        rb_masc.setSelected(true);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        lbl_insiraInfoAluno = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        lbl_nome = new javax.swing.JLabel();
        txt_ra = new javax.swing.JTextField();
        lbl_ra = new javax.swing.JLabel();
        lbl_curso = new javax.swing.JLabel();
        txt_endereco = new javax.swing.JTextField();
        lbl_endereco = new javax.swing.JLabel();
        txt_telefone = new javax.swing.JTextField();
        lbl_telefone = new javax.swing.JLabel();
        lbl_telefone1 = new javax.swing.JLabel();
        rb_masc = new javax.swing.JRadioButton();
        rb_fem = new javax.swing.JRadioButton();
        btn_cadastrar = new javax.swing.JButton();
        rb_ADS = new javax.swing.JRadioButton();
        rb_agro = new javax.swing.JRadioButton();
        rb_RH = new javax.swing.JRadioButton();
        rb_log = new javax.swing.JRadioButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
        });

        lbl_insiraInfoAluno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_insiraInfoAluno.setText("Insira as informações do aluno:");

        lbl_nome.setText("Nome:");

        lbl_ra.setText("RA:");

        lbl_curso.setText("Curso:");

        lbl_endereco.setText("Endereço:");

        lbl_telefone.setText("Telefone:");

        lbl_telefone1.setText("Sexo:");

        buttonGroup1.add(rb_masc);
        rb_masc.setText("Masculino");

        buttonGroup1.add(rb_fem);
        rb_fem.setText("Feminino");

        btn_cadastrar.setText("Cadastrar");
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
            }
        });

        buttonGroup2.add(rb_ADS);
        rb_ADS.setText("ADS");

        buttonGroup2.add(rb_agro);
        rb_agro.setText("Agronegócio");

        buttonGroup2.add(rb_RH);
        rb_RH.setText("RH");

        buttonGroup2.add(rb_log);
        rb_log.setText("Logística");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
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
                        .addComponent(lbl_insiraInfoAluno)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbl_curso)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rb_ADS)
                                .addComponent(rb_RH))
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rb_log)
                                .addComponent(rb_agro))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_telefone)
                        .addGap(18, 18, 18)
                        .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_endereco)
                        .addGap(18, 18, 18)
                        .addComponent(txt_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_cadastrar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_telefone1)
                                .addGap(18, 18, 18)
                                .addComponent(rb_masc)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_fem)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lbl_insiraInfoAluno)
                .addGap(34, 34, 34)
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
                .addGap(28, 28, 28)
                .addComponent(btn_cadastrar)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed

        Aluno alunoNovo = new Aluno();
        DAO_Aluno adicionarAluno = new DAO_Aluno();
        
        if(rb_ADS.isSelected()){
            alunoNovo.setCurso(rb_ADS.getText());
        }else if(rb_RH.isSelected()){
            alunoNovo.setCurso(rb_RH.getText());
        }else if(rb_agro.isSelected()){
            alunoNovo.setCurso(rb_agro.getText());
        }else if(rb_log.isSelected()){
            alunoNovo.setCurso(rb_log.getText());
        }
        
        alunoNovo.setEndereco(txt_endereco.getText());
        alunoNovo.setNome(txt_nome.getText());
        alunoNovo.setRA(txt_ra.getText());
       
        if(rb_fem.isSelected()){
            alunoNovo.setSexo(rb_fem.getText());
        }else if(rb_masc.isSelected()){
            alunoNovo.setSexo(rb_masc.getText());
        }
        
        alunoNovo.setTelefone(txt_telefone.getText());
        
        adicionarAluno.cadastarAluno(alunoNovo);
    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
        new ListarAlunos().setVisible(true);
    }//GEN-LAST:event_formWindowDeactivated

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastrar;
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

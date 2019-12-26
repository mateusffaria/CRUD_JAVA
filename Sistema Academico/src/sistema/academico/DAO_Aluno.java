
package sistema.academico;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DAO_Aluno extends Conexao{
    private String url;
    private String usuario;
    private String senha;

    public DAO_Aluno() {
        conexao();
        listarAlunos();
    } 
    
    private ArrayList<Aluno> alunos = new ArrayList();
    
    public void cadastarAluno(Aluno aluno){
        conexao();
        try {
            Statement st = con.createStatement();
            
            String sql = "INSERT INTO public.\"TB_ALUNOS\""
                    + "(\"DS_RA\", \"DS_CURSO\", \"DS_NOME\", \"DS_ENDERECO\", \"DS_TELEFONE\", \"DS_SEXO\") "
                    + "VALUES (?,?,?,?,?,?)";
            
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(3, aluno.getNome());
            pst.setString(1, aluno.getRA());
            pst.setString(2, aluno.getCurso());
            pst.setString(4, aluno.getEndereco());
            pst.setString(5, aluno.getTelefone());
            pst.setString(6, aluno.getSexo());
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
            pst.close();
            con.close();
        } catch (SQLException ex) {
        }        
    }
    
    public void listarAlunos(){
        String sql = "SELECT * FROM public.\"TB_ALUNOS\"";
        try {
            Statement st = con.createStatement();
            PreparedStatement pst = con.prepareCall(sql);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                Aluno aluno = new Aluno();
                aluno.setCurso(rs.getString("DS_CURSO"));
                aluno.setEndereco(rs.getString("DS_ENDERECO"));
                aluno.setNome(rs.getString("DS_NOME"));
                aluno.setRA(rs.getString("DS_RA"));
                aluno.setSexo(rs.getString("DS_SEXO"));
                aluno.setTelefone(rs.getString("DS_TELEFONE"));
                alunos.add(aluno);
            }
            con.close();
            rs.close();
            pst.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }    
    
    public void excluirAluno(String exclusao){
        conexao();
        for(int i = 0; i<alunos.size();i++ ){
            if(alunos.get(i).getRA().equals(exclusao)){
                try {
                    Statement st = con.createStatement();
                    
                    String sql = "DELETE FROM public.\"TB_ALUNOS\" WHERE ra= ?";
                    
                    PreparedStatement pst = con.prepareStatement(sql);
                    pst.setString(1, alunos.get(i).getRA());
                    pst.executeUpdate();
                    con.close();
                    
                    alunos.remove(i);
                    System.out.println("Exclusão efetuada com sucesso!");                    
                } catch (SQLException ex) {
                }
            }
        }
    }
    
    public void alterarAluno(Aluno alterar){
        conexao();
        String sql = "UPDATE public.\"TB_ALUNOS\" SET \"DS_RA\"=?, \"DS_CURSO\"=?, \"DS_NOME\"=?, \"DS_ENDERECO\"=?, \"DS_TELEFONE\"=?, \"DS_SEXO\"=? "
                + "WHERE \"DS_RA\" = ?;";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, alterar.getRA());
            pst.setString(2, alterar.getCurso());
            pst.setString(3, alterar.getNome());
            pst.setString(4, alterar.getEndereco());
            pst.setString(5, alterar.getTelefone());
            pst.setString(6, alterar.getSexo());
            pst.setString(7, alterar.getRA());
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Aluno alterado com sucesso");
            con.close();
            pst.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
        
    public void pesquisarAlunoRA(String receber){

    }    
        
    public void mostarteste(){
        for (Aluno a : alunos){
            System.out.println(a.getEndereco());
            System.out.println(a.getNome());
            System.out.println(a.getRA());
            System.out.println(a.getCurso());
            System.out.println(a.getSexo());
            System.out.println(a.getTelefone());
        }
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

}

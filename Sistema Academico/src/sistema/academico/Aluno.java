
package sistema.academico;

import java.sql.Statement;

public class Aluno extends Pessoa{
    private String curso;
    private String RA;
    
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getRA() {
        return RA;
    }
    public void setRA(String RA) {
        this.RA = RA;
    }
}

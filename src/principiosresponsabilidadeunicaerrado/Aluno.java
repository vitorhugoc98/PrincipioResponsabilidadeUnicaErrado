package principiosresponsabilidadeunicaerrado;
public class Aluno {
    private String nomeAluno; 
    private int id; 
    private float nota01;
    private float nota02; 
    private String materia;
    private float media; 

    public Aluno(String nomeAluno, int id, String materia) {
        this.nomeAluno = nomeAluno;
        this.id = id;
        this.materia = materia;
    }
    
    public float calcularMedia(){
        this.media = (this.nota01 + this.nota02) / 2;
        return media;
    }
    
    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public float getNota01() {
        return nota01;
    }

    public void setNota01(float nota01) {
        this.nota01 = nota01;
    }

    public float getNota02() {
        return nota02;
    }

    public void setNota02(float nota02) {
        this.nota02 = nota02;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }
    
    
    
}

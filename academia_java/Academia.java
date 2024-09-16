import java.util.ArrayList;
import java.util.List;

public class Academia {
    private List<Aluno> alunos;

    public Academia() {
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void listarAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    public static void main(String[] args) {
        Academia academia = new Academia();

        Aluno aluno1 = new Aluno("João", 17, 70, 1.75);
        Aluno aluno2 = new Aluno("Maria", 22, 60, 1.65);
        Aluno aluno3 = new Aluno("Pedro", 15, 80, 1.80);

        academia.adicionarAluno(aluno1);
        academia.adicionarAluno(aluno2);
        academia.adicionarAluno(aluno3);

        academia.listarAlunos();
    }
}

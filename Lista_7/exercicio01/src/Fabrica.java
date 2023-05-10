import java.util.ArrayList;
import java.util.List;

public class Fabrica {
    List<Operario> operarios;
    public Fabrica(){
        this.operarios = new ArrayList<>();
    }
    public void adicionarOperador(Operario operario){
        this.operarios.add(operario);
    }
    public void iniciarExpediente(){
        for (Operario operario : this.operarios) {
            operario.trabalhar();
        }
    }

}

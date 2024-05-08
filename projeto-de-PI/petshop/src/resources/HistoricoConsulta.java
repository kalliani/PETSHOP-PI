package resources;

import java.util.ArrayList;
import java.util.List;

public class HistoricoConsulta {
    public static List<ConsultaRotina> consultaRotina = new ArrayList<>();
    public static List<ConsultaEmergencia> consultaEmergencia = new ArrayList<>();
    
    public static void adicionarConsultaRotina(ConsultaRotina consultaRotina) {
        HistoricoConsulta.consultaRotina.add(consultaRotina);
    }
    public static void adicionarConsultaEmergencia(ConsultaEmergencia consultaEmergencia) {
        HistoricoConsulta.consultaEmergencia.add(consultaEmergencia);
    }
}
package resources;

import java.util.ArrayList;
import java.util.List;

public class HistoricoDaycare {
	public static List<Daycare> daycare = new ArrayList<>();
	
	public static void adicionarDaycare(Daycare daycare) {
        HistoricoDaycare.daycare.add(daycare);
    }
}

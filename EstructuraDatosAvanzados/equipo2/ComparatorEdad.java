package equipo2;

import java.util.Comparator;

public class ComparatorEdad implements Comparator <Alumno> {

	@Override
	public int compare(Alumno al1, Alumno al2) {
		
		int rdo = 0;
		
		if(al1 != null && al2 != null) {
			rdo = al1.getEdad() - (al2.getEdad());
			
		}else if (al1 == null) {
			rdo = 1;
		}else {
			rdo = -1;
		}
		return rdo;
	}

}

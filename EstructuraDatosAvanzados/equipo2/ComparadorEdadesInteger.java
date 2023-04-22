package equipo2;

import java.util.Comparator;

public class ComparadorEdadesInteger implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		int rdo = 0;
		
		if(o1 != null && o2 != null) {
			rdo = o1.compareTo(o2);
		}else if (o1 == null) {
			rdo = 1;
		}else {
			rdo = -1;
		}
		return 0;
	}

}

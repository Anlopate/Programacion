package chat;

import java.util.Comparator;

public class CompararMensajes implements Comparator <Mensaje> {

	@Override
	public int compare(Mensaje mns1, Mensaje mns2) {
		
		int rdo = 0;
		
		if(mns1 != null && mns2 != null ) {
			rdo = mns1.getRemitente().nombre.compareTo(mns2.getRemitente().nombre);		
		}else if (mns1 == null) {
			rdo = 1;
		}else if (mns2 == null) {
			rdo = -1;
		}
		
		return rdo;
	}

}

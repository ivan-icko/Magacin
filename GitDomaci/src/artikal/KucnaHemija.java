package artikal;

import java.util.Date;
import java.util.GregorianCalendar;

public class KucnaHemija extends Artikal {
	private Date rokTrajanja;

	public Date getRokTrajanja() {
		return rokTrajanja;
	}

	public void setRokTrajanja(Date rokTrajanja) {
		if(rokTrajanja.after(new Date())) {
		this.rokTrajanja = rokTrajanja;
		}
	}

	@Override
	public String toString() {
		return super.toString()+"KucnaHemija [rokTrajanja=" + rokTrajanja + "]";
	}
	
}

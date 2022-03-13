package magacin;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import artikal.Artikal;

public class Magacin {

	private List<Artikal>artikli=new LinkedList<Artikal>();

	public List<Artikal> getArtikli() {
		return artikli;
	}

	public void setArtikli(List<Artikal> artikli) {
		if(artikli!=null) {
		this.artikli = artikli;}
	}

	@Override
	public int hashCode() {
		return Objects.hash(artikli);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Magacin other = (Magacin) obj;
		return Objects.equals(artikli, other.artikli);
	}

	@Override
	public String toString() {
		return "Magacin [artikli=" + artikli + "]";
	}
	
	
}

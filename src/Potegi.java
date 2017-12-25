
public class Potegi {
	private int liczba = 2;
	private int potega;
	private int liczbaor;
	

	public int getLiczbaor() {
		return liczbaor;
	}

	public void setLiczbaor(int liczbaor) {
		this.liczbaor = liczbaor;
	}

	public int getLiczba() {
		return liczba;
	}

	public void setLiczba(int liczba) {
		this.liczba = liczba;
	}

	public int getPotega() {
		return potega;
	}

	public void setPotega(int potega) {
		this.potega = potega;
	}

	public Potegi(int liczbaor) {
		this.liczbaor = liczbaor;
	}
	
	public void funkcja() {
		int zmienna = 2;
		for(int i = zmienna; i < liczbaor; i++) {
			
			System.out.println(zmienna);
			zmienna = zmienna * liczba;
			
			if(zmienna > liczbaor) {
				break;
			}
		}
	}
	

}

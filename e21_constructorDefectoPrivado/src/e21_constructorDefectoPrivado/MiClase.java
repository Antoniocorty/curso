package e21_constructorDefectoPrivado;

public class MiClase {

	private int miAtributo;
	
	private MiClase() {
		//this.miAtributo = 0;
	}
	
	public MiClase(int ma) {
		this.miAtributo = ma;
	}

	public int getMiAtributo() {
		return miAtributo;
	}

	public void setMiAtributo(int miAtributo) {
		this.miAtributo = miAtributo;
	}

}

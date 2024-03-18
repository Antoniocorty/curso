package e27_bloqueInicializacion;

public class BloqueInicializacion {

	private int atributoMiembro;
	public static int atributoStatic;
	final int CONSTANTE_MIEMBRO;
	static final int CONSTANTE_STATIC; 
	
    // Bloque de inicializaci�n est�tico
    static {
        System.out.println("Este es el bloque de inicializaci�n est�tico.");
        System.out.println("Inicializamos variables y constantes static");
       
        CONSTANTE_STATIC = 10;
        atributoStatic = 15;
    }
	
    // Bloque de inicializaci�n de instancia
    {
        System.out.println("Este es el bloque de inicializaci�n de instancia.");
        System.out.println("Inicializamos constantes de instancia (miembros). Antes de llamar al constructor.");
        this.CONSTANTE_MIEMBRO = 30;            
    }
    
    // Constructor
    public BloqueInicializacion() {
        System.out.println("Ahora se est� ejecutando el constructor.");
        System.out.println("Inicializamos variables de instancia (miembros)");
        this.atributoMiembro = 40;  
    }
    
    public String toString() {
    	return  "Atributos miembros (Instancia): CONSTANTE_MIEMBRO: " + this.CONSTANTE_MIEMBRO + 
    			" - atributoMiembro: " + this.atributoMiembro + "\n" +
    			"Atributos est�ticos (Static): CONSTANTE_STATIC: " + CONSTANTE_STATIC + " - " +
    			" - atributoStatic: " + atributoStatic;    			    			
    }
    
}






package PracticaClinica;

public class Pacientes extends Persona{
	private float peso;
	private String edad;
	private String cita;
	private String historia;
	

	public Pacientes(float peso, String edad, String cita, String historia) {
		super();
		this.peso = peso;
		this.edad = edad;
		this.cita = cita;
		this.historia = historia;
	}

	public Pacientes(String dni, String nombre, String apellidos, String telefono, float peso, String edad, String cita,
			String historia) {
		super(dni, nombre, apellidos, telefono);
		this.peso = peso;
		this.edad = edad;
		this.cita = cita;
		this.historia = historia;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getCita() {
		return cita;
	}

	public void setCita(String cita) {
		this.cita = cita;
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	@Override
	public String toString() {
		return "Pacientes [peso=" + peso + ", edad=" + edad + ", cita=" + cita + ", historia=" + historia + "]";
	}
	
	public void GuardarHistoria() {
		
	}
	
	
}

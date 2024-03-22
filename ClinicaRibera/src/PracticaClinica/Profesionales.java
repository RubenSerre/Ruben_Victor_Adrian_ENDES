package PracticaClinica;

public class Profesionales extends Persona{
	private String especialidad;
	 private int turno;

	 public static final int TURNO_MANANA = 1;
	 public static final int TURNO_TARDE = 2;
	 public static final int TURNO_NOCHE = 3;
	 
	 
	 
	public Profesionales(String especialidad, int turno) {
		super();
		this.especialidad = especialidad;
		this.turno = turno;
	}

	public Profesionales(String dni, String nombre, String apellidos, String telefono, String especialidad, int turno) {
		super(dni, nombre, apellidos, telefono);
		this.especialidad = especialidad;
		this.turno = turno;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public int getTurno() {
		return turno;
	}

	@Override
	public String toString() {
		return "Profesionales [especialidad=" + especialidad + ", turno=" + turno + "]";
	}


	
	
	 
	
	 
}

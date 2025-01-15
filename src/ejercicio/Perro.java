package ejercicio;

public class Perro
{
	private Raza raza;
	private float tamano;
	private int edad;
	private String color;
	
	public Perro() {
		raza = new Raza();
		tamano = 0;
		edad = 0;
		color = "";
		
	}

	public Perro(Raza raza, float tamano, int edad, String color)
	{
		this.raza = raza;
		this.tamano = tamano;
		this.edad = edad;
		this.color = color;
	}
  // modificacion para que aparezca en git hub
	public Raza getRaza()
	{
		return raza;
	}

	public void setRaza(Raza raza)
	{
		this.raza = raza;
	}

	public float getTamano()
	{
		return tamano;
	}

	public void setTamano(float tamano)
	{
		this.tamano = tamano;
	}

	public int getEdad()
	{
		return edad;
	}

	public void setEdad(int edad)
	{
		this.edad = edad;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}
	
	
	
	
}

package ejercicio;


public class Principal
{

	public static void main(String[] args)
	{
		
		
		Raza raza1 = new Raza ("Caniche");
		Raza raza2 = new Raza ("Doberman");
		
		Perro perro1 = new Perro (raza1, 20, 3, "Marron");
		Perro perro2 = new Perro (raza2, 15, 7, "Gris");
		Perro perro3 = new Perro (raza1, 13, 3, "Negro");
		Perro perro4 = new Perro (raza2, 19, 1, "Blanco");
		
		System.out.println("La raza del perro1 es: " +  perro1.getRaza().getNombre() + " su tamaño es: " + perro1.getTamano() + ", su edad es: " + perro1.getEdad() + " y es de color: " + perro1.getColor());
		System.out.println("La raza del perro2 es: " +  perro2.getRaza().getNombre() + " su tamaño es: " + perro2.getTamano() + ", su edad es: " + perro2.getEdad() + " y es de color: " + perro2.getColor());
		System.out.println("La raza del perro3 es: " +  perro3.getRaza().getNombre() + " su tamaño es: " + perro3.getTamano() + ", su edad es: " + perro3.getEdad() + " y es de color: " + perro3.getColor());
		System.out.println("La raza del perro4 es: " +  perro4.getRaza().getNombre() + " su tamaño es: " + perro4.getTamano() + ", su edad es: " + perro4.getEdad() + " y es de color: " + perro4.getColor());
	}

}

package es.studium;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("es/studium/xml/beans.xml");
		
		Centro c1 = (Centro) appContext.getBean("centro1");
		Centro c2 = (Centro) appContext.getBean("centro2");
		
		Alumno aA = (Alumno) appContext.getBean("aA");
		Alumno bB = (Alumno) appContext.getBean("bB");
		Alumno cC = (Alumno) appContext.getBean("cC");
		Alumno eE = (Alumno) appContext.getBean("eE");
		Alumno fF = (Alumno) appContext.getBean("fF");
		
		
		System.out.println("La dirección de los centros son:");
		System.out.println(c1.getNombreCentro() + ": " + c1.getDireccionCentro());
		System.out.println(c2.getNombreCentro() + ": " + c2.getDireccionCentro());
		System.out.println();
		
		System.out.println("Dirección del centro donde está matriculado Carmen:");
		System.out.println(cC.getCentro().getDireccionCentro());
		System.out.println();
		
		System.out.println("Nota de Benito en el B2:");
		System.out.println(bB.getNota());
		
		
		
		
		
		
		((AbstractApplicationContext) appContext).close();

	}

}

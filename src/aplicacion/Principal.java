package aplicacion;

import dominio.Articulo;
import dominio.Proyecto;
import dominio.Catedratico;
import dominio.ProfesorTitular;

public class Principal{ 

public static void main(String[] args) {
	
		Articulo articulo1 = new Articulo("El gran invento",1.367);
		Articulo articulo2 = new Articulo("Lo nunca visto",2.765);
		Articulo articulo3 = new Articulo("Pasen y vean",1.987);
		Articulo articulo4 = new Articulo("El no va más del " +"qué se yo", 2.134);

		Proyecto proyecto1 = new Proyecto("El puente de " +"Villar del Río", 1000000);
		Proyecto proyecto2 = new Proyecto("El acueducto de " +"Villar del Campo",2000000);
		Proyecto proyecto3 = new Proyecto("El sistema de " +"información de " +"Villar del Río",1200000);
		ProfesorTitular pt1 = new ProfesorTitular("Antonio");

		pt1.annadirMerito(articulo1);
		pt1.annadirMerito(articulo2);

		pt1.annadirMerito(proyecto1);

		Catedratico ct1 = new Catedratico("Manuel");
		ct1.annadirMerito(articulo3);
		ct1.annadirMerito(articulo4);
		ct1.annadirMerito(proyecto2);
		ct1.annadirMerito(proyecto3);

		
		System.out.println("La valoración del catedrático es "+ ct1.calcularValoracion() + "$");
	}
}

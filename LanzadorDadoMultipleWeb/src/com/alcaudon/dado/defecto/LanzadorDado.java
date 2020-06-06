package com.alcaudon.dado.defecto;

import com.alcaudon.dado.servicios.ServicioLanzadorDado;

public class LanzadorDado {

	private static final Integer NUM_MINIMO = 1;
	private static final Integer NUM_MAXIMO = 6;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer dado = 0;
		
		ServicioLanzadorDado serv = new ServicioLanzadorDado();
		
		dado = serv.lanzaDado(NUM_MINIMO, NUM_MAXIMO);
		
		System.out.println("Lanzamiento Dado 1: " + dado);
		
		dado = serv.lanzaDado(NUM_MINIMO, NUM_MAXIMO);
		
		System.out.println("Lanzamiento Dado 2: " + dado);
		
		dado = serv.lanzaDado(NUM_MINIMO, NUM_MAXIMO);
		
		System.out.println("Lanzamiento Dado 3: " + dado);
		
		dado = serv.lanzaDado(NUM_MINIMO, NUM_MAXIMO);
		
		System.out.println("Lanzamiento Dado 4: " + dado);
		
		dado = serv.lanzaDado(NUM_MINIMO, NUM_MAXIMO);
		
		System.out.println("Lanzamiento Dado 5: " + dado);
		
	}

}

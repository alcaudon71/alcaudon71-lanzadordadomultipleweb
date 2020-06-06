package com.alcaudon.dado.servicios;

import java.util.*;

import com.alcaudon.dado.utilidades.UtilidadesLanzadorDado;

public class ServicioLanzadorDado {

	private static final Integer DELAY = 4500; // milisegundos
	
	UtilidadesLanzadorDado utils;
	
	/*
	 * Genera un numero aleatorio entre 1 y el numMaximo proporcionado
	 */
	public Integer lanzaDado(Integer numMinimo, Integer numMaximo) {
		
		Integer dado;
		Random aleatorio = new Random();	
		
		utils.wait(DELAY);
		
		Long semillaTimestamp = System.currentTimeMillis();
		
		System.out.println("Timestamp: " + semillaTimestamp);
		
		aleatorio.setSeed(semillaTimestamp);
	
		Integer limite = numMaximo - numMinimo;
		
		// Producir nuevo int aleatorio entre 0 y limite-1
		Integer intAleatorio = aleatorio.nextInt(limite);
		
		//System.out.println("Numero aleatorio: " + intAleatorio);
		
		dado = intAleatorio + numMinimo;
		
		return dado;
		
	}
	
}

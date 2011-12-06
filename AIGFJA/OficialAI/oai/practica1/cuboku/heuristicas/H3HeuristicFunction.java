//
// Universidad Complutense de Madrid
// Ingeniería Informática
//
// PRACTICA : Practica 1
// ASIGNATURA : Inteligencia Artificial e Ingeniería del Conocimiento
//
package oai.practica1.cuboku.heuristicas;

import oai.practica1.cuboku.Cuboku;
import aima.core.search.framework.HeuristicFunction;

/**
 * Heuristica
 * 
 * @author Jose Angel Garcia Fernandez
 * @version 1.0 04/12/2011
 */
public class H3HeuristicFunction implements HeuristicFunction {

	public double h(Object state) {
		Cuboku board = (Cuboku) state;
		int retVal = 0;

		return retVal;

	}

	@Override
	public String toString() {
		return "h3";
	}
}
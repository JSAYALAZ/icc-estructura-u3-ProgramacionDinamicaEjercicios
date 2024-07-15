package Ejercicio;

import java.util.ArrayList;
import java.util.List;

/*
 * Implementa un método para devolver todos los subconjuntos de un arreglo de enteros
 * 
 * Se puede sin recursividad
 * Ejemplo:
 *  Input: [1,2,3]
 *
 *  Output:
 *    [
 *      [1,2,3],
 *      [1,2],
 *      [1,3],
 *      [2,3],
 *      [1],
 *      [2],
 *      [3],
 *      []
 *    ]
 * 
 * El  metodo me debe devolver una lista de listas de enteros. 
 * Se puede usar varios metodos 
 * 
 * Ecoja la mejor estructura de datos para que sea mas eficiente
 */
public class EjercicioUno {

    public List<List<Integer>> subsets(List<Integer> set) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        result.add(new ArrayList<Integer>());
        for (int i = 0; i < set.size(); i++) {
            List<List<Integer>> newSubsets = new ArrayList<List<Integer>>();
            for (List<Integer> subset : result) {
                List<Integer> newSubset = new ArrayList<Integer>(subset);
                newSubset.add(set.get(i));
                newSubsets.add(newSubset);
            }
            result.addAll(newSubsets);
        }
        return result;

    }
}

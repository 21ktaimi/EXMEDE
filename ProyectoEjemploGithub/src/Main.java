
public class Main {

	public static void main(String[] args) {

		contar(5,10);//Queremos pintar un cuadrado de tamaño 5

	}

/**
 * El siguiente metodo muestra los numeros que hay entre el parametro desde y hasta,
 * separados por comas,  por ejemplo 2,3,4
 * 
 * @param desde indica el numero por el que se empieza a contar
 * @param hasta indica el numero hasta el que se quiere contar
 */
	private static void contar(int desde, int hasta) {
		for(int i=desde;i<=hasta-1;i++) {
			System.out.print(i+",");
		}
		System.out.print(hasta);
	}

}

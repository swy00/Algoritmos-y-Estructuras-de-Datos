package tp1.ejercicio9;

import java.util.Stack;

public class TestBalanceo {
	public static boolean validarExpresion(String exp) {
		int i = 0;
		boolean esValida = true;
		String poppedElem;
		Stack<String> pilaChar = new Stack<String>();
		
		while (i < exp.length() && esValida) {
			if (exp.charAt(i) == '(') {
				pilaChar.push("(");
			} else if (exp.charAt(i) == '[') {
				pilaChar.push("[");
			} else if (exp.charAt(i) == '{') {
				pilaChar.push("{");
			} else if (pilaChar.isEmpty()) {
				esValida = false;
			} else if (exp.charAt(i) != ' ') {
				//Caso que el caracter no es de apertura y no es vacio
				//Me guardo el ultimo de apertura guardado en la pila
				poppedElem = pilaChar.pop();
				
				//Checkeo que tipo de cierre es y me fijo si coincide con la apertura
				if (exp.charAt(i) == ')') {
					if (!poppedElem.equals("("))
						esValida = false;
				}
				if (exp.charAt(i) == ']') {
					if (!poppedElem.equals("["))
						esValida = false;
				}
				if (exp.charAt(i) == '}') {
					if (!poppedElem.equals("{"))
						esValida = false;
				}
			}
			i++;
		}
		//Caso de que llegue al final y la pila no este vacia, significa que hay una apertura sin su cierre
		if (!pilaChar.isEmpty())
			esValida = false;
		
		return esValida;
	}
}

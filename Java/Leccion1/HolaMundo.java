package Leccion1;

import javax.naming.ldap.SortKey;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.xml.transform.Source;

public class HolaMundo {

    public static void main(String[] args) {
        /*
         * System.out.println("Hola mundo en java");
         * 
         * int miVariable = 10;
         * System.out.println(miVariable);
         * miVariable = 5;
         * System.out.println(miVariable);
         * //Tipo String
         * String miVariableCadena = "bienvenidos";
         * System.out.println(miVariableCadena);
         * miVariableCadena = "sigamos creciendo en programación";
         */

        // Var - inferencia de tipos en Java
        /*var miVariableEntera2 = 10;
        var miVariableCadena2 = "Seguimos estudiando";
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        // soutv +tab
        // para ejecutar shift + F6 es la tecla para mayuscula
        // Reglas para definir una variable en Java

        var usuario = "Osvaldo";
        var titulo = "Ingeniero";
        var union = titulo + usuario;
        System.out.println("Union = " + union);

        var a = 8;
        var b = 4;
        System.out.println(usuario + (a + b));*/

        //Ejercicio: Caracteres Especiales con Java
        /*var nombre = "Natalia";
        System.out.println("\nNueva linea: \n"+nombre); // Diagonal inversa y letra n
        System.out.println("Tabulador: \t"+nombre);//Tabulador un espacio para centrar
        System.out.println("\t\t.: MENÚ:.");
        System.out.println("Retroseso: \b\b" + nombre);//Caracter de Retroseso
        System.out.println("comillas simples: \'"+ nombre + "'");
        System.out.println("comillas dobles:\"" + nombre +"\"");*/

        //Calse Scanner
        /*Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nombre: ");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = "+ usuario2);
        System.out.println("Escriba el titulo: ");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado: "+ titulo2+" "+usuario2);*/


        /*byte numEnteroByte = 127;
        System.out.println("numEnteroByte = " + numEnteroByte);
        System.out.println("Valor minimo del Byte: " + Byte.MIN_VALUE);
        System.out.println("Valor Maximo del Byte: "+ Byte.MAX_VALUE);*/

        /*short numEnteroShort = 32767;
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("Valor minimo del short: "+Short.MIN_VALUE);
        System.out.println("Valor maximo del short: "+Short.MAX_VALUE);*/

        /*int numEnteroInt = (int)2147483648L;
        System.out.println("numEnteroInt = " + numEnteroInt);
        System.out.println("Valor minimo del int:" + Integer.MIN_VALUE);
        System.out.println("Valor maximo del int: " + Integer.MAX_VALUE);*/

        /*long numEnteroLong = 923372036854775807L;
        System.out.println("numEnteroLong = " + numEnteroLong);
        System.out.println("Valor minimo del long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo del long: " + Long.MAX_VALUE);*/

        /*float numFloat = (float)3.4028235E38;
        System.out.println("numFloat = " + numFloat);
        System.out.println("El valor minimo de float: "+ Float.MIN_VALUE);
        System.out.println("El valor maximo de float: "+ Float.MAX_VALUE);*/

        /*double numDouble = 1.7976931348623157E308;
        System.out.println("numDouble = " + numDouble);
        System.out.println("El valor minimo de double: "+ Double.MIN_VALUE);
        System.out.println("El valor maximo de double: "+ Double.MAX_VALUE);*/

        //Inferencia de tipos var y tipos primitivos
        /*var numEntero = 20; //Las literales sin punto automaticamente son int
        System.out.println("numEntero = " + numEntero);
        var numFloat = 10.0; //Automaticamente con el punto se transforma en tipo double
        System.out.println("numFloat = " + numFloat);
        var numDouble = 10.0;
        System.out.println("numDouble = " + numDouble);*/

        //Tipos primitivos char
        /*char miVariableChar = 'a';
        System.out.println("miVariableChar = " + miVariableChar);

        char varCaracter = '\u0024'; //Indicamos a java la asignación con el codigo unicode
        System.out.println("varCaracter = " + varCaracter);
        char varCaracterDecimal = 36; //Valor decimal del juego de caracteres unicode
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        char varCaracterSimbolo = '$'; //UN caracter especial, podemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);

        char varCaracter1 = '\u0024'; //Indicamos a java la asignación con el codigo unicode
        System.out.println("varCaracter1 = " + varCaracter1);
        char varCaracterDecimal1 = (char)36; //Valor entero y le asgina un tipo int
        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
        char varCaracterSimbolo1 = '$'; //UN caracter especial, podemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo1 = " + varCaracterSimbolo1);

        int varEnteroChar = '$';
        System.out.println("varEnteroChar = " + varEnteroChar);
        int caracterChar = 'b';
        System.out.println("caracterChar = " + caracterChar);*/

        //Tipos primitivos tipos booleanos 
        /*boolean varBool = true;
        System.out.println("varBool = " + varBool);

        if (varBool) {
            System.out.println("La bandera es verde");
        }
        else {
            System.out.println("La bandera es roja");
        }

        //Algoritmo: ¿Es mayor de edad?
        var edad = 18; //Literal tener presente la inferencia de tipos
        //var adulto = edad >= 18; //Esta es una expresión booleana
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }
        else {
            System.out.println("Eres menor de edad");
        }*/

        //Conversión de tipos primitivos
        /*var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad + 1));
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);

        //Pedir un valor
        var entrada = new Scanner(System.in);
        System.out.println("Digite su edad");
        edad = Integer.parseInt(entrada.nextLine());
        System.out.println("entrada = " + entrada);*/

        //Conversión de tipos primitivos en Java Parte 2
        /*var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);

        var fraseChar = "Programadores".charAt(4);
        System.out.println("fraseChar = " + fraseChar);

        System.out.println("Digite un caracter: ");
        fraseChar = entrada.nextLine().charAt(0);
        System.out.println("fraseChar = " + frase);*/

        /*int num1 = 5; int num2 = 4;
        var solucion = num1 + num2;
        System.out.println("Solución de la suma = " + solucion);

        solucion = num1 - num2;
        System.out.println("solucion de la resta = " + solucion);

        solucion = num1 * num2;
        System.out.println("solución de la multiplicación = " + solucion);

        solucion = num1 / num2;
        System.out.println("solución de la división = " + solucion);

        var solucion2 = 3.4 /num2;
        System.out.println("solucion2 resultado de la división = " + solucion);

        solucion = num1 % num2; //Guarda el residuo entero de la división
        System.out.println("solución = " + solucion); // 5/4

        if(num2 %2 == 0)
            System.out.println("Es un número Par");
        else
            System.out.println("Es un número Impar");*/

        /*int varNum1 = 1, varNum2 = 4;;
        var varNum3 = varNum1 + 6 - varNum2; //Una operación
        System.out.println("varNum3 = " + varNum3);

        varNum1 += 1;
        System.out.println("varNum1 = " + varNum1);

//      -=  *=  /=  %=
        varNum2 -= 2;
        System.out.println("varNum2 = " + varNum2);
        varNum1 *= 5;
        System.out.println("varNum1 = " + varNum1); 
        varNum3 /= 4;
        System.out.println("varNum3 = " + varNum3);
        varNum1 %= 6;
        System.out.println("varNum1 = " + varNum1);*/

        //Operadores unarios: Cambio de Signo
        /*var varA = 7;
        var varB = -varA;
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB); //El resultado será un número negativo

        //Operador de Negación
        var varC = true; //Esta literal por default en Java es de tipo boolean
        var varD = !varC; //Aqui esta invirtiendo el valor
        System.out.println("varC = " + varC);
        System.out.println("varD = " + varD);

        //Operadores Unarios de Incremento: preincremento
        var varE = 9; //Se va a modificar su valor
        var varF = ++varE; //Simbolo antes de la variable
        //Primero se incrementa la variable y despues se usa su valor 
        System.out.println("varE = " + varE); //Se incremente en la unidad
        System.out.println("VarF = " + varF); //Va a sumar uno

        //Postincremento (el simbolo después de la variable)
        var varG = 3;
        var varH = varG++; //Primero el valor de la variable, luego el incremento
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);

        //Operadores Unarios de decremento: Predecremento
        var varI = 4;
        var varJ = --varI;
        System.out.println("varI = " + varI);
        System.out.println("varJ = " + varJ);

        // Postdecremento
        var varK = 8;
        var varL = varK--; //Primero el valor de la variable luego queda el decremento
        System.out.println("varK = " + varK);
        System.out.println("varL = " + varL);*/

        //Operadores de igualdad y relaciones 
        /*var aNum = 5;
        var bNum = 4;
        var cNum = (aNum == bNum);
        System.out.println("cNum = " + cNum);

        var dNum = aNum != bNum;
        System.out.println("dNum = " + dNum);

        var cadenaA = "hello";
        var cadenaB = "bye bye";
        var cVar = cadenaA == cadenaB;
        System.out.println("cVar = " + cVar);

        var fVar = cadenaA.equals(cadenaB);
        System.out.println("fVar = "+ fVar);
     
        var gVar = aNum != bNum; //> >= < <=  == !=
        System.out.println("gVar = " + gVar;

        if (bNum % 2 == 0) {
            System.out.println("El numero es Par");
        } else {
            System.out.println("El numero es Impar");
        }

        var edad = 30;
        var adulto = 18;
        if (edad >= adulto) {
            System.out.println("Es mayor de edad");
        } 
        else {
            System.out.println("Es menor de edad");
        }

        var edad = 15;
        var adulto = 18;
        if (edad >= adulto) {
            System.out.println("Es mayor de edad");
        } 
        else {
            System.out.println("Es menor de edad");
        }*/

        //Operador  condicional And
        /*var valorA = 7;
        var valorMinimo = 0; //rango del 0 al 10
        var valorMaximo = 10; 
        var respuestas = valorA >= 0 && valorA <= 10;

        if (respuestas) {
            System.out.println("Estas dentro del rango establecido");
        } else {
            System.out.println("Esta fuera del rango establecido");
        }
        
        var vacaciones = false;
        var diaLibre = true;
        if(vacaciones || diaLibre){
            System.out.println("Papá puede asistir al juego de su hijo");
        }else {
            System.out.println("Papá no puede asistir al juego de su hijo");
        }*/

        //Operador Ternario
        /*var resultadoT = (5 > 8) ? "Es Par" : "Es Impar";
        System.out.println("resultadoT = " + resultadoT);

        var numeroT = 4;
        var resultadoT = (numeroT % 2 == 0) ? "Es Par" : "Es Impar";
        System.out.println("resultadoT = " +resultadoT);*/

        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x= " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        var solucionAritmetica = 4 + 5 *6 / 3; //4 + ((5*6) /3) = 30/3= 10 + 4= 4
        System.out.println("solucionAritmetica = " + solucionAritmetica);

        solucionAritmetica = (4+5) * 6 / 3; //4 + 5 = 9 *6 = 54/3 = 18
        System.out.println("solucionAritmetica = " + solucionAritmetica);
    }
}

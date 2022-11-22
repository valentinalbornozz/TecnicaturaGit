// Ejercicio 1: Calcular estación del año
let mes = 9;
let estación; //Undefined

if(mes == 1 || mes == 2 || mes == 12) {
    estación = "Verano";
}
else if(mes == 3 || mes == 4 || mes == 5){
    estación = "Otoño";
}
else if(mes == 6 || mes == 7 || mes == 8){
    estación = "Invierno";
}
else if(mes == 9 || mes == 10 || mes == 11){
    estación = "Otoño";
}
else{
    estación = "Valor incorrecto";
}
console.log("El valor corresponde a la estación de: "+ estación);


// Ejercicio 2: Hora del día
/* 
de 6 a 11 nos saluda: Good Morning
de 12 a 16 nos saluda: Good Afternoon
de 17 a 19 nos saluda: Good Evening
de 20 a 23 nos saluda: Good Night
Trabajaremos con 24 horas
*/
let horaDia = 9;
let mensaje;
if(horaDia >= 6 && horaDia <= 11){
    mensaje = "Good Morning";
}
else if(horaDia >= 12 && horaDia <= 16){
    mensaje =  "Good Afternoon"
}
else if(horaDia >= 17 && horaDia <= 19){
    mensaje =  "Good Evening"
}
else if(horaDia >= 20 && horaDia <= 23){
    mensaje =  "Good Night"
}
else{
    mensaje = "Valor Incorrecto"
}
console.log(mensaje);

// Estructura switch(la sintaxis es igual a java)
switch(mes){//No solo se pueden utilizar número, también cadenas
    case 1: case 2: case 12:
    estación = "Verano";
    break;
    case 3: case 4: case 5:
    estación = "Otoño";
    break;
    case 6: case 7: case 8:
    estación = "Invierno";
    break;
    case 9: case 10: case 11:
    estación = "Primavera";
    break;
    default:
        estación = "Valor Incorrecto";
}
console.log("Bienvenido a la estacón de: "+estación);


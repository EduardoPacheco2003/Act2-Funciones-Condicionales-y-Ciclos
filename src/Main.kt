//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val base = 5;
    val altura = 10;
    val profundidad = 10;

    val areaRec = areaRectangulo(base, altura);
    println("Area de rectangulo: $areaRec");

    val prismaRec = volumenPrisma(base, altura, profundidad);
    println("Volumen de prisma: $prismaRec");

    //4 Utilizar la función promedio, Comentar qué pasa si se ingresa sólo una calificación en la función y después con dos.
    // Finalmente, buscar que la función corra enviando únicamente la tercera calificación con 10f.

    //No se puede llamar la función con un solo parámetro, ya que el tercer parámetro no tiene un valor por defecto.
    //val promedio1 = promedioCalificaciones(10);

    //No se puede llamar la función con dos parámetros, ya que el tercer parámetro no tiene un valor por defecto.
    //val promedio2 = promedioCalificaciones(10, 10);

    //Se puede llamar la funcion ya que especificamos el tercer parametro
    val promedio = promedioCalificaciones(calif3 = 10);
    println("Promedio de 8-8-10: $promedio");

    tipoTriangulo(5, 5, 5);
    tipoTriangulo(5, 5, 6);
    tipoTriangulo(5, 6, 7);

    // 6 Con When identificar si el tipo de dato es:
    //String
    //Int
    //Double
    //Otro
    val dato1 = "Hola";
    val dato2 = 5;
    val dato3 = 5.5;
    val dato4 = true;
    tipoDato(dato1);
    tipoDato(dato2);
    tipoDato(dato3);
    tipoDato(dato4);

    val listaNombres = listOf(
        "Pedro Luis",
        "Juan Manuel",
        "Juan Luis",
        "María Inés",
        "Romeo",
        "Ernesto",
        "Juan Pedro",
        "Ariadna",
        "Mireya María",
        "Ana Sofía",
        "José Juan"
    );

    val nombreRepetido = "Juan";
    val numRepetidos = repeticionesNombre(nombreRepetido, listaNombres);
    println("Numero de veces que se repite $nombreRepetido: $numRepetidos");


}

//1 Crear una función que calcule el área de un rectángulo por medio de su base y altura, implementarla en main.
fun areaRectangulo(base: Int, altura: Int): Int {
    return base * altura;
}

//2 Crear otra función para calcular el volumen de un prisma rectangular, utilizar la función de área.
fun volumenPrisma(base: Int, altura: Int, profundidad: Int): Int {
    return areaRectangulo(base, altura) * profundidad;
}

// 3 Crear una función que entregue el promedio de tres calificaciones.
// Esta debe recibir dos parámetros con calificaciones por defecto 8, y el tercer parámetro no debe venir predefinido.
fun promedioCalificaciones(calif1: Int = 8, calif2: Int = 8, calif3: Int): Int {
    return (calif1 + calif2 + calif3) / 3;
}

//5 Crear una función que pida como parámetros las medidas de los lados de un triángulo. Debe imprimirnos el tipo de tríangulo:
// equilátero, isósceles o escaleno.
fun tipoTriangulo(lado1: Int, lado2: Int, lado3: Int) {
    if (lado1 == lado2 && lado2 == lado3) {
        println("Triangulo equilatero");
    } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
        println("Triangulo isosceles");
    } else {
        println("Triangulo escaleno");
    }
}

fun tipoDato(dato: Any) {
    when (dato) {
        is String -> println("Es un String");
        is Int -> println("Es un Int");
        is Double -> println("Es un Double");
        else -> println("Es otro tipo de dato");
    }
}

/*
7 Crear y utilizar una función que regrese el número de veces
que se repite un nombre en la siguiente lista de nombres:
Pedro Luis, Juan Manuel, Juan Luis, María Inés, Romeo, Ernesto, Juan Pedro, Ariadna, Mireya María, Ana Sofía, José Juan
*/

fun repeticionesNombre(nombre: String, listaNombres: List<String>): Int {
    return listaNombres.count { it -> it.contains(nombre) };
}
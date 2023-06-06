

fun main(){
    //Mapa inmutable
    val ladas: Map<Int, String> = mapOf(
        1 to "USA",
        34 to "España",
        52 to "Mexico";
        233 to "Ghana"
    );
   //imprimiendo el conjunto de pares clave-valor 
    println(ladas);
    //imprimiendo el mapa usando un for
    for ((key ladas)) {
        println("La clave lada de $value es $key");
   
    } 
}


    //recuperar un solo elemento del mapa 
    println(ladas.get(52));
    println(ladas[52]);

    //rECUPERAR S TAMAÑO CUANDO PARES HAY EN EL MAPA 
    println("Tamaño: ${ladas.size}");
    //recuperar solo las claves 
    println("Claves del mapa: ${ladas.keys}")
    //recuperar solo los valores 
    println("valores del mapa: ${ladas.values}");
    //recuperar las entradas 
    println("Entradas del mapa: ${ladas.entries}")
    //recuperar un valor si existe, sino, envia a default
    println("valor de la lada 48: ${ladas.getOrDefault(48, "Pais desconocido)}");

    println(" mapa estas vacio: ${ladas,isEmpty()}");

    //comprobando si esxiste una clave en el mapa 
    println("exixte la clave lada 86: ${86 in ladas});

    //comprobar si existe un vlaor en el mapa
    println("Mexico" in ladas.values);

}

//reto ;
//crear un directorio español . ingles usando un mapa 
//1. funcion crear o cargar el direccionario 
//2. funcion para consulta,  reciba una palabra en español 
y regrese su traduccion, sino exixte traduccion un valor por default 
//3. imprimir todo el diccionario 
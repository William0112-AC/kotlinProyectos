    fun main(){
    //lista inmutable
    val readOnly : List<String> = listOf("lunes", "Martes", "Miercoles", "Jueves");
    println(readOnly);
    println("Tamaño de la lista: ${readOnly.size}");
    println("Elemento en la posicion 3: &{readOnly.get(3)}");
    println("Primer elemento de la lista: &{readOnly.first()}");
    println("Primer elemento de la lista: &{readOnly.last()}");


}
//Mostrar los elementos de la lista usando el metodo forEach
println("Elementos de readOnly usando forEach:");
readOnly.forEach{
    println(it)
}
//lista mutable 
var mutableList : mutableList<String> = mutableListOf("Lines", "Martes");
    println("Lista mutable: $mutableListNull");
    mutableList.add("Miercoles");
    println("Lista mutable: $mutableListNull");
    println("Lista mutabl");

    
   // Trabajando con listas mutables  vacias 
    var emptyList : mutableList<String> = mutableListOf();
println("¿La lista esta vacia ?:${emptyList.none()}");



//Ordenar una Lista 
val nuemeroDeLoteria = listaOf (11, 2, 44, 33, 56, 78, 66);
println("Numeros de loteria: $numerosDeLoteria");
val numerosOrdenados = numerosDeLoteria.sorder();
println("Numeros ordenados:  $numeros¿Ordenados");
val numerosDecendentes = numerosDeLoteria.sortedDescending();
println("Numeros ordenados en forma decendente: $numerosecendentes");
}

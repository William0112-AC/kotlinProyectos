fun main(){

    val a=10; //inmutable
    val b=5; //inmutable
    var c= 0; //mutable(su valor va a cambiar)


println("Operadores");
//suma 
//c = a + b;
c = a.plus(b);

println("$c= $a + $b");

//resta
//c=a-b;
c= a.minus(b);
println("$c= $a - $b");

//comparaciones
println("b > a");
println(b.compareTo(a)>0); // b>a
println("a > b");
println(a.compareTo(b)>0); // a>b
//println("$a > $b=" + (a>b)); 
println("b < a");
println(b.compareTo(a)<0); // b<a
println("a < b");
println(a.compareTo(b)<0); // a<b


// a==b
println("a == b:");
println(a.equals(b));

//a!=b
println("a != b :");
println(!(a.equals(b)));


}
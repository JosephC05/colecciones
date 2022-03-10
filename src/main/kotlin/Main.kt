fun main(args: Array<String>) {
    //collection<T>: Iterable<T>

    val palabras = listOf<String>("Cafe","Chocolate")

    //recorrer la lista

    palabras.forEach{
        println(it)
    }

    val palabrasquesiagrega = mutableListOf<String>()
    palabrasquesiagrega.add("Cafe")
    palabrasquesiagrega.add("Monster")
    palabrasquesiagrega.add("vive 100")

    for (palabra in palabrasquesiagrega){
        println(palabra)
    }
    //palabras[0] = "Hola"

    val numeros= ArrayList<Int>()
    numeros.add(8)
    numeros.add(7)
    numeros.add(9)

    numeros.forEach{
        println("Numero: $it")
    }

}

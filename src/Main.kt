import java.io.File
import java.io.IOException

fun main() {

    println("Type anything to save in file")
    val string = readLine()
    if (string != null) {

        try {
            val myFile = File("myFile.txt")
            myFile.printWriter().use { out ->

               out.println(string)
            }

            println("Done")

        }catch (e: IOException){
            println(e)
        }

    }

}

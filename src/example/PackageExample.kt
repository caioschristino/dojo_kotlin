@file:JvmName("Utils")

package example

import java.text.SimpleDateFormat
import java.util.*

val family: List<String> = listOf("Caio", "Barbara", "Joaquim")

fun sayHello(): String {
    return "Hello World\n"
}

fun getDateTime(): String {
    return SimpleDateFormat("dd/M/yyyy hh:mm:ss").format(Date()) + "\n"
}

fun calCircumference(radius: Double, pi: Double = Math.PI): String = ((2 * pi) * radius).toString() + "\n"

fun sadSomething(say: String): String {
    return "You sad: $say\n"
}

fun sayfullName(firstName: String, lastName: String, middleName: String): Unit {
    print("Your name is $firstName $middleName $lastName\n")
}

fun printInts(vararg ints: Int): Unit {
    for (n in ints) {
        print("$n\t")
    }
}

fun createUser(id: Int): Pair<String?, String?> {
    require(id > 0) { "id inválida" }

    val nomes: Map<Int, String> = mapOf(1 to "Caio", 102 to "Barbara", 104 to "Joca")
    val cidades: Map<Int, String> = mapOf(1 to "Sbc", 102 to "Sp", 104 to "Scs")

    val nome = nomes[id]
    val cidade = cidades[id]
    return Pair(nome, cidade)
}

fun createUserWithID(id: Int): Triple<String?, String?, Int> {
    require(id > 0) { "id inválida" }

    val nomes: Map<Int, String> = mapOf(1 to "Caio", 102 to "Barbara", 104 to "Joca")
    val cidades: Map<Int, String> = mapOf(1 to "Sbc", 102 to "Sp", 104 to "Scs")

    val nome = nomes[id]
    val cidade = cidades[id]
    return Triple(nome, cidade, id)
}

@JvmOverloads
fun calCircumference(radius: Double) = ((2 * Math.PI) * radius).toString() + "\n"

fun whatSizeofString(func: () -> Unit) {
    func()
}

fun printCircumferenceAndArea(radius: Double) {
    fun calCircumference(radius: Double): Double = (2 * Math.PI) * radius
    val circumference = "%.2f".format(calCircumference(radius))

    fun calArea(radius: Double): Double = (Math.PI) * Math.pow(radius, 2.0)
    val area = "%.2f".format(calArea(radius))

    print("The circle circumference of $radius radius is $circumference and area is $area")
}

infix fun <A, B> A.to(that: B): Pair<A, B> = Pair(this, that)

enum class Rank {
    TWO, THREE, FOUR, FIVE,
    SIX, SEVEN, EIGHT, NINE,
    TEN, JACK, QUEEN, KING, ACE;

    infix fun of(suit: Suit) = Card(this, suit)
}

enum class Suit {
    HEARTS,
    SPADES,
    CLUBS,
    DIAMONDS
}

data class Card(val rank: Rank, val suit: Suit)
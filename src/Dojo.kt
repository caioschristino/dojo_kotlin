import example.*
import example.getDateTime as getDate

val iSad = sadSomething("I sad something")
val calc = calCircumference(2.0)
val usuario = createUser(101)

fun main() {
    print(sayHello())

    print(getDate())

    print(sadSomething("My first example using kotlin"))

    print(iSad)

    print(calc)

    sayfullName("Caio", "Christino", "Sanchez")

    sayfullName(firstName = "Christino", middleName = "Caio", lastName = "Sanchez")

    print(calCircumference(20.0))

    print(calCircumference(20.0, 3.14))

    printInts(1, 2, 3, 4, 5, 6)

    print("${usuario.first} born in: ${usuario.second}")

    val (name, local, id) = createUserWithID(101)
    print("User id:$id - $name born in: $local")

    print(family.last())
    print(family.last({ x -> x == "Barbara" }))
    print(family.last { x -> x == "Barbara" })

    whatSizeofString {
        print(family.last { x -> x == "Barbara" }.length)
    }

    val circle = Circle()
    circle.calculateArea(3.3)

    print(family.last { it.length == 4 })
    val search = family.last(fun(string): Boolean { return string.length == 4 })
    print(search)

    printCircumferenceAndArea(3.3)

    val myFamily = Family()
    myFamily addMemberToFamily "Caio"
    myFamily addMemberToFamily "Barbara"
    myFamily addMemberToFamily "Joaquim"

    val brDDiCode = 55 to "BR"
    print("${brDDiCode.second} is the code DDI to ${brDDiCode.first} country")

    val card = Rank.QUEEN of Suit.HEARTS
    print("${card.rank} of ${card.suit}")
}
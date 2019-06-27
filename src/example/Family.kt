package example

class Family {
    val members = mutableListOf<String>()

    infix fun addMemberToFamily(s: String) {
        members.add(s)
    }
}
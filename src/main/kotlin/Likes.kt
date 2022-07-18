fun main() {
    print("Введите число лайков: ")
    val likes: UInt = readln().toUInt()
    val printLikes =
        if (likes == 1u || likes % 10u == 1u && likes % 100u != 11u) "человеку" else "людям"
    print("Понравилось $likes $printLikes")
}
import kotlin.random.Random

const val DISCOUNT: UInt = 100_00u
const val PERCENTDISCOUNT: Double = 0.05
const val PERCENTMELOMAN: Double = 0.01

fun main() {

    val firstLimit = 1000_00u
    val secondLimit = 10000_00u
    val meloman = Random.nextBoolean()

    print("Сумма предыдущей покупки в рублях: ")
    val previousAmount = (readln().toUInt() * 100u)

    val sumAmount = if (previousAmount <= firstLimit) previousAmount
    else if (previousAmount <= secondLimit) previousAmount - DISCOUNT
    else previousAmount - (previousAmount.toDouble() * PERCENTDISCOUNT).toUInt()

    val sumAmountMeloman = if (meloman) sumAmount - (sumAmount.toDouble() * PERCENTMELOMAN).toUInt()
    else sumAmount

    println("Сумма покупки с учетом скидок: ${sumAmountMeloman / 100u} руб.")
}
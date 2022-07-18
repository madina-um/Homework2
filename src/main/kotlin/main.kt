const val PersentTransaction: Double = 0.0075
const val MinMoneyTransfer: UInt = 3500u

fun main() {

    print("Введите сумму перевода в рублях: ")

    val transactionRub = (readln().toUInt() * 100u).toDouble()
    val moneyTransferFee = (transactionRub * PersentTransaction).toUInt()
    val amountKop = if (moneyTransferFee > MinMoneyTransfer) moneyTransferFee else MinMoneyTransfer
    val allPayment = (amountKop + transactionRub.toUInt()) / 100u

    println("Комиссия за перевод составит $amountKop коп.")
    println("Сумма перевода, включая комиссию: $allPayment руб.")
}
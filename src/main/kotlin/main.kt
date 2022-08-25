package ru.netology

fun main() {
    val amount: Int = 719_000
    val min_amount: Int = 3_500
    val transfer_fee: Double = 0.75

    var amount_transfer_fee: Int = 0
    if (amount >= min_amount) {
        amount_transfer_fee = (amount * transfer_fee / 100).toInt()
        println("Комиссия составляет: $amount_transfer_fee коп.")
    } else
        println("Минимальная сумма перевода 35 руб.")
}
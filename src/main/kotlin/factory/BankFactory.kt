package factory

/**
Abstract Factory is a creational design pattern that provide an
interface for creating families of  related or dependent objects
without specifying their concrete classes.
 **/
class BankFactory {
    companion object {
        fun getBank(bankType: BankType): Bank {
            return when (bankType) {
                BankType.TPBANK -> TPBank()
                BankType.VIETCOMBANK -> VietcomBank()
                else -> throw IllegalArgumentException("This bank type is invalid")
            }
        }
    }
}

enum class BankType {
    TPBANK,
    VIETCOMBANK
}
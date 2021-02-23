package factory

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
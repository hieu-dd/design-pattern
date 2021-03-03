package structuralpattern.bridgepattern

class VietcomBank(private val account: Account) : Bank(account) {
    override fun openAccount() {
        print("Vietcom open account is")
        account.openAccount()
    }
}
package structuralpattern.bridgepattern

class TPBank(private val account: Account) : Bank(account) {
    override fun openAccount() {
        print("TpBank open account")
        account.openAccount()
    }
}
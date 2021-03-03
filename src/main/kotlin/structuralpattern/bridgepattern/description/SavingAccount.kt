package structuralpattern.bridgepattern.description

import structuralpattern.bridgepattern.Account

class SavingAccount:Account {
    override fun openAccount() {
        print("open saving account")
    }
}
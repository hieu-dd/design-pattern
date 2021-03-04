package structuralpattern.bridgepattern

class CheckingAccount : Account {
    override fun openAccount() {
        print("Open checking account")
    }
}
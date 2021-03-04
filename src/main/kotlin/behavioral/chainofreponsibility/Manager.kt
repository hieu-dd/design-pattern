package behavioral.chainofreponsibility

class Manager : Approver() {
    override fun canApprove(leftDays: Int): Boolean {
        return leftDays <= 3
    }

    override fun approving() {
        println("Manager approved")
    }
}
package behavioral.chainofreponsibility

class Supervisor : Approver() {

    override fun canApprove(leftDays: Int): Boolean = leftDays <= 5

    override fun approving() {
        println("Supervisor approved")
    }
}
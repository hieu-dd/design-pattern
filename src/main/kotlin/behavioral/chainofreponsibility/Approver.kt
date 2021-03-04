package behavioral.chainofreponsibility

abstract class Approver {
    var nextApprover: Approver? = null

    abstract fun canApprove(leftDays: Int): Boolean

    fun approveLeave(leftDays: Int) {
        if (canApprove(leftDays)) {
            approving()
        } else nextApprover?.approveLeave(leftDays)
    }

    abstract fun approving()

}
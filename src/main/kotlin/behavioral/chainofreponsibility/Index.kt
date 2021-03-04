package behavioral.chainofreponsibility

fun main() {
    LeaveFlow.getApprover().approveLeave(2)
    // manager approved
    LeaveFlow.getApprover().approveLeave(4)
    // supervisor approved
}
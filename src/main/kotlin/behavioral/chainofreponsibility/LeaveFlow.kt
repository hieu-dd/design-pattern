package behavioral.chainofreponsibility

class LeaveFlow {
    companion object {
        fun getApprover(): Approver {
            val supervisor = Supervisor()
            val manager = Manager()
            manager.nextApprover = supervisor
            return manager
        }
    }
}
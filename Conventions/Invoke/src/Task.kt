class Invokable {
    var numberOfInvocations: Int = 0
        private set

    operator fun invoke(): Invokable {
        return this.apply { numberOfInvocations++ }
    }
}

fun invokeTwice(invokable: Invokable) = invokable()()

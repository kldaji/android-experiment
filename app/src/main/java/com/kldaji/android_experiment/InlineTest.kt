package com.kldaji.android_experiment

class InlineTest {
    inline fun inLineFunc(a: Int, b: Int, op: (Int, Int) -> Int) {
        println(op(a, b))
    }

    fun test() {
        inLineFunc(1, 2) { a, b -> a + b }
    }
}

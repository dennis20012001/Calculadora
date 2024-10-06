package com.example.calculadoraloca

@Throws(Exception::class)
fun doOperation(operation: String): String? {
    var ret: String? = null
    val firstNumber: String
    val lastNumber: String


    if (isAddition(operation)) {
        firstNumber = operation.substring(0, operation.lastIndexOf("+"))
        lastNumber = operation.substring(operation.lastIndexOf("+") + 1)
        ret = "" + add(
            firstNumber.trim { it <= ' ' }.toInt(),
            lastNumber.trim { it <= ' ' }.toInt()
        )
    } else if (isSubtraction(operation)) {
        firstNumber = operation.substring(0, operation.lastIndexOf("-"))
        lastNumber = operation.substring(operation.lastIndexOf("-") + 1)
        ret = "" + substract(
            firstNumber.trim { it <= ' ' }.toInt(),
            lastNumber.trim { it <= ' ' }.toInt()
        )
    } else if (isMultiplication(operation)) {
        firstNumber = operation.substring(0, operation.lastIndexOf("*"))
        lastNumber = operation.substring(operation.lastIndexOf("*") + 1)
        ret = "" + multiply(
            firstNumber.trim { it <= ' ' }.toInt(),
            lastNumber.trim { it <= ' ' }.toInt()
        )
    } else if (isDivision(operation)) {
        firstNumber = operation.substring(0, operation.lastIndexOf("/"))
        lastNumber = operation.substring(operation.lastIndexOf("/") + 1)
        ret = "" + division(
            firstNumber.trim { it <= ' ' }.toInt(),
            lastNumber.trim { it <= ' ' }.toInt()
        )
    }
    return ret
}
fun isDivision(operation: String): Boolean {
    var ret = false
    val countAdd = operation.length - operation.replace("/", "").length
    val countSubs = operation.length - operation.replace("-", "").length
    if (countAdd == 1 && countSubs == 0) ret = true
    return ret
}


fun isMultiplication(operation: String): Boolean {
    var ret = false
    val countAdd = operation.length - operation.replace("*", "").length
    val countSubs = operation.length - operation.replace("-", "").length
    if (countAdd == 1 && countSubs == 0) ret = true
    return ret
}

private fun isAddition(operation: String): Boolean {
    var ret = false
    val countAdd = operation.length - operation.replace("+", "").length
    val countSubs = operation.length - operation.replace("-", "").length
    if (countAdd == 1 && countSubs == 0) ret = true
    return ret
}

private fun isSubtraction(operation: String): Boolean {
    var ret = false
    val countAdd = operation.length - operation.replace("-", "").length
    val countSubs = operation.length - operation.replace("+", "").length
    if (countAdd == 1 && countSubs == 0) ret = true
    return ret
}

private fun add(op1: Int, op2: Int): Int {
    return op1 + op2
}

private fun substract(op1: Int, op2: Int): Int {
    return op1 - op2
}

fun division(op1: Int, op2: Int): Int {
    return op1 / op2
}

fun multiply(op1: Int, op2: Int): Int {
    return op1 * op2
}


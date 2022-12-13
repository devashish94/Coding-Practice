import java.lang.Integer.parseInt
import java.util.Stack
import kotlin.math.pow

class Converter {
    private fun isLetter(token: Char) : Boolean {
        if (token.lowercaseChar() in 'a'..'z') {
            return true
        }
        return false
    }

    private fun isOperator(token: Char) : Boolean {
        when (token) {
            '+', '-', '/', '*', '%', '^' -> return true
        }
        return false
    }

    private fun isNumber(x: String) : Boolean {
        var check = true
        try {
            val s = parseInt(x)
        } catch (e: NumberFormatException) {
            check = false
        }
        return check
    }

    /* This function only supports operators -> +, -, *, /, %, ^ (pow) */
    private fun precedence(token: Char) : Int {
        when (token) {
            '+', '-' -> return 1
            '/', '*', '%' -> return 2
            else -> when (token) {
                '(', ')' -> return 0
            }
        }
        return 3
    }

    private fun evaluate(one: Int, two: Int, i: Char): Int {
        when (i) {
            '+' -> return (one + two)
            '-' -> return (one - two)
            '*' -> return (one * two)
            '/' -> return (one / two)
            '%' -> return (one % two)
            '^' -> return (one.toDouble().pow(two.toDouble())).toInt()
        }
        return -1
    }

    fun createExpression(expression: String): List<String> {
        return expression.split(" ")
    }

    fun infixToPostfix(expression: String) : String {
        /* Logic for infix to postfix
        *  a. if token isOperand == true, then put in output-string
        *  b. if token isOperand == false, then check:
        *       -> if operator-stack top precedence greater >= token, then pop till precedence <
        *       -> else, push into operator-stack
        * c. if token scanning end and operator-stack isEmpty == false, then pop stack till isEmpty == true
        *    and keep on adding it into the output-string
        * d. if token == '(', push '(' into stack
        * e. if token == ')' keep doing pop till stack-top == '('. pop one more time
        */
        var output = ""
        val s: Stack<Char> = Stack<Char>()
        for (i in expression) {
            if (i == '(') {
                s.push('(')
            } else if (i == ')') {
                while (s.peek() != '(') {
                    output += s.pop()
                }
                s.pop()
            } else if (isOperator(i)) {
                while (!s.empty() && precedence(s.peek()) >= precedence(i)) {
                    output += s.pop()
                }
                s.push(i)
            } else {
                output += i
            }
        }
        while (!s.empty()) {
            if (s.peek() == '(') {
                s.pop()
            } else {
                output += s.pop()
            }
        }
        return output
    }

    fun postfixEvaluate(expression: List<String>) : Int {
        /* Logic in Summary
        *  Put all the numbers inside a stack. reverse the stack
        *  Start reading the expression from left to right
        *  if current token is an operator, pop two times and apply the operation
        *  push the resulting number from the evaluation
        */
        val s: Stack<Int> = Stack<Int>()
        for (i in expression) {
            if (!isNumber(i)) {
                val two: Int = s.pop(); val one: Int = s.pop()
                s.push(evaluate(one, two, i[0]))
            } else {
                s.push(i.toInt())
            }
        }
        return s.pop()
    }
}

fun main() {
    val converter = Converter()
    val expression = "x^y/(5*z)+2"
    println(converter.infixToPostfix(expression))
}

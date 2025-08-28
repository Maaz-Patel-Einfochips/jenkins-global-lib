def call(Number a, Number b, String operation) {
    switch(operation.toLowerCase()) {
        case "add":
        case "+":
            return a + b
        case "subtract":
        case "-":
            return a - b
        case "multiply":
        case "*":
            return a * b
        case "divide":
        case "/":
            if (b == 0) {
                return "Error: Division by zero!"
            }
            return a / b
        default:
            return "Invalid operation. Use add/subtract/multiply/divide or + - * /"
    }
}

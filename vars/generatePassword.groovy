def generatePassword(int length = 12) {
    def upper = ('A'..'Z').join()
    def lower = ('a'..'z').join()
    def digits = ('0'..'9').join()
    def special = "!@#$%^&*()-_=+[]{}<>?/"

    def allChars = (upper + lower + digits + special).toList()
    def random = new Random()

    // Ensure at least one of each type
    def password = []
    password << upper[random.nextInt(upper.size())]
    password << lower[random.nextInt(lower.size())]
    password << digits[random.nextInt(digits.size())]
    password << special[random.nextInt(special.size())]

    // Fill remaining characters randomly
    (length - 4).times {
        password << allChars[random.nextInt(allChars.size())]
    }

    // Shuffle to make it random
    Collections.shuffle(password, random)
    return password.join()
}

// Example usage:
// println generatePassword(12)

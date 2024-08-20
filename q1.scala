object InterestCalculator {

  def calculateInterest(deposit: Double): Double = {
    // Define the interest rate using pattern matching and lambda functions
    val interestRate: Double = deposit match {
      case d if d <= 20000   => 0.02
      case d if d <= 200000  => 0.04
      case d if d <= 2000000 => 0.035
      case _                 => 0.065
    }

    // Calculate the interest
    val calculateInterest: Double => Double = amount => amount * interestRate
    calculateInterest(deposit)
  }

  def main(args: Array[String]): Unit = {
    // Get user input for the deposit amount
    println("Enter the deposit amount (Rs.):")
    val depositInput = scala.io.StdIn.readLine()

    // Convert the input to a Double
    val deposit = depositInput.toDouble

    // Calculate and print the interest
    val interest = calculateInterest(deposit)
    println(s"The interest on Rs. $deposit is Rs. $interest")
  }
}

object NumberClassifier {
  def main(args: Array[String]): Unit = {
    // Check if user input is required
    if (args.length != 1) {
      println("Enter a number:")
      val input = scala.io.StdIn.readLine().toInt

      // Define a lambda function to classify the number using pattern matching
      val classifyNumber: Int => String = {
        case x if x <= 0       => "Negative/Zero is input"
        case x if x % 2 == 0   => "Even number is given"
        case x if x % 2 != 0   => "Odd number is given"
      }

      // Print the result
      println(classifyNumber(input))
    } else {
      // Parse the command-line argument as an integer
      val input = args(0).toInt

      // Define a lambda function to classify the number using pattern matching
      val classifyNumber: Int => String = {
        case x if x <= 0       => "Negative/Zero is input"
        case x if x % 2 == 0   => "Even number is given"
        case x if x % 2 != 0   => "Odd number is given"
      }

      // Print the result
      println(classifyNumber(input))
    }
  }
}

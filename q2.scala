object NumberClassifier {
  def main(args: Array[String]): Unit = {
    // Ensure there's exactly one argument passed from the command line
    if (args.length != 1) {
      println("Please provide a single integer as input.")
    } else {
      // Parse the command-line argument as an integer
      val input = args(0).toInt

      // Define a function to classify the number using pattern matching
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

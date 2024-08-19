object NameFormatter {

  // Method to convert a string to uppercase
  def toUpper(name: String): String = name.toUpperCase

  // Method to convert a string to lowercase
  def toLower(name: String): String = name.toLowerCase

  // Method to format the name using a passed function
  def formatNames(name: String)(formatFunc: String => String): String = {
    formatFunc(name)
  }

  def main(args: Array[String]): Unit = {
    // Test inputs with desired outputs
    println(formatNames("Benny")(toUpper))            // Output: BENNY
    println(formatNames("Niroshan")(name => {
      val upperPart = name.substring(0, 2).toUpperCase
      val lowerPart = name.substring(2).toLowerCase
      upperPart + lowerPart
    })) // Output: NIroshan
    println(formatNames("Saman")(toLower))            // Output: saman
    println(formatNames("Kumara")(name => {
      val upperPart = name.substring(0, 1).toUpperCase
      val lowerPart = name.substring(1, name.length - 1).toLowerCase
      val lastChar = name.substring(name.length - 1).toUpperCase
      upperPart + lowerPart + lastChar
    })) // Output: KumarA
  }
}

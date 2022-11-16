import scala.io.Source

object Main {
  def main(args: Array[String]): Unit = {
    println("Welcome on the project of Simon and Massimo")

    //Path of the excel file
    val filename = "src/ExcelFile/08-PropertiesLondon.csv"

    //Print the content of the file
    for (line <- Source.fromFile(filename).getLines){
      val cols = line.split(",").map(_.trim)
      // do whatever you want with the columns here
     // println(s"${cols(0)}|${cols(1)}|${cols(2)}|${cols(3)}|${cols(4)}|${cols(5)}|${cols(6)}|${cols(7)}|${cols(8)}|${cols(9)}|${cols(10)}|${cols(11)}|${cols(12)}|${cols(13)}|${cols(14)}|${cols(15)}|${cols(16)}|${cols(17)}|${cols(18)}|${cols(19)}|${cols(20)}")
      println(line)
    }
  }
}

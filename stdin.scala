import java.util.Scanner
import scala.collection.mutable.ListBuffer
object Main extends App {
  val scanner = new Scanner(System.in)
  val lines: ListBuffer[String] = ListBuffer()
  while (scanner.hasNext) {
    lines += scanner.nextLine()
  }
  println(lines)
  scanner.close
}

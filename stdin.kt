fun main(args : Array<String>) {
    var line : String?
    val lines: ArrayList<String> = arrayListOf()
    do {
      line = readLine()
      if (line == null) 
        break
      lines.add(line)
    } while (true)
    println(lines)
}
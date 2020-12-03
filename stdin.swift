var lines = [String]();
while true {
  let str:String? = readLine()
  if let str = str{
    lines.append(str)
  }else{
    break
  }
}
print(lines)
using System;
using System.Collections.Generic;
public class Hello
{
  public static void Main()
  {
    string line;
    var array = new List<string>();
    while ((line = Console.ReadLine()) != null)
    {
      array.Add(line);
    }
    Console.WriteLine(array);
  }
}
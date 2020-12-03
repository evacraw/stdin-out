# stdin in various languages
競技プログラミングなどで使う標準入力を取得するテンプレートコードを様々な言語で書いています。
stdin template code in various languages

## 対応言語 (Surpported languages)
 - JavaScript
 - Python3
 - Ruby
 - PHP
 - Swift
 - Java
 - C#
 - Kotlin
 - Scala
 - Perl
 - Go
 - C++

## 期待される動作(Expected behaviour)
複数行に渡って文字列が入力された場合に、各行の値を配列に格納して出力する

## 規則(Rules)
 1. 全ての言語において入力を格納する配列名をlinesとする
 2. 全ての言語において、lines[0]またはlines(0)で1つ目の要素、lines[1]またはlines(1)で2つ目の要素が取得できるように配列に格納している
 3. 必ずしも全ての言語で```["value","value"]```と出力されるようにプログラムしている訳ではなく、あくまで2.を前提にコードを書いている

## 使い方(Usage)

Input

```
Hello
World
```

#### JavaScript
```
$ node stdin.js
```

=> [ 'Hello', 'World' ]
#### Python3
```
$ Python stdin.py
```

=> ['Hello', 'World']
#### Ruby
```
$ ruby stdin.rb
```

=> ["Hello", "World"]
#### PHP
```
$ php stdin.php
```

=> Hello

=> World
#### Swift
```
$ swift stdin.swift
```

=> ["Hello", "World"]
#### Java
```
$ java stdin.java
```

=> [Hello, World]
#### C#
```
$ dotnet run
```

=> System.Collections.Generic.List`1[System.String]
#### Kotlin
```
$ kotlinc stdin.kt
$ kotlin StdinKt
```

=> [Hello, World]
#### Scala
```
$ scala stdin.scala
```

=> ListBuffer(Hello, World)
#### Perl
```
$ perl stdin.perl
```

=> Hello,World
#### Go
```
$ go run stdin.go
```

=> Hello,World
#### C++
```
$ g++ -o a.out stdin.cpp
$ ./a.out
```

=> Hello

=> World

=> 

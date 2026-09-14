package com.example.lab_1

fun main() {
    // 1. VARIABLES (Переменные)


    // 1. Объявить переменную x типа Int и присвоить значение 10
    var x: Int = 10

    // 2. Создать константу pi типа Double со значением 3.14159
    val pi: Double = 3.14159

    // 3. Объявить переменную isActive типа Boolean и задать false
    var isActive: Boolean = false

    // 4. Создать переменную temperature типа Float, присвоить 36.6
    var temperature: Float = 36.6f

    // 5. Объявить переменную count типа Long и присвоить большое число
    var count: Long = 9_876_543_210L

    // 6. Объявить переменную letter типа Char и присвоить 'A'
    var letter: Char = 'A'

    // 7. Создать две переменные a, b типа Int, сложить их и вывести результат
    val a: Int = 15
    val b: Int = 25
    println("Смма a + b: ${a + b}")

    // 8. Создать переменную radius и вычислить площадь круга
    val radius: Double = 5.0
    val area: Double = pi * radius * radius
    println("Площадь круга: $area")

    // 9. Создать переменную salary типа Int, увеличить на 15% и вывести
    var salary: Int = 50000
    salary = (salary * 1.15).toInt()
    println("Зарплата + 15%: $salary")

    // 10. Создать переменную price и вычислить цену с налогом (НДС 12%)
    val price: Double = 1000.0
    val priceWithVat: Double = price * 1.12
    println("Цена с НДС 12%: $priceWithVat")



    // 2. DATA TYPES (Типы данных)
    println("\n--- Data Types ---")

    // 1. Переменные разных типов
    val intVal: Int = 42
    val doubleVal: Double = 99.99
    val boolVal: Boolean = true
    val stringVal: String = "Hello Kotlin"
    val charVal: Char = 'K'

    // 2. Преобразовать Double в Int и вывести результат
    val dNumber: Double = 45.89
    val iNumber: Int = dNumber.toInt()
    println("Double 45.89 в Int: $iNumber")

    // 3. Создать переменную num = 1234, преобразовать в строку
    val num: Int = 1234
    val numStr: String = num.toString()

    // 4. Взять строку "56", преобразовать в Int и умножить на 2
    val str56: String = "56"
    val result56: Int = str56.toInt() * 2
    println("\"56\" * 2 = $result56")

    // 5. Проверить, что число 10 больше 5, вывести результат в Boolean
    val isGreater: Boolean = 10 > 5
    println("10 > 5: $isGreater")

    // 6. Переменная isEven, хранящая результат проверки чётности числа
    val testNumber: Int = 8
    val isEven: Boolean = testNumber % 2 == 0
    println("Число $testNumber чётное: $isEven")

    // 7. Преобразовать Boolean в строку
    val flag: Boolean = false
    val flagStr: String = flag.toString()

    // 8. Вывести минимальное и максимальное значение для типа Int
    println("Int Min: ${Int.MIN_VALUE}, Int Max: ${Int.MAX_VALUE}")

    // 9. Создать переменную ch = 'b', преобразовать её в Int
    val ch: Char = 'b'
    val chInt: Int = ch.code
    println("Код символа '$ch': $chInt")

    // 10. Создать переменную num = 97, преобразовать в символ
    val num97: Int = 97
    val char97: Char = num97.toChar()
    println("Символ с кодом 97: '$char97'")



    // 3. STRING (Строки)

    // 1. Создать строку "Kotlin" и вывести её длину
    val strKotlin: String = "Kotlin"
    println("Длина строки \"$strKotlin\": ${strKotlin.length}")

    // 2. Вывести первый и последний символ строки "Hello"
    val strHello: String = "Hello"
    println("Первый символ: ${strHello.first()}, Последний: ${strHello.last()}")

    // 3. Объединить строки "Good" и "Morning" в одну
    val combinedStr: String = "Good" + " " + "Morning"
    println("Объединение: $combinedStr")

    // 4. Создать строку "banana", заменить "a" на "o"
    val banana: String = "banana"
    println("banana с заменой 'a' на 'o': ${banana.replace('a', 'o')}")

    // 5. Сконкатенировать имя и возраст в одну строку с шаблоном
    val name: String = "Алексей"
    val age: Int = 21
    val info: String = "Имя: $name, Возраст: $age"
    println(info)

    // 6. Дана строка "Welcome". Вывести подстроку с 1 по 3 символ (индексы 0..2)
    val welcome: String = "Welcome"
    println("Подстрока (1-3 символы): ${welcome.substring(0, 3)}")

    // 7. Создать строку " Kotlin ", удалить пробелы по краям
    val paddedStr: String = " Kotlin "
    println("Без пробелов: '${paddedStr.trim()}'")

    // 8. Проверить, содержится ли слово "Java" в строке "I love Java and Kotlin"
    val text: String = "I love Java and Kotlin"
    println("Содержит 'Java': ${text.contains("Java")}")

    // 9. Преобразовать "Hello, World!" в верхний регистр
    println("Hello, World!".uppercase())

    // 10. Преобразовать "HELLO" в нижний регистр
    println("HELLO".lowercase())

    // 11. Подсчитать количество слов в "Kotlin is fun"
    val funText: String = "Kotlin is fun"
    val wordCount: Int = funText.trim().split("\\s+".toRegex()).size
    println("Количество слов: $wordCount")

    // 12. Повторить строку "abc" 3 раза
    println("abc".repeat(3))

    // 13. Преобразовать "123" в список символов
    val charList: List<Char> = "123".toList()
    println("Список символов: $charList")

    // 14. Проверить, является ли "racecar" палиндромом
    val racecar: String = "racecar"
    val isPalindrome: Boolean = racecar == racecar.reversed()
    println("'$racecar' палиндром: $isPalindrome")

    // 15. Из строки "apple,banana,orange" сделать список слов
    val fruitsStr: String = "apple,banana,orange"
    val fruitList: List<String> = fruitsStr.split(",")
    println("Список фруктов: $fruitList")
}
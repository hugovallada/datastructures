# BIG O

## O que é o Big O
É uma maneira de comparar 2 códigos de maneira matemática

## Time Complexity
Não é medida em tempo
É medido em numero de operações feitas para atingir o objetivo.
Não usa o tempo, pois em um computador mais rápido, terminaria mais rápido

## Space Complexity
É a quantidade de memória usada para atingir o objetivo

## Time and Space Complexity
Quando trabalhando com time e space complexity, veremos 3 letras gregar: 
    - Omega
    - Theta
    - Omicron -> Tbm conhecida como Oh.

    Em um array de 7 elementos ([1, 2, 3, 4, 5, 6, 7]):
        - Melhor caso: 1 -> Será o Omega
        - Average caso: 4 -> Será o Theta
        - Pior caso: 7 -> Será o Omicron ou Oh

    BigO técnicamente é sempre o Pior caso, mas muitas vezes vc vai ver perguntando qual o Melhor O, ou o Average O, mas seriam o Omega e Theta respectivamente.

### BigO O(n)
É o mais facil de se entender
O(n) -> Temos um numero n, e esse loop n vezes
O(n) -> Sempre será uma linha reta, proporcional

```kotlin
fun printItems(n: Int) {
    for (i in 0..n-1) {
        println(i)
    }

    for (j in 0 until n) {
        println(j)
    }
}

printItems(10)

```

### BigO Drop Constants
n + n = 2n -> O(n)... ainda é O(n), pq removemos a constante, pode ser O(2n), O(100n), vai ser sempre n.

### O(n²)
```kotlin

fun printItems(n: Int) {
    for (i in 0 until n) {
        for (j in 0 until n) {
            println("$i $j")
        }
    }
} 

fun main() {
    printItems(10)
}
```
Nesse caso, vai rodar n*n
O(n²) cresce muito mais rapido
Se vc tiver O(n²) e conseguir reescrever para O(n), é um grande ganho de eficiencia


### Drop Non Dominants
```kotlin
fun printItems(n: Int) {
    for (i in 0 until n) {
        for (j in 0 until n) {
            println("$i $j")
        }
    }

    for (k in 0 until n) {
        println(k)
    }
} 

printItems(10)
```

O primeiro loop rodou O(n²) e o segundo rodou O(n)
Ou seja, foi O(n²) + O(n) que é o mesmo que O(n² + n)

O n² é o dominante e o n é o não dominante

### O(1) - Constant Time
Só tem uma operação, não importa o quanto n cresça, vai ter só uma operação
```kotlin
fun addItems(int n) {
    return n+n
}
```

### O(log n)

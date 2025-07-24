type Fruit = 'apple' | 'melon' | 'mango' // 타입 리터럴

function printFruit(item: Fruit) {
  console.log(item)
}

printFruit('apple')
//printFruit("orange")
let fruit2: string = 'orange'
fruit2 = fruit2 as Fruit
console.log(fruit2)

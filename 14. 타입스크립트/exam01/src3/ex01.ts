// class Point {
//   public x: number
//   public y: number
//   constructor(x: number, y: number) {
//     this.x = x
//     this.y = y
//   }
// }

class Point {
    constructor(public x: number, public y?: number) {}
}

const p1 = new Point(10)
console.log(`x:${p1.x}, y:${p1.y}`)

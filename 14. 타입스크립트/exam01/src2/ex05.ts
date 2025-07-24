/**
 * 접근 제어자
 * public : 객체 생성시 외부에서도 접근 가능
 * protected :  상속을 통한 클래스 내부에서만 접근 가능
 * private : 클래스 내부에서만 가능
 *
 */
// class Point {
//   public x: number
//   public y: number

//   constructor(x: number, y: number) {
//     this.x = x
//     this.y = y
//   }
// }

class Point {
    constructor(public x: number, public y: number) {}
}

const p = new Point(10, 20)
console.log(p.x, p.y)

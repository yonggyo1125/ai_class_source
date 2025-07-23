// 원시 타입 자료형 : number, string, boolean, null, undefined ..
let employeeName: string = '이이름'

// 배열
const fruits: string[] = [] // 문자열로  된 값만 배열에 추가 가능
fruits.push('사과')
//fruits.push(1111)

// 배열 - string, number 자료형으로 한정하는 경우 - Union 연산자 | 이용
const fruits2: (string | number)[] = [1, '사과']

// 배열 - 자료형의 갯수와 순서를 고정 - 튜플
const fruits3: [string, number] = ['사과', 10]

// 객체 타입
// type userType = {
//   name: string
//   age: number
//   address?: string // ? : 옵셔널 체이닝, 있어도 되고 없어도 되는 경우
// }
// const user: userType = {
//   name: '이이름',
//   age: 40,
// }

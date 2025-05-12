import add2, { sub as minus, PI } from './libs/calculator';

console.log(add2(10, 20));
//console.log(sub(20, 10), PI);
console.log(minus(20, 10));


function App2() {
    return <h1>모듈 테스트</h1>   
}

export default App2;
import { useState } from 'react';

const Counter = () => {
  const [number, setNumber] = useState(0);
  let cnt = 0;

  console.log('호출!', number);

  const onPlus = () => {
    setNumber(number + 1);

    console.log('cnt', cnt);
    cnt++;
  };
  return (
    <>
      <h1>{number}</h1>
      <button type="button" onClick={() => setNumber(number - 1)}>
        -1
      </button>
      <button type="button" onClick={onPlus}>
        +1
      </button>
    </>
  );
};

export default Counter;

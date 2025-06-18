import { useState, useRef, useEffect } from 'react';

const Counter = () => {
  const [number, setNumber] = useState(0);

  const cntRef = useRef(0);
  const h1Ref = useRef();

  useEffect(() => {
    console.log('h1Ref.current', h1Ref.current);
    h1Ref.current.style.background = 'orange';
  }, [h1Ref]);

  const onIncrease = () => {
    setNumber(number + 1);
    console.log('cntRef.current', cntRef.current);
    cntRef.current++;
  };
  const onDecrease = () => setNumber(number - 1);

  return (
    <>
      <h1 ref={h1Ref}>{number}</h1>
      <button type="button" onClick={onDecrease}>
        -1
      </button>
      <button type="button" onClick={onIncrease}>
        +1
      </button>
    </>
  );
};

export default Counter;

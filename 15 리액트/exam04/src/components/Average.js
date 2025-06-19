import React, { useState, useCallback, useMemo } from 'react';
import AverageChild1 from './AverageChild1';

const getAverage = (items) => {
  if (items.length === 0) return 0;

  const total = items.reduce((a, b) => a + b);

  const avg = Math.round((total / items.length) * 10) / 10;
  console.log('getAverage() 호출!');

  return avg;
};

const Average = () => {
  const [items, setItems] = useState([]);
  const [number, setNumber] = useState('');

  const onChange = useCallback((e) => {
    try {
      setNumber(Number(e.target.value.trim()));
    } catch (e) {}
  }, []);

  const onSubmit = useCallback(
    (e) => {
      e.preventDefault();
      setItems((items) => items.concat(number));
    },
    [number],
  );

  // items가 변경되지 않으면 기존에 연산된 값을 기록하고 그걸 사용, items가 바뀌면 새로 호출 값을 저장
  const avg = useMemo(() => getAverage(items), [items]);

  return (
    <>
      <form onSubmit={onSubmit} autoComplete="off">
        <input type="number" onChange={onChange} />
        <button type="submit">등록</button>
      </form>
      <ul>
        {items.map((item, i) => (
          <li key={i + '-' + item}>{item}</li>
        ))}
      </ul>
      <div>평균: {avg}</div>
      <AverageChild1 />
      {/*<div>평균: {getAverage(items)}</div> */}
    </>
  );
};

export default React.memo(Average);

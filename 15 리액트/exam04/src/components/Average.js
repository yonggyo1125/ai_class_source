import { useState, useCallback } from 'react';

const getAverage = (items) => {
  if (items.length === 0) return 0;

  const total = items.reduce((a, b) => a + b);

  const avg = Math.round((total / items.length) * 10) / 10;
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
      <div>평균: {getAverage(items)}</div>
    </>
  );
};

export default Average;

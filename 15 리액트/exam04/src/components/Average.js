import { useState, useCallback } from 'react';

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
        <input type="number" onChange={onChange} value={number} />
        <button type="submit">등록</button>
      </form>
    </>
  );
};

export default Average;

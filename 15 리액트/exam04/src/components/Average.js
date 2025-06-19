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
};

export default Average;

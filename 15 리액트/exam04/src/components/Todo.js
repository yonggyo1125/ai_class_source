import { useState } from 'react';

const Todo = () => {
  const [items, setItems] = useState([
    { id: 1, title: '할일1' },
    { id: 2, title: '할일2' },
    { id: 3, title: '할일3' },
  ]);
  const [title, setTitle] = useState();

  const onClick = () => {
    setItems((prev) => prev.concat({ id: prev.length, title }));
  };

  return (
    <>
      <input
        type="text"
        onChange={(e) => setTitle(e.target.value)}
        value={title}
      />
      <button type="button" onClick={onClick}>
        등록
      </button>

      <ul>
        {items.map(({ id, title }) => (
          <li key={id}>{title}</li>
        ))}
      </ul>
    </>
  );
};

export default Todo;

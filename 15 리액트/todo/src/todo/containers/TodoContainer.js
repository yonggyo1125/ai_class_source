import { useState } from 'react';
import TodoForm from '../components/TodoForm';
import TodoItems from '../components/TodoItems';

const TodoContainer = () => {
  const [form, setForm] = useState({});
  const [items, setItems] = useState([]);

  const onSubmit = (e) => {
    e.preventDefault();

    setItems(items.concat({ ...form, id: Date.now() }));
  };

  const onChange = (e) => {
    setForm({ ...form, [e.target.name]: e.target.value });
  };

  return (
    <>
      <TodoForm onSubmit={onSubmit} onChange={onChange} form={form} />
      <TodoItems items={items} />
    </>
  );
};

export default TodoContainer;

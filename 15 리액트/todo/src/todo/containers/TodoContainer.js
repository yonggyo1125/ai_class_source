import { useState } from 'react';
import TodoForm from '../components/TodoForm';
import TodoItems from '../components/TodoItems';

const TodoContainer = () => {
  const [todo, setTodo] = useState();

  const onSubmit = (e) => {
    e.preventDefault();
    console.log('todo', todo);
  };

  const onChange = (e) => {
    setTodo(e.target.value);
  };

  return (
    <>
      <TodoForm onSubmit={onSubmit} onChange={onChange} />
      <TodoItems />
    </>
  );
};

export default TodoContainer;

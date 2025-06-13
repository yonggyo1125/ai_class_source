import { FaPlusSquare } from 'react-icons/fa';

const TodoForm = ({ onSubmit, onChange }) => {
  return (
    <form onSubmit={onSubmit}>
      <input type="text" onChange={onChange}/>
      <button type="submit">
        <FaPlusSquare />
      </button>
    </form>
  );
};

export default TodoForm;

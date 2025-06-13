import { FaPlusSquare } from 'react-icons/fa';

const TodoForm = ({ onSubmit, onChange, onChange2 }) => {
  return (
    <form onSubmit={onSubmit}>
      <div>
        <input type="text" onChange={onChange} placeholder="할일 제목" />
      </div>
      <div>
        <textarea onChange={onChange2} placeholder="할일 내용"></textarea>
      </div>
      <button type="submit">
        <FaPlusSquare />
      </button>
    </form>
  );
};

export default TodoForm;

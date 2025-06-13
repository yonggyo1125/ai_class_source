import { FaPlusSquare } from 'react-icons/fa';

const TodoForm = ({ onSubmit, onChange }) => {
  return (
    <form onSubmit={onSubmit}>
      <div>
        <input
          type="text"
          onChange={onChange}
          name="title"
          placeholder="할일 제목"
        />
      </div>
      <div>
        <textarea
          onChange={onChange}
          name="content"
          placeholder="할일 내용"
        ></textarea>
      </div>
      <button type="submit">
        <FaPlusSquare />
      </button>
    </form>
  );
};

export default TodoForm;

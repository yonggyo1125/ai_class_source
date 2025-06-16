import { FaPlusSquare } from 'react-icons/fa';

const TodoForm = ({ onSubmit, onChange, form }) => {
  return (
    <form onSubmit={onSubmit}>
      <div>
        <input
          type="text"
          onChange={onChange}
          name="title"
          placeholder="할일 제목"
          value={form?.title ?? ''}
        />
      </div>
      <div>
        <textarea
          onChange={onChange}
          name="content"
          placeholder="할일 내용"
          value={form?.content ?? ''}
        />
      </div>
      <button type="submit">
        <FaPlusSquare />
      </button>
    </form>
  );
};

export default TodoForm;

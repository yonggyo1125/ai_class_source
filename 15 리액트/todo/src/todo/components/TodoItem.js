import { MdCheckBox, MdCheckBoxOutlineBlank } from 'react-icons/md';
import { FaRegWindowClose } from 'react-icons/fa';

const TodoItem = ({ id, title, content, checked, onToggle, onRemove }) => {
  return (
    <li>
      <span onClick={() => onToggle(id)}>
        {checked ? <MdCheckBox /> : <MdCheckBoxOutlineBlank />}
        {title} / {content}
      </span>

      <FaRegWindowClose onClick={() => onRemove(id)} />
    </li>
  );
};

export default TodoItem;

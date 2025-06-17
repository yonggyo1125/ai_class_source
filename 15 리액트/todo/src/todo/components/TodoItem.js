import { MdCheckBox, MdCheckBoxOutlineBlank } from 'react-icons/md';
const TodoItem = ({ id, title, content, checked, onToggle }) => {
  return (
    <li onClick={() => onToggle(id)}>
      {checked ? <MdCheckBox /> : <MdCheckBoxOutlineBlank />}
      {title} / {content}
    </li>
  );
};

export default TodoItem;

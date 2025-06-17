import { MdCheckBox, MdCheckBoxOutlineBlank } from 'react-icons/md';
const TodoItem = ({ title, content, checked }) => {
  return (
    <li>
      {checked ? <MdCheckBox /> : <MdCheckBoxOutlineBlank />}
      {title} / {content}
    </li>
  );
};

export default TodoItem;

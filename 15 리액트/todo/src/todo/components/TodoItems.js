import TodoItem from './TodoItem';
import { FaInfoCircle } from 'react-icons/fa';
const TodoItems = ({ items, onToggle, onRemove, onRemoveAll }) => {
  if (!items || items.length === 0) {
    return (
      <div>
        <FaInfoCircle /> 등록된 스케줄이 없습니다.
      </div>
    );
  }

  return (
    <>
      <ul>
        {items.map((props) => (
          <TodoItem
            key={props.id}
            {...props}
            onToggle={onToggle}
            onRemove={onRemove}
          />
        ))}
      </ul>
      <button type="button" onClick={onRemoveAll}>
        선택 스케줄 삭제
      </button>
    </>
  );
};

// const TodoItems = ({ items }) => {
//   return (
//     <ul>
//       {items.map((props) => (
//         <>
//           <TodoItem {...props} />
//           {/*<TodoItem id={id} title={title} content={content} checked={checked} /> */}
//           {/*<li
//           key={id} // 한줄 주석
//         >
//           {checked ? <MdCheckBox /> : <MdCheckBoxOutlineBlank />}
//           {title} / {content}
//         </li> */}
//         </>
//       ))}
//     </ul>
//   );
// };

export default TodoItems;

import TodoItem from './TodoItem';

const TodoItems = ({ items }) => {
  return (
    <ul>
      {items.map((props) => (
        <TodoItem key={props.id} {...props} />
      ))}
    </ul>
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

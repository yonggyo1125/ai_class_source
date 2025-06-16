const TodoItems = ({ items }) => {
  return (
    <ul>
      {items.map((item) => (
        <li key={item.id}>
          {item.title} / {item.content}
        </li>
      ))}
    </ul>
  );
};

export default TodoItems;

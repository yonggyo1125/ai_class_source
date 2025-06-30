import { useState } from 'react';

const ListItem = ({ item }) => {
  const { subject } = item;
  return <li>{subject}</li>;
};

const StyledComponent2 = () => {
  const [items, setItems] = useState([
    { id: 1, subject: '제목1' },
    { id: 2, subject: '제목2' },
    { id: 3, subject: '제목3' },
    { id: 4, subject: '제목4' },
    { id: 5, subject: '제목5' },
  ]);

  return (
    <ul>
      {items.map((item) => (
        <ListItem key={item.id} item={item} />
      ))}
    </ul>
  );
};

export default StyledComponent2;

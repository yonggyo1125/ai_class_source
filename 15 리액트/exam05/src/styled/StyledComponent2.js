import { useState } from 'react';
import styled from 'styled-components';

const ListItem = ({ item, className }) => {
  const { subject } = item;
  return <li className={className}>{subject}</li>;
};

const StyledListItem = styled(ListItem)`
  border: 1px solid #000;
  padding: 8px 10px;
`;

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
        <StyledListItem key={item.id} item={item} />
      ))}
    </ul>
  );
};

export default StyledComponent2;

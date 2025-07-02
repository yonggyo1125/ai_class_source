import React, { useState, useEffect } from 'react';
import { useParams } from 'react-router-dom';

const boardList = {
  freetalk: '자유게시판',
  notice: '공지사항',
};

const ListPage = () => {
  const [title, setTitle] = useState();
  const { bid } = useParams();

  useEffect(() => {
    setTitle(boardList[bid] ?? '없는 게시판!');
  }, [bid]);

  return <h1>{title}</h1>;
};

export default React.memo(ListPage);

import React from 'react';
import { Link } from 'react-router-dom';

const MainPage = () => {
  return (
    <>
      <h1>메인페이지...</h1>
      <Link to="/member/join">회원가입</Link>
      <Link to="/member/login">로그인</Link>
      <div>
        <Link to="/board/write">글쓰기</Link>
        <Link to="/board/list">글목록</Link>
        <Link to="/board/view">글보기</Link>
      </div>
    </>
  );
};

export default React.memo(MainPage);

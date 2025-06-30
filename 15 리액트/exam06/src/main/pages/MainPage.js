import React from 'react';
import { Link } from 'react-router-dom';

const MainPage = () => {
  return (
    <>
      <h1>메인페이지...</h1>
      <Link to="/member/join">회원가입</Link>
      <Link to="/member/login">로그인</Link>
    </>
  );
};

export default React.memo(MainPage);

import React, { useCallback } from 'react';
import { Link, useNavigate } from 'react-router-dom';

const MainPage = () => {
  const navigate = useNavigate();

  const onClick = useCallback(() => {
    const seq = Math.floor(Math.random() * 100) + 1; // 1~100
    navigate(`/board/view/${seq}`, { replace: true }); // 방문기록을 남기지 않는 이동
  }, [navigate]);
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
      <button type="button" onClick={onClick}>랜덤 게시글 보기</button>
    </>
  );
};

export default React.memo(MainPage);

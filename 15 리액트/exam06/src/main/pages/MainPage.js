import React, { useCallback, useEffect } from 'react';
import { Link, useNavigate, Navigate } from 'react-router-dom';

const MainPage = () => {
  const navigate = useNavigate();
  const isLoggedIn = false; // 로그인 상태가 아니면

  const onClick = useCallback(() => {
    const seq = Math.floor(Math.random() * 100) + 1; // 1~100
    navigate(`/board/view/${seq}`, { replace: true }); // 방문기록을 남기지 않는 이동
    navigate(`/board/view/${seq}`); // 방문 기록을 남기는 이동
  }, [navigate]);

  // if (!isLoggedIn) {
  //   return <Navigate to="/login" />;
  // }

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
      <button type="button" onClick={onClick}>
        랜덤 게시글 보기
      </button>
    </>
  );
};

export default React.memo(MainPage);

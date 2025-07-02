import React from 'react';
import { Outlet } from 'react-router-dom';

const MainLayout = () => {
  return (
    <>
      <header>
        <h1>상단 공통</h1>
      </header>
      <main>
        <Outlet />
      </main>
      <footer>
        <h1>하단 공통 영역</h1>
      </footer>
    </>
  );
};

export default React.memo(MainLayout);

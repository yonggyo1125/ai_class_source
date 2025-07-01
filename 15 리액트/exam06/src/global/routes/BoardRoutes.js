import React from 'react';
import { Routes, Route } from 'react-router-dom';

import WritePage from '../../board/pages/WritePage';
import ListPage from '../../board/pages/ListPage';
import ViewPage from '../../board/pages/ViewPage';

const BoardRoutes = () => {
  return (
    <Routes>
      <Route path="/board/write" element={<WritePage />} />
      <Route path="/board/list" element={<ListPage />} />
      <Route path="/board/view" element={<ViewPage />} />
    </Routes>
  );
};

export default React.memo(BoardRoutes);

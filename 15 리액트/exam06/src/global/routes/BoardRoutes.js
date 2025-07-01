import React from 'react';
import { Routes, Route } from 'react-router-dom';

import WritePage from '../../board/pages/WritePage';
import ListPage from '../../board/pages/ListPage';
import ViewPage from '../../board/pages/ViewPage';

const BoardRoutes = () => {
  return (
    <Routes>
      <Route path="/board/">
        <Route index element={<ListPage />} />
        <Route path="write/:bid" element={<WritePage />} />
        <Route path="list/:bid" element={<ListPage />} />
        <Route path="view/:seq" element={<ViewPage />} />
      </Route>
    </Routes>
  );
};

export default React.memo(BoardRoutes);

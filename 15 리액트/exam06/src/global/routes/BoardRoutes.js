import React from 'react';
import { Routes, Route } from 'react-router-dom';

import WritePage from '../../board/pages/WritePage';
import ListPage from '../../board/pages/ListPage';
import ViewPage from '../../board/pages/ViewPage';
import ListMainPage from '../../board/pages/ListMainPage';
import MainLayout from '../layouts/MainLayout';

const BoardRoutes = () => {
  return (
    <Routes>
      <Route path="/board/" element={<MainLayout />}>
        <Route index element={<ListPage />} />
        <Route path="write/:bid" element={<WritePage />} />
        <Route path="list/">
          <Route index element={<ListMainPage />} />
          <Route path=":bid" element={<ListPage />} />
        </Route>

        <Route path="view/:seq" element={<ViewPage />} />
      </Route>
    </Routes>
  );
};

export default React.memo(BoardRoutes);

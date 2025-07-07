import React from 'react';
import { Routes, Route } from 'react-router-dom';
import loadable from '@loadable/component';

const WritePage = loadable(() => import('../../board/pages/WritePage'));
const ListPage = loadable(() => import('../../board/pages/ListPage'));
const ViewPage = loadable(() => import('../../board/pages/ViewPage'));
const ListMainPage = loadable(() => import('../../board/pages/ListMainPage'));
const MainLayout = loadable(() => import('../layouts/MainLayout'));

// import WritePage from '../../board/pages/WritePage';
// import ListPage from '../../board/pages/ListPage';
// import ViewPage from '../../board/pages/ViewPage';
// import ListMainPage from '../../board/pages/ListMainPage';
// import MainLayout from '../layouts/MainLayout';

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

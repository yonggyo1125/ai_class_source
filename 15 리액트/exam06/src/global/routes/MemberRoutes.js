import React from 'react';
import { Routes, Route } from 'react-router-dom';
import JoinPage from '../../member/pages/JoinPage';
import LoginPage from '../../member/pages/LoginPage';
import MainLayout from '../layouts/MainLayout';

const MemberRoutes = () => {
  return (
    <Routes>
      <Route path="/member/" element={<MainLayout />}>
        <Route path="join" element={<JoinPage />} />
        <Route path="login" element={<LoginPage />} />
      </Route>
    </Routes>
  );
};

export default React.memo(MemberRoutes);

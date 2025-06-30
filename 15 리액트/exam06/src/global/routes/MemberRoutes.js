import React from 'react';
import { Routes, Route } from 'react-router-dom';
import JoinPage from '../../member/pages/JoinPage';
import LoginPage from '../../member/pages/LoginPage';

const MemberRoutes = () => {
  return (
    <Routes>
      <Route path="/member/join" element={<JoinPage />} />
      <Route path="/member/login" element={<LoginPage />} />
    </Routes>
  );
};

export default React.memo(MemberRoutes);

import { Routes, Route } from 'react-router-dom';
import MainPage from './main/pages/MainPage';
import MemberRoutes from './global/routes/MemberRoutes';
import BoardRoutes from './global/routes/BoardRoutes';
import MainLayout from './global/layouts/MainLayout';

const App = () => {
  return (
    <>
      <Routes>
        <Route path='/' element={<MainLayout />}>
          <Route index element={<MainPage />} />
        </Route>
      </Routes>
      <MemberRoutes />
      <BoardRoutes />
    </>
  );
};

export default App;

import { Routes, Route } from 'react-router-dom';
import MainPage from './main/pages/MainPage';
import MemberRoutes from './global/routes/MemberRoutes';
import BoardRoutes from './global/routes/BoardRoutes';

const App = () => {
  return (
    <>
      <Routes>
        <Route path="/" element={<MainPage />} />
      </Routes>
      <MemberRoutes />
      <BoardRoutes />
    </>
  );
};

export default App;

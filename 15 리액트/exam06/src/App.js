import { Routes, Route } from 'react-router-dom';
import MainPage from './main/pages/MainPage';
import MemberRoutes from './global/routes/MemberRoutes';

const App = () => {
  return (
    <>
      <Routes>
        <Route path="/" element={<MainPage />} />
      </Routes>
      <MemberRoutes />
    </>
  );
};

export default App;

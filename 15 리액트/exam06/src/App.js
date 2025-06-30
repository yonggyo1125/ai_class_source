import { Routes, Route } from 'react-router-dom';
import MainPage from './main/pages/MainPage';
import JoinPage from './member/pages/JoinPage';
import LoginPage from './member/pages/LoginPage';

const App = () => {
  return (
    <Routes>
      <Route path="/" element={<MainPage />} />
      <Route path="/member/join" element={<JoinPage />} />
      <Route path="/member/login" element={<LoginPage />} />
    </Routes>
  );
};

export default App;

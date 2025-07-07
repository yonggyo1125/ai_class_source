import { createContext } from 'react';

// context 저장소 생성
const ColorContext = createContext({
  color: 'black',
});

export default ColorContext;

import { useContext } from 'react';
import ColorContext from '../contexts/color';

const ColorBox2 = () => {
  const {
    state: { color, subcolor },
  } = useContext(ColorContext);

  return (
    <>
      <div
        style={{
          width: '64px',
          height: '64px',
          background: color,
        }}
      ></div>
      <div
        style={{
          width: '128px',
          height: '128px',
          background: subcolor,
        }}
      ></div>
    </>
  );
};

export default ColorBox2;

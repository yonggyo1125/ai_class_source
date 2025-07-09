import { useContext } from 'react';
import ColorContext from '../contexts/color';
const colors = ['red', 'black', 'blue', 'orange', 'yellow', 'skyblue', 'green'];

const SelectColors = () => {
  const {
    actions: { setColor, setSubcolor },
  } = useContext(ColorContext);
  return (
    <div>
      {colors.map((color, i) => (
        <span
          onClick={() => setColor(color)}
          onContextMenu={(e) => {
            e.preventDefault();
            setSubcolor(color);
          }}
          key={color + '-' + i}
          style={{
            width: '45px',
            height: '45px',
            background: color,
            cursor: 'pointer',
            display: 'inline-block',
          }}
        />
      ))}
    </div>
  );
};

export default SelectColors;

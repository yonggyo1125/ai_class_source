import { useContext } from 'react';
import ColorContext from '../contexts/color';

const ColorBox = () => {
  const value = useContext(ColorContext);
  return (
    <div
      style={{
        width: '64px',
        height: '64px',
        background: value.color,
      }}
    />
  );
};

// const ColorBox = () => {
//   return (
//     <ColorContext.Consumer>
//       {(value) => (
//         <div
//           style={{
//             width: '64px',
//             height: '64px',
//             background: value.color,
//           }}
//         />
//       )}
//     </ColorContext.Consumer>
//   );
// };

export default ColorBox;

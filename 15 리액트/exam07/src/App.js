import ColorBox from './components/ColorBox2';
//import ColorContext from './contexts/color';
import SelectColors from './components/SelectColors';
import { ColorProvider } from './contexts/color';

const App = () => {
  return (
    <ColorProvider>
      <ColorBox />
      <SelectColors />
    </ColorProvider>
  );
};

// const App = () => {
//   return (
//     <ColorContext.Provider value={{ color: 'red' }}>
//       <ColorBox />
//     </ColorContext.Provider>
//   );
// };

// import RenderPropsEx from './components/RenderPropsEx';

// const App = () => {
//   //return <ColorBox />;
//   return (
//     <RenderPropsEx>
//       {({color, ea}) => (
//         <h1>
//           color: {color}, ea: {ea}
//         </h1>
//       )}
//     </RenderPropsEx>
//   );
// };

export default App;
